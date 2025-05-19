public interface Interfacee {
    //All the attributes inside the interface class is by default STATIC FINAL varibles
    static int num=55;
    public String name="bhai";
    public void methh();
    public static void main(String args[]){
        System.out.println(num);
        System.out.println(name);
    }
}

class Another implements Interfacee{
    public Boolean v=false;
    public void methh(){
        System.out.println("This is Interface method "+name+" and "+num);
    }
    public static void main(String args[]){
        Another obj= new Another();
        obj.methh();
        System.out.println(num+name+obj.v);

    }
}