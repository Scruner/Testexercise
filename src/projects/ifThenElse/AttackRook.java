package projects.ifThenElse;

public class AttackRook {

    public static boolean check(String left, String right) {
        if (left.charAt(0) == (right.charAt(0))){
            return true;
        } else return left.charAt(1) == right.charAt(1);
    }
}
