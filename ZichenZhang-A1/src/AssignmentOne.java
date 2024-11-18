import java.util.ArrayList;

public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 - Using classes and objects
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Smith", "General Practice", "Family Medicine");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Johnson", "General Practice", "Internal Medicine");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Brown", "General Practice", "Pediatrics");
        Specialist sp1 = new Specialist(4, "Dr. Lee", "Specialty", "Cardiology");
        Specialist sp2 = new Specialist(5, "Dr. Wang", "Specialty", "Neurology");

        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        sp1.printDetails();
        sp2.printDetails();
        System.out.println("------------------------------");

        // Part 5 - Collection of appointments
        ArrayList<Appointment> appointments = new ArrayList<>();

        // 创建预约的方法
        createAppointment(appointments, "John Doe", "1234567890", "09:00", gp1);
        createAppointment(appointments, "Jane Smith", "0987654321", "10:30", gp2);
        createAppointment(appointments, "Bob Johnson", "1112223333", "14:00", sp1);
        createAppointment(appointments, "Alice Brown", "4445556666", "15:30", sp2);

        // 打印现有预约的方法
        printExistingAppointments(appointments);

        // 取消预约的方法
        cancelBooking(appointments, "1234567890");

        // 再次打印现有预约以展示更新后的预约集合
        printExistingAppointments(appointments);
    }

    // 创建预约并添加到ArrayList的方法
    public static void createAppointment(ArrayList<Appointment> appointments, String patientName, String mobilePhone, String preferredTimeSlot, HealthProfessional doctor) {
        Appointment appointment = new Appointment(patientName, mobilePhone, preferredTimeSlot, doctor);
        appointments.add(appointment);
    }

    // 打印现有预约的方法
    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("There are no existing appointments.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printDetails();
                System.out.println("------------------------------");
            }
        }
    }

    // 取消预约的方法
    public static void cancelBooking(ArrayList<Appointment> appointments, String mobilePhone) {
        for (Appointment appointment : appointments) {
            if (appointment.getMobilePhone().equals(mobilePhone)) {
                appointments.remove(appointment);
                System.out.println("Booking cancelled successfully.");
                return;
            }
        }
        System.out.println("Mobile phone not found in existing appointments.");
    }
}