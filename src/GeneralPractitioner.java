public class GeneralPractitioner extends HealthProfessional {
    private String WorkPlace;

    // 默认构造函数
    public GeneralPractitioner() {
    }

    // 带参数的构造函数
    public GeneralPractitioner(int ID, String name, String Position, String WorkPlace) {
        super(ID, name, Position);
        this.WorkPlace = WorkPlace;
    }

    // 打印健康专业人员详细信息的方法，包括类型
    @Override
    public void printDetails() {
        System.out.println("The health professional details are:");
        super.printDetails();
        System.out.println("Type: General Practitioner");
        System.out.println("Work Place: " + WorkPlace);
    }
}