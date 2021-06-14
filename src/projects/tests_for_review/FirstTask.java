package projects.tests_for_review;

public class FirstTask {

    public static void main(String[] args) {
        String st = "Задача1";
        StringBuilder stB = new StringBuilder();
        stB.append(st);
        // используем StringBuilder для переворота строки
        stB = stB.reverse();
        System.out.println(stB);
    }
}


