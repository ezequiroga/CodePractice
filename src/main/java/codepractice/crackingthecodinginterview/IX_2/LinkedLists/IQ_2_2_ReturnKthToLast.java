package codepractice.crackingthecodinginterview.IX_2.LinkedLists;

/**
 * Return Kth to Last: Implement an algorithm to find the kth to last element of
 * a singly linked list.
 *
 * @author ae_qu
 */
public class IQ_2_2_ReturnKthToLast {
    
    public MyLinkedList returnKthToLast(MyLinkedList list, int kth){
        MyLinkedList finalList = new MyLinkedList();
        
        MyLinkedListNode current = list.head;
        int numOfElement = 0;
        while(current != null){
            numOfElement++;
            if(numOfElement >= list.size - kth + 1){
                finalList.add(current.data);
            }
            current = current.next;
        }
        
        return finalList;
    }
    
}
