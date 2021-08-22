package projects.tests;

public class Numbers {

    public static int[] gegerateNumbers() {
        int[] array = new int[0];
        for (int i = 0; i <= 99; i++) {
            System.out.println(i);
        }
        return array;
    }

    public static int findBiggest(int left, int right) {
        if (left > right) {
            return left;
        } else if (left < right) {
            return right;
        } else {
            return left;
        }
    }

    public static int findBiggest(int left, int mid, int right) {
        if (findBiggest(left, right) > mid) {
            return findBiggest(left, right);
        } else if (findBiggest(left, right) < mid) {
            return mid;
        } else {
            return findBiggest(left, right);
        }
    }

    public static int findBiggest(int[] numbers) {
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static char[] convertToCharArray(int number) {
        int count = 0;
        int posit = 0;
        int doublicate = number;
        boolean isNegatNum = isNegative(number);
        if (number == 0) {
            return new char[]{'0'};
        }
        if (isNegatNum) {
            count++;
            number = -number;
        }
        while (doublicate != 0) {
            doublicate /= 10;
            count++;
        }
        char[] arrChar = new char[count];
        for (int i = 0; i < arrChar.length; i++) {
            posit = number % 10;
            number /= 10;
            arrChar[count - 1 - i] = (char) (posit + 48);
        }
        if (isNegatNum) {
            arrChar[0] = '-';
        }
        return arrChar;
    }
}

