public class StringValueOfTests {
    public static void main(String[] args) {
        int num = 10;

        //Case 1
        String str1 = num + "";
        System.out.println("str1 = " + str1);

        //Case 2
        String str2 = String.valueOf(num);
        System.out.println("str2 = " + str2);

        //valueOf() in Integer
        String numAsString = "100500";
        int result = num + Integer.valueOf(numAsString);
        System.out.println("result = " + result);
    }
}
