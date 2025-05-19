public class Staticc{
    // static variables can accessed only in a static way.
    // static method can only access static methods or attributes without creating an object
    // public methods can also access static methods without creating objects
    // public static int a=50;
    // static int aa=100;
    // int nums[];
    // static void main(){
    //     System.out.println("Static method");
    // }
    // public int methodd(){
    //     aa=10;
    //     nums=new int[5];
    //     main();
    //     for(int i=0;i<nums.length;i++){
    //         nums[i]=(int)(Math.random()*100);
    //     }
    //     return a;
    // }
    // public static void main(String args[]){
    //     System.out.println(a);
    //     Staticc obj=new Staticc();
    //     obj.methodd();
    //     for(int i=0;i<obj.nums.length;i++){
    //         System.out.print(obj.nums[i]+ " ");
    //     }
        
    //     System.out.println(aa);
    // }
    


    int a = 40; // non-static variable

    public static void main(String args[]) {  
        Staticc obj = new Staticc();         // creating object of class A
        System.out.println(obj.a);  // accessing non-static variable using object
    }  


}