package projects.arrays;

public class firstElementOfArray {

    public static int firstElementOfArrayMethod(int[] arr) {
        return arr[0];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 5, 1, 4};
        System.out.println(firstElementOfArrayMethod(arr));
    }
}
