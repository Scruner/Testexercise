package projects.arrays;

public class CheckSquareArray {

    public static boolean checkArray(int[][] array) {
        boolean rsl = true;
        int standard = array.length;
        for (int[] ints : array) {
            if (ints.length != standard) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
