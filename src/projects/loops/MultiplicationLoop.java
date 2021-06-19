package projects.loops;

public class MultiplicationLoop {

    public static int mult(int a, int b) {
        int count = a;
        for (int i = a; i <= b; i++) {
            count = count * i;
        }
        return count;
    }
}
