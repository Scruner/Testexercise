package projects.loops;

public class Symmetry {

    public static boolean check(int i) {
        String s = String.valueOf(i);
        StringBuilder stringBuilder = new StringBuilder(s);
        return (s.equals(stringBuilder.reverse().toString()));
    }
}

