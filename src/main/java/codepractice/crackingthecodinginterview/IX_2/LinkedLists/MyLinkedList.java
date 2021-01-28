/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codepractice.crackingthecodinginterview.IX_2.LinkedLists;

/**
 *
 * @author ae_qu
 */
public class MyLinkedList {
    
    MyLinkedListNode head;
    MyLinkedListNode tail;
    
    public MyLinkedList add(int data){
        if (head == null){
            head = new MyLinkedListNode(data);
            tail = head;
            return this;
        }
        
        MyLinkedListNode node = head;
        while(node.next != null){
            node = node.next;
        }
        node.next = new MyLinkedListNode(data);
        tail = node.next;
        return this;        
    }
    
}
