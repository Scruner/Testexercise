package projects.tests_for_review;

public class SecondTask {

    public static void main(String[] args) {
        String st = "Учимся программировать";
        //конвертируем строку в массив символов,
        //затем выводим символы на экран в обратном порядке
        char symbols[] = st.toCharArray();
        for (int x = symbols.length - 1; x >= 0; x--) {
            System.out.print(symbols[x]);
        }
    }
}
