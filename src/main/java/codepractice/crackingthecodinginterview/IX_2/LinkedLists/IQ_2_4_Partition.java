package codepractice.crackingthecodinginterview.IX_2.LinkedLists;

/**
 * Partition: Write code to partition a linked list around a value x, such that
 * all nodes less than x come before all nodes greater than or equal to x. If x
 * is contained within the list the values of x only need to be after the
 * elements less than x (see below). The partition element x can appear anywhere
 * in the "right partition"; it does not need to appear between the left and
 * right partitions.
 *
 * EXAMPLE
 *
 * Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition=5]
 * Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
 *
 * **All solutions were made after I saw the solutions in the book.
 *
 * @author ae_qu
 */
public class IQ_2_4_Partition {

    public MyLinkedList partition(MyLinkedList list, int x) {
        MyLinkedListNode current = list.head;

        MyLinkedList before = new MyLinkedList();
        MyLinkedList after = new MyLinkedList();

        while (current != null) {
            MyLinkedListNode next = current.next;
            current.next = null;
            if (current.data >= x) {
                after.add(current);
            } else {
                before.add(current);
            }
            current = next;
        }

        if (before.size == 0) {
            return after;
        }

        before.tail.next = after.head;
        return before;
    }

    public MyLinkedList partitionOneList(MyLinkedList list, int x) {
        MyLinkedListNode current = list.head;

        MyLinkedList returnList = new MyLinkedList();

        while (current != null) {
            MyLinkedListNode next = current.next;
            current.next = null;

            if (returnList.head == null) {
                returnList.head = current;
                returnList.tail = returnList.head;
            } else {

                if (current.data >= x) {
                    returnList.tail.next = current;
                    returnList.tail = current;
                } else {
                    current.next = returnList.head;
                    returnList.head = current;
                }
            }
            returnList.size++;
            current = next;
        }

        return returnList;
    }

}
