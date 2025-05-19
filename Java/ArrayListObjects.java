import java.util.ArrayList;

class Student{
    String fname;
    String lname;
    int Id;
    int marks;

    public Student(String fname, String lname, int Id, int marks){
        this.fname=fname;
        this.lname=lname;
        this.Id=Id;
        this.marks=marks;
    }
}

public class ArrayListObjects {
    public static void main(String[] args) {
        ArrayList<Student> arr=new ArrayList<>();
        Student s1=new Student("sai","kumar",16,83);
        Student s2=new  Student("Tharun","Kumar",55,80);
        arr.add(s1);
        arr.add(s2);

        // System.out.println(arr.get(0).fname);
        for (Student s: arr){
            System.out.print("Id "+s.Id+" Full Name "+s.fname+" "+s.lname+" got "+s.marks+" marks");
            System.out.println();
        }
        Student obj=arr.get(0);
        obj.lname="reddy";
        for (Student s: arr){
            System.out.print("Id "+s.Id+" Full Name "+s.fname+" "+s.lname+" got "+s.marks+" marks");
            System.out.println();
        }
    }
}
