package projects.loops;

public class Abbreviation {

    public static String collect(String s) {
        return s.replaceAll("\\B.|\\P{L}", "");
    }
}