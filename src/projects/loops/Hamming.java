package projects.loops;

public class Hamming {

    public static int checkStrings(String left, String right) {
        int count = 0;
        for (int i = 0; i < left.length(); i++) {
            if (left.charAt(i) != right.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
