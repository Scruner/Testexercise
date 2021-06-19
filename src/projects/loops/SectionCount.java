package projects.loops;

public class SectionCount {

    public static int count(int length, int section) {
        int c = 0;
        while ((length - section) >= 0) {
            c++;
            length = length - section;
        }
        return c;
    }
}
