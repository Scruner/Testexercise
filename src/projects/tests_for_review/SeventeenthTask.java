package projects.tests_for_review;

public class SeventeenthTask {

    public static void main(String[] args) {
        int y = 0, x, tempNumber;
        //Данное число мы будем проверять на то, является ли оно числом Армстронга
        int qurentNumber = 371;
        tempNumber = qurentNumber;
        while (qurentNumber > 0) {
            x = qurentNumber % 10;
            qurentNumber = qurentNumber / 10;
            y = y + (x * x * x);
        }
        if (tempNumber == y)
            System.out.println("Данное число является числом Армстронга");
        else
            System.out.println("Данное число не является числом Армстронга");
    }
}
