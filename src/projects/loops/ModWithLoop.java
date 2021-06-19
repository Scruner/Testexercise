package projects.loops;

public class ModWithLoop {

    public static int mod(int n, int d) {
        int remainder = 0;
        while (n - d >= 0) {
            n = n - d;
            if (n < d) {
                remainder = n;
            }
        }
        return remainder;
    }
}
