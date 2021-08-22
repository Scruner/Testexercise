package projects.hashMap;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyCode {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Анна", "1"));
        users.add(new User("Анна", "2"));
        users.add(new User("Мария", "1"));
        users.add(new User("Пётр", "1"));
        users.add(new User("Пётр", "2"));

        Set<User> userSet = new HashSet<>();
        for (User user : users) {
            userSet.add(user);
        }


        Map<String, User> map = new HashMap<>();
        for (User user: userSet) {
            map.put(user.getName(), user);
        }
        System.out.println(map);
    }
}
