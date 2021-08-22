package projects.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {

    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Zaur Tregulov");
        map1.put(3658, "Ivan Ivanov");
        map1.put(9875, "Mariya Sidorova");
        map1.put(15871, "Nickolay Petrov");
        map1.putIfAbsent(1000, "Nickolay Petrov");

        System.out.println(map1.values());

        System.out.println(map1);


    }
}
