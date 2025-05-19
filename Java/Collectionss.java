import java.util.*;
// import java.col

public class Collectionss {
    public static void main(String args[]){
        //ArrayList
        ArrayList<Integer> nums=new ArrayList<Integer>();
        nums.add(28);
        nums.add(16);
        nums.add(55);
        nums.add(33);
        nums.add(55);
        nums.add(35);  //adding element at the end of an ArrayList
        System.out.println(nums);
        for (int i: nums){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(nums.size());  //To find the length
        nums.add(2,57);  //adding an element at particular index
        nums.remove(4);  //remove an element by index number
        nums.set(3,5516);  //update a value at particular index
        Collections.sort(nums, Collections.reverseOrder());  //sorting in descending order
        Collections.sort(nums);  //sorting in ascending order
        for (int j=0; j<nums.size();j++){
            System.out.print(nums.get(j)+" ");
        }
        nums.clear();  //deleting all the elements in an ArarayList 
        System.out.println(nums.size());


        //Hashmap
        HashMap<Integer,String> Dict = new HashMap<Integer,String>();
        Dict.put(1,"Tharun");
        Dict.put(2,"sai");
        Dict.put(3,"Bhai");  //Adding the key values to a hashmap
        Dict.put(16,"Bablu");
        Dict.put(16,"Killer");
        System.out.println(Dict);
        for (int k: Dict.keySet()){
            System.out.println("key "+k+ " and Value is "+Dict.get(k));
        }
        System.out.println(Dict.size());  //Hashmap Size
        Dict.remove(2);  //Removing the key-value pair
        for (String str:Dict.values()){
            System.out.print(str+ " ");
        }
        System.out.println();
        for (int n: Dict.keySet()){
            System.out.println(n+" "+Dict.get(n));
        }
        Dict.put(3,"Charan");  //To update the value of the key in the hashmap
        for (int n: Dict.keySet()){
            System.out.println(n+" "+Dict.get(n));
        }
        Dict.clear();
        System.out.println(Dict.size());   
        



        // HashSet
        HashSet<String> Sset=new HashSet<String>();
        Sset.add("Sai");
        Sset.add("Tharun");
        Sset.add("Bhai");  //adding an element
        Sset.add("Hello");
        Sset.add("Hello");
        System.out.println(Sset);
        int s=Sset.size();  // To get the length
        System.out.println(s);
        Sset.add("hi");
        for (String str1:Sset){
            System.out.print(str1+ " ");
        }
        System.out.println();
        System.out.println(Sset.contains("Sai"));  // TO check whether the element is available or not
        Sset.remove("Sai");  // To remove an element 
        System.out.println(Sset.contains("Sai"));
        Sset.clear();  //To clear the hashset
        for (String str1:Sset){
            System.out.print(str1+ " ");
        }
    }
}
