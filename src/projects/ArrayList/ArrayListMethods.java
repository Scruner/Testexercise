package projects.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ivan");
        arrayList1.add("Коля");
        arrayList1.add("Misha");
        arrayList1.add("Grisha");
        arrayList1.add("Elena");
        arrayList1.add(1, "Rom");
        for (String s : arrayList1) {
            System.out.println(s + " ");
        }
        List<String> list = List.copyOf(arrayList1);
        System.out.println(list);
    }
}