public class Appointment {
    private String patientName;
    private String ContactInformation;
    private String preferredTimeSlot;
    private HealthProfessional doctor;

    // Default constructor
    public Appointment() {
    }

    // A constructor with arguments
    public Appointment(String patientName, String ContactInformation, String preferredTimeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.ContactInformation = ContactInformation;
        this.preferredTimeSlot = preferredTimeSlot;
        this.doctor = doctor;
    }

    // A method to print all instance variables
    public void printDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Contact information: " + ContactInformation);
        System.out.println("Preferred Time Slot: " + preferredTimeSlot);
        System.out.println("Doctor Details:");
        doctor.printDetails();
    }

    public String getContactInformation() {
        return ContactInformation;
    }

}