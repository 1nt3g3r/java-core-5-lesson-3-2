public class ContinueTests {
    public static void main(String[] args) {
        //Case 1 - for loop
//        for(int i = 0; i <= 100; i++) {
//            if (i % 10 != 0) {
//                continue;
//            }
//
//            System.out.println("i = " + i);
//        }

        //Case 2 - while loop
        int i = -1;
        while (i <= 100) {
            i++;

            if (i % 10 != 0) {
                continue;
            }

            System.out.println("i = " + i);
        }
    }
}
