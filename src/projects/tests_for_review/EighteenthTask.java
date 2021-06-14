package projects.tests_for_review;

public class EighteenthTask {

    public static void main(String[] args) {
        String st1 = "Мы готовимся к интервью на вакансию Java разработчика";
        //Используем метод replaceAll()
        String st2 = st1.replaceAll("\\s", "");
        System.out.println(st2);
    }
}
