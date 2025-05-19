public class ExceptionWithBlocks {
    static void methodC() {
        // int a = 10 / 0; 
        System.out.println("MEthod C");
    }

    static void methodB() {
        System.out.println("Methob up");
        methodC();
        System.out.println("Method B");
    }

    static void methodA() {
        int a = 10 / 0;
        System.out.println("method a up");
        methodB(); // Not handled
        System.out.println("methodA");
    }
    public static void main(String[] args) {
        try{
            methodA(); // Handling is done here
        }
        catch(RuntimeException e){
            System.out.println("jhgi "+e);

        }
        System.out.println("remaining code runs");
    }
}


//Exception using throws keyword

// import java.io.*;
// public class ThrowsExample {

//     // This method throws IOException
//     static void methodC() throws IOException {
//         throw new IOException("Exception in methodC");
//     }

//     // methodB doesn't handle it, just declares it
//     static void methodB() throws IOException {
//         System.out.println("methodB start");
//         methodC(); // may throw IOException
//         System.out.println("methodB end"); // skipped if exception is thrown
//     }

//     // methodA also doesn't handle, so it declares it
//     static void methodA() throws IOException {
//         System.out.println("methodA start");
//         methodB(); // may throw IOException
//         System.out.println("methodA end"); // skipped if exception is thrown
//     }

//     // main handles the exception
//     public static void main(String[] args) {
//         try {
//             methodA(); // might throw IOException
//         } catch (IOException e) {
//             System.out.println("Caught in main: " + e);
//         }
//         System.out.println("Main continues after exception handling");
//     }
// }
