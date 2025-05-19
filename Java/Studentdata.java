// import java.util.Scanner;
// public class Normal {
//     public static void main(String[] args) {
//         int x,y,res,num;
//         String str;
//         char ch;
//         Scanner obj =new Scanner(System.in);


//         //WORKING WITH AN ARRAYS
//         int[] arr=new int[5];

//         for (int i=0;i<5;i++){
//             System.out.print(arr[i]+" ");
//         }
//         for (int i=0;i<5;i++){
//             x=obj.nextInt();
//             arr[i]=x;
//         }
//         for (int i=0;i<5;i++){
//             System.out.print(arr[i]+" ");
//         }
        
        
//         //printing 2 number by taking input from user
//         x=obj.nextInt();
//         y=obj.nextInt();
//         res=x+y;
//         System.out.println("sum is " +res);


//         //ASCII TO NUMBER(int) and VICE-VERSA
//         ch=obj.nextLine().charAt(0);  //Reading char from the user
//         x=(int)(ch);
//         System.out.println(x);
//         num=obj.nextInt();
//         ch=(char)(num);
//         System.out.println(ch);


//         //Reading string from the user 
//         str=obj.nextLine();
//         System.out.println(str);
//         for (int i =0;i<str.length();i++){
//             System.out.print(str.charAt(i)+ " ");  //printing characters from a string
//         }
//     }
// }


import java.util.*;

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

public class Studentdata{
    public static void main( String args[]){
        HashMap<Integer, Student> Dict=new HashMap<Integer, Student>();
        Scanner obj=new Scanner(System.in);
        System.out.println("Number of Students");
        int n=obj.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println("Enter First name: ");
            String fname=obj.next();
            System.out.println("Enter Last Name: ");
            String lname=obj.next();
            System.out.println("Entre the ID: ");
            int Id=obj.nextInt();
            System.out.println("Enter the Marks: ");
            int marks=obj.nextInt();

            Student s=new Student(fname, lname, Id, marks);
            Dict.put(Id,s);
        }

        System.out.println(Dict.get(16));
        System.out.println(Dict.get(55));
        System.out.println("Enter the Id to retrive the details: ");
        int c=obj.nextInt();
        Student data=Dict.get(c);
        System.out.println(data.fname);
        System.out.println(data.lname);
        System.out.println(data.Id);
        System.out.println(data.marks);

        obj.close();
    }
}



        // CHATGPT CODE
        
// import java.util.HashMap;
// import java.util.Scanner;

// // STEP 1: Student class with four fields
// class Student {
//     String fname;      // First name
//     String lname;      // Last name
//     int id;            // Student ID (used as a key)
//     double marks;      // Student marks

//     // Constructor to initialize object fields
//     public Student(String fname, String lname, int id, double marks) {
//         this.fname = fname;
//         this.lname = lname;
//         this.id = id;
//         this.marks = marks;
//     }

//     // Method to display student info
//     public void display() {
//         System.out.println("ID    : " + id);
//         System.out.println("Name  : " + fname + " " + lname);
//         System.out.println("Marks : " + marks);
//     }
// }

// // STEP 2: Main class with data input and retrieval logic
//  class StudentDatabase {
//     public static void main(String[] args) {

//         // Create a Scanner for user input
//         Scanner sc = new Scanner(System.in);

//         // HashMap to store students with their ID as the key
//         HashMap<Integer, Student> studentMap = new HashMap<>();

//         // Ask user how many students to enter
//         System.out.print("Enter number of students: ");
//         int n = sc.nextInt(); // User inputs the total number of students

//         // Loop to input student data
//         for (int i = 0; i < n; i++) {
//             System.out.println("\nEnter details for Student " + (i + 1));

//             System.out.print("First Name: ");
//             String fname = sc.next();

//             System.out.print("Last Name: ");
//             String lname = sc.next();

//             System.out.print("ID: ");
//             int id = sc.nextInt();

//             System.out.print("Marks: ");
//             double marks = sc.nextDouble();

//             // Create Student object with user input
//             Student s = new Student(fname, lname, id, marks);

//             // Store student in HashMap using ID as the key
//             studentMap.put(id, s);
//         }

//         // STEP 3: Retrieve student by ID
//         System.out.print("\nEnter ID to search: ");
//         int searchId = sc.nextInt();  // User inputs the ID to search

//         // Check if ID exists in the HashMap
//         if (studentMap.containsKey(searchId)) {
//             System.out.println("\nStudent Details:");
//             Student foundStudent = studentMap.get(searchId); // Fetch the student object
//             foundStudent.display(); // Call display method to print details
//         } else {
//             System.out.println("❌ Student with ID " + searchId + " not found.");
//         }

//         sc.close(); // Close the scanner
//     }
// }
