package projects.arrays;

import java.util.Arrays;

public class SummingPrevious {

    public static int[] calculate(int a, int b, int n) {
        int[] array = new int[n];
        array[0] = a;
        array[1] = b;
        int s = a + b;
        for (int i = 2; i < n; i++) {
            array[i] = s;
            s *= 2;
        }
        return array;
    }
}
