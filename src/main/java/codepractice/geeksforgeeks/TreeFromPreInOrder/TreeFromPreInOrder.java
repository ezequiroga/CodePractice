package codepractice.geeksforgeeks.TreeFromPreInOrder;

import java.util.HashMap;
import java.util.Map;

/**
 * Construct Tree from given Inorder and Preorder traversals
 * Inorder sequence: D B E A F C 
 * Preorder sequence: A B D E C F
 */
public class TreeFromPreInOrder {
    
    public static int preIndex = 0;
    
    public Node buildTree(char in[], char pre[], int inStrt, int inEnd) {
        Map<Character, Integer> inHm = new HashMap<>();
        for (int i = 0; i < in.length; i++){
            inHm.put(in[i], i);
        }
        
        return buildTree(inHm, pre, inStrt, inEnd);
        
    }
    
    public Node buildTree(Map<Character, Integer> in, char[] pre, int inStrt, int inEnd) {
        
        //when there is no right node at the end
        if (inStrt > inEnd)
            return null;
        
        //create the new node and increment the position
        Node newNode = new Node(pre[preIndex]);
        preIndex++;
        
        //if the de index is the same there is not children, so return the node
        if (inStrt == inEnd) 
            return newNode;
        
        //seek the index of the subtree root node
        int iNode = in.get(newNode.data);
        
        newNode.left = buildTree(in, pre, inStrt, iNode - 1);
        newNode.right = buildTree(in, pre, iNode + 1, inEnd);
        
        return newNode;
        
    }
    
    //copied method 
    public void printInorder(Node node)
    {
        if (node == null)
            return;
 
        /* first recur on left child */
        printInorder(node.left);
 
        /* then print the data of node */
        System.out.print(node.data + " ");
 
        /* now recur on right child */
        printInorder(node.right);
    }
    
}
