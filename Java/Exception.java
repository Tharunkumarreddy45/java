public class Exception {
// If an exception occur rest of the code in the try block won't execute whether the exception handled or not
// If the current exception is not handled inside nested finally blocks won't execute but outer nested finnally will be executed
// if the outer catch block suits the inner exception then the exception will be handled
    public static void main(String[] args) {
        // int a=10;
        // int b=0;
        // try{
        //     int res=a/b;
        //     System.out.println(res);
        //     System.out.println("After Exception");
        // }
        // // catch(ArithmeticException e){
        // //     System.out.println("Denominator Should not be zero"+e);
        // // }
        // finally{
        //     System.out.println("This is finally block");
        // }
        // System.out.println("sai");
        
    
        try {
            System.out.println("Outer try block");

            try {
                try{
                    System.out.println("In In");
                    int res = 102 / 0;
                    System.out.println("In out");
                    try{
                        int a=5/0;
                    }
                    finally{
                        System.out.println("This is main");
                    }
                }
                // catch (ArithmeticException e) {
                //     System.out.println("Innerrrrr catch: " + e);
                // }
                finally{
                    System.out.println("try try try");
                }
                System.out.println("In INOUT");
                System.out.println("In INOUT");
                System.out.println("In INOUT");
                int result = 10 / 0;
                System.out.println("In Hello");
            }
            // catch (ArithmeticException e) {
            //     System.out.println("Inner catch: " + e);
            // }
            
            finally{
                System.out.println("thai");
            }

            System.out.println("Hi");
            String str = null;
            System.out.println(str.length()); // NullPointerException
            System.out.println("Hello");
        }
        catch (NullPointerException e) {
            System.out.println("Outer catch: " + e);
        }
        finally{
            System.out.println("THARUN");
        }
    }
}
