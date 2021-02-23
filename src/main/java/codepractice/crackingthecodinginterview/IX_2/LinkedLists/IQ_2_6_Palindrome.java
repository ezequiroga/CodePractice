package codepractice.crackingthecodinginterview.IX_2.LinkedLists;

/**
 * Palindrome: Implement a function to check if a linked list is a palindrome.
 *
 * @author ae_qu
 */
public class IQ_2_6_Palindrome {

    public boolean isPalindrome(MyLinkedList list) {
        MyLinkedListNode currentNode = list.head;
        boolean isPalin = true;

        int numOfNodes = list.size / 2;
        int[] halfList = new int[numOfNodes];
        
        for (int i = numOfNodes-1; i > -1; i--) {
            halfList[i] = currentNode.data;
            currentNode = currentNode.next;
        }

        if (list.size % 2 != 0){
            currentNode = currentNode.next;
        }
        
        for (int i = 0; i < numOfNodes; i++) {
            if(halfList[i] != currentNode.data){
                isPalin = false;
            }
            currentNode = currentNode.next;
        }
        return isPalin;
    }

    /**
     * Solution #2: Iterative Approach - Page 218
     * 
     * We want to detect linked lists where the front half of the list is the
     * reverse of the second half. How would we do that? By reversing the front
     * half of the list. A stack can accomplish this.
     * 
     * If we know the size of the linked list, we can iterate through the first
     * half of the elements in a standard for loop, pushing each element onto a
     * stack. We must be careful, of course, to handle the case where the length
     * of the linked list is odd. If we don't know the size of the linked list,
     * we can iterate through the linked list, using the fast runner/ slow
     * runner technique described in the beginning of the chapter. At each step
     * in the loop, we push the data from the slow runner onto a stack. When the
     * fast runner hits the end of the list, the slow runner will have reached
     * the middle of the linked list. By this point, the stack will have all the
     * elements from the front of the linked list, but in reverse order.
     * 
     */
    
    /**
     * Solution #3: Recursive Approach
     * 
     * This solution creates an object to be returned in each recursive call.
     * The object contains a node and a boolean.
     * 
     * Check pages 218, 219, 220
     */
    
}
