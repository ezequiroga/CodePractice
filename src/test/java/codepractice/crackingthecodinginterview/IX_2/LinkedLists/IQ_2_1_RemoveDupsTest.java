package codepractice.crackingthecodinginterview.IX_2.LinkedLists;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ae_qu
 */
public class IQ_2_1_RemoveDupsTest {

    public IQ_2_1_RemoveDupsTest() {
    }

    @Test
    public void testRemoveDups() {
        System.out.println("removeDups");
        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(6);
        IQ_2_1_RemoveDups instance = new IQ_2_1_RemoveDups();
        instance.removeDups(list);

        MyLinkedListNode current = list.head;
        int size = 0;
        while (current != null) {
            size++;
            System.out.println("Data > " + current.data);
            current = current.next;
        }

        assertEquals(5, size);
    }

    @Test
    public void testRemoveDupsBook() {
        System.out.println("removeDupsBook");
        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(6);
        IQ_2_1_RemoveDups instance = new IQ_2_1_RemoveDups();
        instance.removeDupsBook(list);

        MyLinkedListNode current = list.head;
        int size = 0;
        while (current != null) {
            size++;
            System.out.println("Data > " + current.data);
            current = current.next;
        }

        assertEquals(5, size);
    }

}
