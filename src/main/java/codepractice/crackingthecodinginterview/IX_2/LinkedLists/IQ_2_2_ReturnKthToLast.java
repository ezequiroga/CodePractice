package codepractice.crackingthecodinginterview.IX_2.LinkedLists;

/**
 *
 * @author ae_qu
 */
public class IQ_2_2_ReturnKthToLast {
    
    /**
     * What does I must return when kth in bigger than the list size?
     * Is kth like an index or the number? ex: first element is 0 or 1. 
     */
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
