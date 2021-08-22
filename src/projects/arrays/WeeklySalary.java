package projects.arrays;

public class WeeklySalary {

    public static int calculate(int[] hours) {
        int[] arrWorkDay = new int[24];
        int[] arrDayOff = new int[24];
        for (int i = 0; i < arrWorkDay.length - 1; i++) {
            while (i <= 8) {
                arrWorkDay[i] = 10;
            }
        }
        return 0;
    }
}
