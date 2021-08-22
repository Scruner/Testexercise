package projects.sortings;

import java.util.Arrays;

public class SortMerge {

  public static int[] mergeSort(int[] array) {
    int[] tmp;
    int[] currentSrc = array;
    int[] currentDest = new int[array.length];

    int size = 1;
    while (size < array.length) {
      for (int i = 0; i < array.length; i += 2 * size) {
        merge(currentSrc, i, currentSrc, i + size, currentDest, i, size);
      }
      tmp = currentSrc;
      currentSrc = currentDest;
      currentDest = tmp;

      size = size * 2;
      System.out.println(Arrays.toString(currentSrc));
    }
    return currentSrc;
  }

  private static void merge(
      int[] src1, int src1Start, int[] src2, int src2Start, int[] dest, int destStart, int size) {
    int index1 = src1Start;
    int index2 = src2Start;

    int src1End = Math.min(src1Start + size, src1.length);
    int src2End = Math.min(src2Start + size, src2.length);

    int iterationCount = src1End - src1Start + src2End - src2Start;

    for (int i = destStart; i < destStart + iterationCount; i++) {
      if (index1 < src1End && (index2 >= src2End || src1[index1] < src2[index2])) {
        dest[i] = src1[index1];
        index1++;
      } else {
        dest[i] = src2[index2];
        index2++;
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = {34, 5, 6, 3, 78, 90, 45, 12, 10, 11, 7, 87};
    System.out.println(Arrays.toString(arr));
    arr = mergeSort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
