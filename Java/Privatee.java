public class Privatee {
    private String name;  // private variable
    private int methodd(){    // private method
        return 10;
    }

    public static void main(String[] args) {
        Privatee obj = new Privatee();
        // Staticc obj1=new Staticc();
        // System.out.println(Staticc.a);
        // obj1.methodd();
        // System.out.println(obj1.aa);
        System.out.println(obj.name);
        obj.name="hello";
        System.out.println(obj.name);
        System.out.println(obj.methodd());
    }
}
