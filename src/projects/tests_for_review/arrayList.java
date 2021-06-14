package projects.tests_for_review;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {

    public static void main(String[] args) {
        ArrayList testList = new ArrayList();
        testList.add("50");
        testList.add("60");
        testList.add("70");
        System.out.println(testList.size());
        System.out.println("Цикл While:");
        Iterator iter = testList.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("Улучшенный цикл For:");
        for (Object o : testList) {
            System.out.println(o);
        }
        System.out.println("Цикл For:");
        for (int i = 0; i < testList.size(); i++) {
            System.out.println(testList.get(i));
        }
    }
}
