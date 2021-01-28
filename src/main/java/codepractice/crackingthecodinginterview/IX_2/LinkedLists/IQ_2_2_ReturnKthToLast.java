package codepractice.crackingthecodinginterview.IX_2.LinkedLists;

/**
 * Return Kth to Last: Implement an algorithm to find the kth to last element of
 * a singly linked list.
 *
 * @author ae_qu
 */
public class IQ_2_2_ReturnKthToLast {

    /**
     * Trivial solution.
     */
    public MyLinkedList returnKthToLast(MyLinkedList list, int kth) {
        MyLinkedList finalList = new MyLinkedList();

        MyLinkedListNode current = list.head;
        int numOfElement = 0;
        while (current != null) {
            numOfElement++;
            if (numOfElement >= list.size - kth + 1) {
                finalList.add(current.data);
            }
            current = current.next;
        }

        return finalList;
    }

    /**
     * My 2nd solution after read the possibles solving ways proposed by the
     * book.
     */
    public MyLinkedList returnKthToLast2(MyLinkedList list, int kth) {
        MyLinkedListNode curr = list.head;
        while (curr != null) {
            boolean lastNode = false;
            MyLinkedListNode runner = curr;
            int i;
            for (i = 0; i < kth; i++) {
                if (runner.next != null) {
                    runner = runner.next;
                } else {
                    lastNode = true;
                }
            }
            if (i == kth && lastNode) {
                break;
            }
            curr = curr.next;
        }
        MyLinkedList finalList = new MyLinkedList();
        while (curr != null) {
            finalList.add(curr.data);
            curr = curr.next;
        }

        return finalList;
    }

    /**
     * My 3rd solution using recursivity
     */
    public MyLinkedList returnKthToLast3(MyLinkedList list, int kth) {
        MyLinkedListNode curr = list.head;
        while (curr != null) {
            boolean lastNode = checkLast(curr, 0, kth);
            if (lastNode) {
                break;
            }
            curr = curr.next;
        }
        MyLinkedList finalList = new MyLinkedList();
        while (curr != null) {
            finalList.add(curr.data);
            curr = curr.next;
        }

        return finalList;
    }

    private boolean checkLast(MyLinkedListNode current, int numOfCalls, int last) {
        if (numOfCalls != last) {
            return checkLast(current.next, numOfCalls + 1, last);
        }
        return current == null;
    }

}
