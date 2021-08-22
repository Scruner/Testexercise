package projects.arrays;

public class SquareArray {

    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2}, {3, 4}};
        for (int[] ints : array) {
            for (int anInt:ints) {
                System.out.println(anInt);
            }
        }
    }
}
