// We cannot be able to create objects for Abstract classes. but we can access the static attributes and methods.
public abstract class Abstractt{
    final int num=16;
    static String name="Sai";
    public abstract void abmetho();
    public void metho(){
        System.out.println("Method inside Abstract class created by "+name);
    }
    public static void main(String args[]){
        System.out.println(name);
    }
}

class Ab extends Abstractt{
    public void abmetho(){
        System.out.println("This is Abstract Method "+num);
    }
    static Boolean value= true;
    public static void main(String args[]){
        Ab obj = new Ab();
        obj.metho();
        obj.abmetho();
        System.out.println(obj.num);
        System.out.println(name);
        System.out.println(value);
    }
}