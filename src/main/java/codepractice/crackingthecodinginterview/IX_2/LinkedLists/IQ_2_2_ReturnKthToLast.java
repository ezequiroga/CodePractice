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
     * My 3rd solution using recursivity.
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

    /**
     * Solution from de book.
     *
     * A more optimal, but less straightforward, solution is to implement this
     * iteratively. We can use two pointers, pl and p2. We place them k nodes
     * apart in the linked list by putting p2 at the beginning and moving p1 k
     * nodes into the list. Then, when we move them at the same pace, pl will
     * hit the end of the linked list after LENGTH - k steps. At that point, p2
     * will be LENGTH - k nodes into the list, or k nodes from the end.
     *
     */
    public MyLinkedList returnKthToLastBook(MyLinkedList list, int kth) {
        MyLinkedListNode p1 = list.head;
        MyLinkedListNode p2 = list.head;

        /* Move pl k nodes into the list.*/
        for (int i = 0; i < kth; i++) {
            if (p1 == null) {
                return null; // Out of bounds
            }
            p1 = p1.next;
        }
        /**
         * Move them at the same pace. When pl hits the end, p2 will be at the
         * right element.
         */
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        // The original solution return the node.
        //return p2
        
        //My solution return a list like my other solutions
        MyLinkedList nList = new MyLinkedList();
        while(p2 != null){
            nList.add(p2.data);
            p2 = p2.next;
        }
        return nList;
    }

}
