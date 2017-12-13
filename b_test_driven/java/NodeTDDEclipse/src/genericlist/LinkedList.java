package genericlist;

public class LinkedList<E> {
    private Node<E> head;
    private int listLength;

    public LinkedList() {
        head = null;
        listLength = 0;
    }

    void add(Node<E> node) {
        if (head == null) {
            head = node;
            listLength++;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
            listLength++;
        }
    }

    void reverse() {
        if (head == null || head.next == null){
            return;
        }

        Node<E> next;
        Node<E> current = head;
        Node<E> prev = null;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (head == null){
            sb.append(-1);
        } else {
            sb.append(head.toString());
        }
        return sb.toString();
    }
}
