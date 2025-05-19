public class ElementsObjects {
    int id;
    String name;
    char grade;
    boolean res;

    public ElementsObjects(int id1, String name1, char grade1, boolean res1){
        id=id1;
        name=name1;
        grade=grade1;
        res=res1;
    }
    public void metthodd(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(grade);
        System.out.println(res);
    }
    public static void main(String args[]){
        ElementsObjects obj=new ElementsObjects(55,"Tharun",'C',true);
        obj.metthodd();
        // System.out.println(obj.id);
        // System.out.println(obj.name);
        // System.out.println(obj.grade);
        // System.out.println(obj.res);
    }
}
