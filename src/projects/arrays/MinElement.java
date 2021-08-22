package projects.arrays;

public class MinElement {
    public static void main(String[] args) {
        int[] array = new int[]{64, 34, 73, 12, 34, 97, 23, 55, 19};
        System.out.println(smallestElementOfArray(array));
    }

    public static int smallestElementOfArray(int[] array) {
        int minValue = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minValue;
    }
}
