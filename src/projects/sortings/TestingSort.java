package projects.sortings;

import java.util.concurrent.TimeUnit;

public class TestingSort {

private static void test1() {
    int testLen = 100000000;

    int[] arr1 = new int[testLen];
    int[] arr2 = new int[testLen];

    System.out.println("\n-----Случайный массив-----");

    for (int i = 0; i < testLen; i++) {
        arr2[i] = arr1[i] = (int)Math.round(Math.random() * 10000);
    }
    System.out.println("Быстрая сортировка");
   // TimeUnit.SECONDS(() -> SortQuickVar1.quickSort(arr1, 0, testLen - 1));

    System.out.println("Сортировка слиянием");
   // measureTime(() -> SortMerge.mergeSort(arr2));


}
}
