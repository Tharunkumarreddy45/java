public class Protectedd {
    int age;
    String name;
    public void meth(){
        name="Tharun";
        age=552;
        System.out.println("My Name is "+name+ " and my age is "+age);
    }
    public static void main(String args[]){
        Protectedd obj=new Protectedd();
        System.out.println(obj.age);
        System.out.println(obj.name);
        obj.meth();
        System.out.println(obj.age);
        System.out.println(obj.name);
    }
}

class Protectedd1 extends Protectedd{
    char a='@';
    public static void main(String args[]){
        Protectedd1 obj2=new Protectedd1();
        obj2.meth();
        System.out.println(obj2.a);
        System.out.println(obj2.age);
        System.out.println(obj2.name);
    }
}