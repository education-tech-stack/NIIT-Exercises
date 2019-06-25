/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter05;
import java.util.Scanner;
/**
 *
 * @author harsh
 */
class Node{
    int data;
    Node next;
    Node(){
    data=0;
    next = null;
}
}
class Stack{
    Scanner scan = new Scanner(System.in);
    public int x;
    public Node front;
    Stack(){
        front = null;
    }
    Node newNode(int a){
        Node temp = new Node();
        temp.data=a;
        temp.next=null;
        return temp;
    }
    void push(){
        Node temp;
        System.out.println("Enter data to push");
        x= scan.nextInt();
        temp = newNode(x);
        if(front == null){
            System.out.println("First element pushed");
            front = temp;
        }else{
            temp.next=front;
            front=temp;
            System.out.println("Element pushed");
        }
    }
    void pop(){
        if(front==null){
            System.out.println("Empty Stack");
        }else{
            front=front.next;
            System.out.println("Element Poped");
        }
    }
    void display(){
        Node temp=front;
        if(front == null){
            System.out.println("Empty Stack");
        }else{
            while(temp!=null){
                System.out.println(temp.data+"\t");
                temp=temp.next;
            }
            System.out.println("List Displayed");
        }
    }
}
public class StackUsingLinkedList {
    public static void main(String[] args){
        Stack abc = new Stack();
    int choice;
    do
    {
        System.out.println(" 1.Push element \t 2.Pop element \t 3.Display \t 4.EXIT\nEnter choice:");
        choice = Integer.parseInt(new Scanner(System.in).nextLine());
        switch(choice)
        {
        case 1:
            abc.push();
            break;
        case 2:
            abc.pop();
            break;
        case 3:
            abc.display();
            break;
        default:
            System.out.println("INVALID COMMAND");
            break;
        case 4:
            break;
        }
    }while(choice!=4);
    }
}
