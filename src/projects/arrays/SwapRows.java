package projects.arrays;

import java.util.Arrays;

public class SwapRows {

    public static void swap(int[][] data, int src, int dst) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length - 1; j++) {
                int[] tmp = data[i];
                data[i] = data[j];
                data[j] = tmp;
            }
        }
        System.out.println(Arrays.deepToString(data));
    }

    public static void main(String[] args) {
        int[][] array = new int[][] {
                {4, 5, 6},
                {1, 2, 3}
        };
       swap(array,0, 1);
    }
}
