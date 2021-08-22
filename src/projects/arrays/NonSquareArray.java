package projects.arrays;

public class NonSquareArray {

    public static void main(String[] args) {
        int[][] array = new int[][]{{1}, {2, 3}, {4, 5, 6}};
        for (int[] ints : array) {
            System.out.println(ints.length);
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }
}
