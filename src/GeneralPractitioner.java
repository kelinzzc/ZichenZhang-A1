public class GeneralPractitioner extends HealthProfessional {
    private String specialty;

    // 默认构造函数
    public GeneralPractitioner() {
    }

    // 带参数的构造函数
    public GeneralPractitioner(int ID, String name, String basicInfo, String specialty) {
        super(ID, name, basicInfo);
        this.specialty = specialty;
    }

    // 打印健康专业人员详细信息的方法，包括类型
    @Override
    public void printDetails() {
        System.out.println("The health professional details are:");
        super.printDetails();
        System.out.println("Type: General Practitioner");
        System.out.println("Specialty: " + specialty);
    }

    public String getSpecialty() {
        return specialty;
    }
}