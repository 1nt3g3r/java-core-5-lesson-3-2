public class ReturnForLoopTests {
    public static void main(String[] args) {
        //1 + 2 + 3 + 4 = 10
        System.out.println("sumNumbers(4) = " + sumNumbers(4));
    }

    public static int sumNumbers(int n) {
        int sum = 0;
        int index = 1;

        for(;;) {
            for(;;) {
                for(;;) {
                    for(;;) {
                        while (true) {
                            sum += index;

                            index++;

                            if (index > n) {
                                return sum;
                            }
                        }
                    }
                }
            }
        }


    }
}
