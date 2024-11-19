public class EmergencyPhysician extends HealthProfessional {
    private String ProfessionalTitle;

    // Default constructor
    public EmergencyPhysician() {
    }

    // A constructor with arguments
    public EmergencyPhysician(int ID, String name, String Position, String ProfessionalTitle) {
        super(ID, name, Position);
        this.ProfessionalTitle = ProfessionalTitle;
    }

    // A method to print all instance variables
    @Override
    public void printDetails() {
        System.out.println("The health professional details are:");
        super.printDetails();
        System.out.println("Type: Specialist");
        System.out.println("Professional Title: " + ProfessionalTitle);
    }
}