package projects.tests_for_review;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SixthTask {

    public static void main(String[] args) {
        HashMap<Integer, String> keyValue = new HashMap<Integer, String>();
        keyValue.put(1, "Hello");
        keyValue.put(2, "World");
        keyValue.put(3, "Have a nice day!");
        System.out.println(keyValue.size());
        System.out.println("Цикл While:");
        Iterator iter = keyValue.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry qurentMe = (Map.Entry) iter.next();
            System.out.println("Ключ это " + qurentMe.getKey()
                    + " Значение это " + qurentMe.getValue());
        }
        System.out.println("Цикл For:");
        for (Map.Entry qurentMe2 : keyValue.entrySet()) {
            System.out.println("Ключ это: " + qurentMe2.getKey()
                    + " Значение это: " + qurentMe2.getValue());
        }
    }
}
