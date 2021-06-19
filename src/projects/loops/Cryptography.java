package projects.loops;

public class Cryptography {

    public static String code(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        if (s.isEmpty()) {
            return "empty";
        } else if (s.length() <= 4) {
            return s;
        }
        for (int i = 0; i < s.length() - 4; i++) {
            stringBuilder.setCharAt(i, '#');
        }
        return String.valueOf(stringBuilder);
    }
}
