public class HealthProfessional {
    private int ID;
    private String name;
    private String Position;

    // 默认构造函数
    public HealthProfessional() {
    }

    // 带参数的构造函数
    public HealthProfessional(int ID, String name, String Position) {
        this.ID = ID;
        this.name = name;
        this.Position = Position;
    }

    // 打印所有实例变量的方法
    public void printDetails() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Position: " + Position);
    }
}