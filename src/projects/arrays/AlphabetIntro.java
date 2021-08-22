package projects.arrays;

public class AlphabetIntro {

    public static char[] generateAlphabet() {
        char[] alpha = new char[26];
        for (int i = alpha.length - 1; i >= 0; i--) {
            alpha[i] = (char) ('z' - i);
        }
        return alpha;
    }
}
