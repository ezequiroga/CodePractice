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
    int size;

    public MyLinkedList() {
        size = 0;
    }

    public MyLinkedList add(int data) {
        if (head == null) {
            head = new MyLinkedListNode(data);
            tail = head;
            size++;
            return this;
        }

        MyLinkedListNode node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new MyLinkedListNode(data);
        tail = node.next;
        size++;
        return this;
    }
    
    public MyLinkedList add(MyLinkedListNode node){
        if(head == null ){
            head = node;
            tail = head;
            size++;
            return this;
        }
        
        tail.next = node;
        tail = node;
        size++;
        
        return this;
        
    }
    
    public MyLinkedListNode getByData(int data){
        MyLinkedListNode curr = head;
        while(curr != null){
            if(curr.data == data){
                return curr;
            }
            curr = curr.next;
        }
        return curr;
    }

    @Override
    public String toString() {
        MyLinkedListNode curr = head;
        StringBuilder str = new StringBuilder();
        while (curr != null) {
            if (curr != head) {
                str.append(" -> ");
            }
            str.append(curr.data);
            curr = curr.next;
        }
        return str.toString();
    }

}
