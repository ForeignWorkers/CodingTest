package minquu;

public class CodeTest031701 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
                int temp = (n - i);
                result += temp;
        }
        return result;
    }
}