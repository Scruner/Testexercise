package projects.tests;

import org.w3c.dom.Node;

public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public StringsLinkedList() {
        first = new Node(null, null, last);
    }

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node nodeNext = first;
        nodeNext.setValue(value);
        first = new Node(null, null, nodeNext);
        nodeNext.setPrev(first);
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;

        public Node(Node prev, String value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Node() {
        }
    }
}

