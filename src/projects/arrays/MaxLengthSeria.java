package projects.arrays;

public class MaxLengthSeria {

    public static int find(int[] array) {
        int last = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= last + 1) {
                count1++;
                count2 = Math.max(count2, count1);
            } else {
                count1 = 1;
            }
            last = array[i];
        }
        return Math.max(count2, count1);
    }

    public static void main(String[] args) {
        System.out.println(find(new int[]{1}));
        System.out.println(find(new int[]{2, 1}));
        System.out.println(find(new int[]{1, 2}));
        System.out.println(find(new int[]{1, 2, 0, 1, 2, 3}));
        System.out.println(find(new int[]{1, 2, 1, 1, 2, 3}));
        System.out.println(find(new int[]{3, 2, 1}));
    }
}
