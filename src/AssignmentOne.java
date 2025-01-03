import java.util.ArrayList;
import java.util.Scanner;

public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 - Using classes and objects
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Pan", "General Practice", "Ginkgo Avenue");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Chen", "General Practice", "Starlight Pedestrian Street");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Zhang", "General Practice", "Good-neighborly Old street");
        EmergencyPhysician ep1 = new EmergencyPhysician(4, "Dr. Lee", "Emergency Physician", "expert");
        EmergencyPhysician ep2 = new EmergencyPhysician(5, "Dr. Wang", "Emergency Physician", "DIRECTOR");

        System.out.println("Doctor information:");
        gp1.printDetails();
        System.out.println("------------------------------");
        gp2.printDetails();
        System.out.println("------------------------------");
        gp3.printDetails();
        System.out.println("------------------------------");
        ep1.printDetails();
        System.out.println("------------------------------");
        ep2.printDetails();
        System.out.println("------------------------------");

        // Part 5 - Collection of appointments
        ArrayList<Appointment> appointments = new ArrayList<>();

        // Add patient Information
        createAppointment(appointments, "Jack", "1234567890", "09:00", gp1);
        createAppointment(appointments, "Make", "0987654321", "10:30", gp2);
        createAppointment(appointments, "Bob", "1112223333", "14:00", ep1);
        createAppointment(appointments, "Alice", "4445556666", "15:30", ep2);

        while (1 < 10){
            System.out.println("Enter 1 to display all reservations and 2 to delete reservations");
            Scanner in = new Scanner(System.in);
            int re = in.nextInt();
            if (re == 1){
                printExistingAppointments(appointments);
            } else if (re == 2) {
                System.out.println("Enter the deleted phone number.");
                String number = String.valueOf(in.nextInt());
                cancelBooking(appointments, number);
                System.out.println("Show all appointments again.");
                printExistingAppointments(appointments);
            }
        }
    }


    // Definition Add patient information
    public static void createAppointment(ArrayList<Appointment> appointments, String patientName, String ContactInformation, String preferredTimeSlot, HealthProfessional doctor) {
        Appointment appointment = new Appointment(patientName, ContactInformation, preferredTimeSlot, doctor);
        appointments.add(appointment);
    }

    // Define print all appointments
    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("There are no appointments.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printDetails();
                System.out.println("------------------------------");
            }
        }
    }

    // Define Cancellation
    public static void cancelBooking(ArrayList<Appointment> appointments, String ContactInformation) {
        for (Appointment appointment : appointments) {
            if (appointment.getContactInformation().equals(ContactInformation)) {
                appointments.remove(appointment);
                System.out.println("Booking cancelled successfully.");
                return;
            }
        }
        System.out.println("This reservation is not available.");
    }
}