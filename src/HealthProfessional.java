public class HealthProfessional {
    private int ID;
    private String name;
    private String Position;

    // Default constructor
    public HealthProfessional() {
    }

    // A constructor with arguments
    public HealthProfessional(int ID, String name, String Position) {
        this.ID = ID;
        this.name = name;
        this.Position = Position;
    }

    // A method to print all instance variables
    public void printDetails() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Position: " + Position);
    }
}