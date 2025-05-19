import java.util.Scanner;

class Questions {
    private int qid;
    String Question;
    String option1;
    String option2;
    String option3;
    String option4;
    int answer;

    public Questions(int qid, String Question, String option1, String option2, String option3, String option4,int answer) {
        this.qid = qid;
        this.Question = Question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;

    }

    public int getid(){
        return qid;
    }
}

public class Project1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Questions[] question=new Questions[5];
        int[] useranswers=new int[5];

        question[0] = new Questions(1, "int size ?", "2", "3", "4", "6", 4);
        question[1] = new Questions(2, "char size ?", "2", "3", "4", "6", 2);
        question[2] = new Questions(3, "float size ?", "2", "3", "4", "6", 4);
        question[3] = new Questions(4, "double size ?", "2", "3", "4", "8", 8);
        question[4] = new Questions(5, "who many question have you answerd correctly ?", "1", "2", "3", "4", 3);
        
        int i=0;
        for (Questions q:question){
            System.out.println(q.getid());
            System.out.println(q.Question);
            System.out.println(q.option1);
            System.out.println(q.option2);
            System.out.println(q.option3);
            System.out.println(q.option4);
            System.out.print("Enter the Answer: ");
            useranswers[i]=s.nextInt();
            i++;
        }
        
        for(int ii:useranswers){
            System.out.println(ii);
        }
        s.close();
    }
}
