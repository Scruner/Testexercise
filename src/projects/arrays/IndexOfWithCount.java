package projects.arrays;

public class IndexOfWithCount {

    public static int indexOf(char[] string, char c, int number) {
        String str = new String(string);
        for (char value : string) {
            if (value == c && number == 1) {
                return str.indexOf(c);
            } else if (value == c && number > 1) {
                return str.indexOf(c, str.indexOf(c) + 1);
            }
        }
        return -1;
    }
}
