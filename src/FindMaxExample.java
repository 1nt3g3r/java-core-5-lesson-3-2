public class FindMaxExample {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;

        System.out.println(max(a, b));
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}
