/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter04;

/**
 *
 * @author harsh
 */
class Node{
    int data;
    Node next;
}
public class ReversingSinglyLinkedList {
    void reverseSinglyLinkedList(Node start){
        if(start==null || start.next==null){
            System.out.println("The reversing cant be done due to lack of nodes at least there should be 3 nodes in the list.");
        }
        else{
            Node ptr1 = start;
            Node ptr2 = ptr1.next;
            Node ptr3 = ptr2.next;
            ptr1.next=null;
            ptr2.next=ptr1;
            while(ptr3!=null){
                ptr1=ptr2;
                ptr2=ptr3;
                ptr3=ptr3.next;
                ptr2.next=ptr1;
            }
            start=ptr2;
        }
            
    }
    
}
