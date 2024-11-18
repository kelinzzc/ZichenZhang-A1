import java.util.ArrayList;

public class Appointment {
    private String patientName;
    private String mobilePhone;
    private String preferredTimeSlot;
    private HealthProfessional doctor;

    // 默认构造函数
    public Appointment() {
    }

    // 带参数的构造函数
    public Appointment(String patientName, String mobilePhone, String preferredTimeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.preferredTimeSlot = preferredTimeSlot;
        this.doctor = doctor;
    }

    // 打印所有实例变量的方法
    public void printDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Mobile Phone: " + mobilePhone);
        System.out.println("Preferred Time Slot: " + preferredTimeSlot);
        System.out.println("Doctor Details:");
        doctor.printDetails();
    }

    public String getPatientName() {
        return patientName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getPreferredTimeSlot() {
        return preferredTimeSlot;
    }

    public HealthProfessional getDoctor() {
        return doctor;
    }
}