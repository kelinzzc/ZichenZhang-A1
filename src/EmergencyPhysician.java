public class EmergencyPhysician extends HealthProfessional {
    private String ProfessionalTitle;

    // 默认构造函数
    public EmergencyPhysician() {
    }

    // 带参数的构造函数
    public EmergencyPhysician(int ID, String name, String Position, String ProfessionalTitle) {
        super(ID, name, Position);
        this.ProfessionalTitle = ProfessionalTitle;
    }

    // 打印健康专业人员详细信息的方法，包括类型
    @Override
    public void printDetails() {
        System.out.println("The health professional details are:");
        super.printDetails();
        System.out.println("Type: Specialist");
        System.out.println("Professional Title: " + ProfessionalTitle);
    }
}