package projects.sortings;

import javax.naming.PartialResultException;
import java.util.Arrays;

public class SortBubble {

    public static void sort(int[] target) {
        boolean flag = true;
        while (flag) {
            flag = false;
        for (int i = 0; i < target.length - 1; i++) {
            if (target[i] > target[i + 1]) {
                flag = true;
                int temp = target[i];
                target[i] = target[i + 1];
                target[i + 1] = temp;
            }
        }
    }
        System.out.println(Arrays.toString(target));
}


public static void main(String[]args){
        int[]arr=new int[]{23,4,45,56,2,78,9,34,9};
        sort(arr);
        }
        }
