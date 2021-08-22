package projects.arrays;

public class Alphabet {

    public static char[] generateAlphabet() {
        char[] alpha = new char[26];
        for (int i = 0; i < alpha.length; i++) {
            alpha[i] = (char) ('a' + i);
        }
        return alpha;
    }
}
