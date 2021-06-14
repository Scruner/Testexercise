package projects.tests_for_review;

public class NineteenthTask {

    public static void main(String[] args) {
        String st1 = " Мы готовимся к интервью на вакансию Java разработчика";
        char[] charsArray = st1.toCharArray();
        StringBuffer strB = new StringBuffer();
        for (int i = 0; i < charsArray.length; i++) {
            if ((charsArray[i] != ' ') && (charsArray[i] != '\t')) {
                strB.append(charsArray[i]);
            }
        }
        System.out.println(strB);
    }
}
