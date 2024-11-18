public class Specialist extends HealthProfessional {
    private String field;

    // 默认构造函数
    public Specialist() {
    }

    // 带参数的构造函数
    public Specialist(int ID, String name, String basicInfo, String field) {
        super(ID, name, basicInfo);
        this.field = field;
    }

    // 打印健康专业人员详细信息的方法，包括类型
    @Override
    public void printDetails() {
        System.out.println("The health professional details are:");
        super.printDetails();
        System.out.println("Type: Specialist");
        System.out.println("Field: " + field);
    }

    public String getField() {
        return field;
    }
}