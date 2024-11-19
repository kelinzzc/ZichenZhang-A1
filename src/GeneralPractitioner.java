public class GeneralPractitioner extends HealthProfessional {
    private String WorkPlace;

    // Default constructor
    public GeneralPractitioner() {
    }

    // A constructor with arguments
    public GeneralPractitioner(int ID, String name, String Position, String WorkPlace) {
        super(ID, name, Position);
        this.WorkPlace = WorkPlace;
    }

    // A method to print all instance variables
    @Override
    public void printDetails() {
        System.out.println("The health professional details are:");
        super.printDetails();
        System.out.println("Type: General Practitioner");
        System.out.println("Work Place: " + WorkPlace);
    }
}