class Metho{
    private String name="sai";
    private int age=24;
    int num=5516;
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

}
public class Practice {
    public static void main(String[] args) {
        Metho obj=new Metho();
        Metho obj1=new Metho();
        obj.setAge(16);
        obj.setName("Raghu");
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj1.getName());
        System.out.println(obj1.getAge());
    }
}