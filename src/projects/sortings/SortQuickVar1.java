package projects.sortings;

import java.util.Arrays;

public class SortQuickVar1 {

  public static void quickSort(int[] array, int minEl, int maxEl) {
    if (array.length == 0) {
      /*Если длина массива равна 0, завершаем выполнение метода*/
      return;
    }
    if (minEl >= maxEl) {
      /*Если минимальный элемент становится равным или больше максимальному, то есть разделить отрезок уже
       *невозможно, завершаем выполнение метода*/
      return;
    }
    /*Выбираем опорный элемент по этой формуле*/
    int middle = minEl + (maxEl - minEl) / 2;
    int opora = array[middle];
    int i = minEl;
    int j = maxEl;
    /*Делим на подмассивы, а в подмассивах сравниваем каждый их элемент с опорным элементом*/
    while (i <= j) {
      while (array[i] < opora) {
        i++;
      }
      while (array[j] > opora) {
        j--;
      }
      /*Если элемент левого подмассива больше опорного элемента, то элементы из правого и левого подмассива
       * меняются местами. И такая замена происходит, пока все элементы не распределятся таким образом, чтобы
       * слева от опорного элемента находились только те элементы, которые меньше опорного, а справа только те,
       * которые больше опорного*/
      if (i <= j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        i++;
        j--;
      }
    }
    /*Вызов рекурсии для сортировки левой и правой части. Внутри подмассивов происходит такая же сортировка, как и
     * происходила в изначальном массиве. Находится опорный элемент, который делит подмассив на две части
     * (подподмассивы) и элементы с левой и правой части заменяются, если элемент из левой больше опорного, а из
     * правой меньше опорного*/
    if (minEl < j) {
      quickSort(array, minEl, j);
    }
    if (maxEl > i) {
      quickSort(array, i, maxEl);
    }
  }

  public static void main(String[] args) {
    int massive[] = new int[10];
    for (int i = 0; i < massive.length; i++) {
      /*Рандомно заполняется массив*/
      massive[i] = (int) (Math.random() * 10);
    }
    System.out.println("Исходный массив " + Arrays.toString(massive));
    /*Создаются минимальная и максимальная переменные*/
    int minEl = 0;
    int maxEl = massive.length - 1;
    /*Вызывается метод quickSort(), в который передаётся массив и две переменные (минимальная и максимальная) */
    quickSort(massive, minEl, maxEl);
    System.out.println("Отсортированный массив " + Arrays.toString(massive));
  }
}
