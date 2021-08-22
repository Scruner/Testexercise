package projects.tests;

public class Recursion {

    public static void main(String[] args) {
        int val = calcSum(2, -2);
        System.out.println(val);
        System.out.println(factorial(4));
    }

    static int calcSum(int a, int b) {
        int sum = a + b;
        if (sum == 0) {
            sum = calcSum(3, 4);
        }
        return sum;
    }

    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
