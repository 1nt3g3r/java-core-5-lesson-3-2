import java.util.Scanner;

public class ForWithIndexTests {
    public static void main(String[] args) {
        //Case 1 - basic for, only one time executed
        //1 - Init
        //2 - Loop check
        //3 - After end of loop
//        for(int i = 0; i < 1;i++) {
//            //Loop body
//            System.out.println("Inside loop, i = " + i);
//        }

        //Case 2 - Endless loop
//        for(;;) {
//            System.out.println("Endless loop");
//        }

        //Case 3 - password
//       passwordSwordfish();

        //Case 4 - execute n times
//        int executeCount = new Scanner(System.in).nextInt();
//        for(int i = 0; i < executeCount; i++) {
//            System.out.println("Execute code, i = " + i);
//        }

//        for(;executeCount > 0; executeCount--) {
//            System.out.println("Execute loop, executeCount = " + executeCount);
//        }

//        for(;;) {
//            System.out.println("Execute loop, executeCount = " + executeCount);
//
//            executeCount--;
//            if (executeCount <= 0) {
//                break;
//            }
//        }


        //Case 5 - incorrect loop
//        for(int i = 0; i < 5; i--) {
//            System.out.println("i: " + i);
//        }

        //Case 5 - FizzBuzz
        //Print numbers from 1 to 100 inclusive.
        //If number divides on 3 - print Fizz, if divides on 5 - print Buzz, if divides on 3 and 5 - print FizzBuzz
//        for(int i = 1; i <= 100; i++) {
//            if (i%3 == 0 && i%5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i%3 == 0) {
//                System.out.println("Fizz");
//            } else if (i%5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println("i = " + i);
//            }
//        }

        //Alternate FizzBuzz implementation
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0) System.out.print("Fizz");
//            if (i % 5 == 0) System.out.print("Buzz");
//            System.out.println("\ti = " + i + "\n");
//        }
    }

    public static void passwordSwordfish() {
        Scanner scanner = new Scanner(System.in);

        int tryCount = 0;

        for(;;) {
            System.out.println("Enter password:");
            String password = scanner.nextLine();

            if (password.equalsIgnoreCase("Swordfish")) {
                System.out.println("Congratulations!");
                break;
            } else {
                System.out.println("Wrong password, try again");

                tryCount++;

                if (tryCount == 3) {
                    System.out.println("Too many incorrect passwords");
                    break;
                }
            }
        }

        scanner.close();
    }


}
