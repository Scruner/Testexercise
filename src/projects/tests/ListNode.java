package projects.tests;

public class ListNode<T> {
    private ListNode<T> prev;
    private ListNode<T> next;
    private T value;

    public ListNode(ListNode<T> prev, ListNode<T> next, T value) {
        this.prev = prev;
        this.next = next;
        this.value = value;
    }

    public ListNode<T> getPrev() {
        return prev;
    }

    public void setPrev(ListNode<T> prev) {
        this.prev = prev;
    }

    public ListNode<T> getNext() {
        return next;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ListNode{"
                + "prev="
                + prev
                + ", next="
                + next
                + ", value="
                + value
                + '}';
    }
}
