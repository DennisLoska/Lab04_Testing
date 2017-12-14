package genericlist;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class LinkedListTest {

    @Test
    public void addToLinkedList(){
        LinkedList<String> ll = new LinkedList<>();
        ll.add(new Node<>("HUHU"));
        assertTrue(ll.toString().equals("HUHU"));
    }

    @Test
    public void removeFromLinkedList(){
        LinkedList<String> ll = new LinkedList<>();
        ll.add(new Node<>("HUHU"));
        ll.add(new Node<>("HAHA"));
        ll.add(new Node<>("HIHI"));
        ll.remove();
        assertEquals(2,ll.getListLength());
    }

    @Test
    public void reverseMultipleItemListTest(){
        LinkedList ll = new LinkedList();
        ll.add(new Node<>("A"));
        ll.add(new Node<>("B"));
        ll.add(new Node<>("C"));
        ll.add(new Node<>("D"));
        ll.reverse();
        assertTrue("Error Message", ll.toString().equals("D, C, B, A"));
    }

    @Test
    public void reverseSingleItemList(){
        LinkedList<String> ll = new LinkedList<>();
        ll.add(new Node<>("A"));
        ll.reverse();
        assertTrue(ll.toString().equals("A"));
    }

    @Test
    public void reverseEmptyList(){
        LinkedList<String> ll = new LinkedList<>();
        ll.reverse();
        assertTrue(ll.toString().equals("-1"));
    }

    @Test
    public void reverseMixedItemList(){
        LinkedList ll = new LinkedList();
        ll.add(new Node<>("A"));
        ll.add(new Node<>(1));
        ll.add(new Node<>(true));
        ll.add(new Node<>(3.1));
        ll.reverse();
        assertTrue("Error Message", ll.toString().equals("3.1, true, 1, A"));
    }

}
