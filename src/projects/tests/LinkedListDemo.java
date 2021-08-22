package projects.tests;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedLIst<String> linkedLIst = new LinkedLIst<>();

        linkedLIst.addLast("B");
        linkedLIst.addLast("C");
        linkedLIst.addLast("D");
        linkedLIst.addLast("E");
        System.out.println("LL: " + linkedLIst);
        linkedLIst.addFirst("A");
        System.out.println("LL: " + linkedLIst);

        System.out.println("Index of element with value E: " + linkedLIst.get("E"));
        System.out.println("Index of element with value ZZZ: " + linkedLIst.get("ZZZ"));

        linkedLIst.remove("C");
        System.out.println("LL: " + linkedLIst);
    }
}
