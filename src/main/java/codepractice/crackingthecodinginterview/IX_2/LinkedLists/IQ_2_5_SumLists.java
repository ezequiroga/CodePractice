package codepractice.crackingthecodinginterview.IX_2.LinkedLists;

/**
 * Sum Lists: You have two numbers represented by a linked list, where each node
 * contains a single digit. The digits are stored in reverse order, such that
 * the 1 's digit is at the head of the list. Write a function that adds the two
 * numbers and returns the sum as a linked list.
 *
 * EXAMPLE Input: (7-> 1 -> 6) + (5 -> 9 -> 2). That is,617 + 295. Output: 2 ->
 * 1 -> 9. That is, 912.
 *
 * FOLLOW UP Suppose the digits are stored in forward order. Repeat the above
 * problem. Input: (6 -> 1 -> 7) + (2 -> 9 -> 5). That is, 617 + 295. Output: 9
 * -> 1 -> 2. That is, 912.
 *
 * @author ae_qu
 */
public class IQ_2_5_SumLists {

    public MyLinkedList sumListReverserOrder(MyLinkedList n1, MyLinkedList n2) {
        MyLinkedListNode currentN1 = n1.head;
        MyLinkedListNode currentN2 = n2.head;

        MyLinkedList result = new MyLinkedList();

        int over = 0;
        while (currentN1 != null && currentN2 != null) {
            int sum = currentN1.data + currentN2.data + over;
            over = 0;
            if (sum >= 10) {
                over++;
                sum = sum - 10;
            }
            result.add(sum);
            currentN1 = currentN1.next;
            currentN2 = currentN2.next;
        }

        while (currentN1 != null) {
            int sum = currentN1.data + over;
            over = 0;
            result.add(sum);
            currentN1 = currentN1.next;
        }

        while (currentN2 != null) {
            int sum = currentN2.data + over;
            over = 0;
            result.add(sum);
            currentN2 = currentN2.next;
        }

        if (over > 0) {
            result.add(over);
        }

        return result;
    }

    public MyLinkedList sumListForwardOrder(MyLinkedList n1, MyLinkedList n2) {
        MyLinkedListNode currentN1 = n1.head;
        MyLinkedListNode currentN2 = n2.head;

        MyLinkedList reutl = new MyLinkedList();

        MyLinkedListNode lastNode = null;

        int over = 0;
        while (currentN1 != null && currentN2 != null) {
            int sum = currentN1.data + currentN2.data;
            over = 0;
            if (sum >= 10) {
                sum = sum - 10;
                over++;

                if (lastNode == null) {
                    MyLinkedListNode newHead = new MyLinkedListNode();
                    newHead.data = over;
                    newHead.next = reutl.head;
                    reutl.head = newHead;
                    lastNode = reutl.head;
                } else {
                    lastNode.data += over;
                }
            }

            MyLinkedListNode newNode = new MyLinkedListNode(sum);
            if (reutl.head == null) {
                reutl.head = newNode;
            } else {
                lastNode.next = newNode;
            }
            lastNode = newNode;

            //crear nuevo nodo
            currentN1 = currentN1.next;
            currentN2 = currentN2.next;
        }
        
//        while(currentN1 != null){
//            int sum = currentN1.data;
//            if (sum >= 10){
//                
//            }
//            
//            currentN1 = currentN1.next;
//        }
//        
//        while(currentN2 != null){
//            int sum = currentN2.data;
//            if (sum >= 10){
//                
//            }
//            currentN2 = currentN2.next;
//        }

        return reutl;
    }

}
