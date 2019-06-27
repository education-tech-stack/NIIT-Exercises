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
class node{
    public int data;
    public node next;
    node(){
        data=0;
        next=null;
    }
}
class Queue{
    Scanner scan = new Scanner(System.in);
    public int x;
    node front,rear;
    Queue(){
        front=rear=null;
    }
    node newNode(int n){
        node temp = new node();
        temp.data=n;
        temp.next=null;
        return temp;
    }
    void pushEnd(){
        System.out.println("Enter element");
        x = scan.nextInt();
        node temp=newNode(x);
        if(front==null){
            front = rear = temp;
            System.out.println("First element pushed");
        }else{
            rear.next=temp;
            rear=temp;
            System.out.println("Element pushed at end");
        }
    }
    void pushFront(){
        System.out.println("Enter a element");
        x = scan.nextInt();
        node temp=newNode(x);
        if(front == null){
            front = rear= temp;
            System.out.println("First element pushed");
        }
        else{
            temp.next=front;
            front= temp;
            System.out.println("Element pushed at front");
        }
    }
    void popFront(){
        if(front==null){
            System.out.println("List is empty");
        }else{
            front=front.next;
            System.out.println("Element Poped from front");
        }
    }
    void popEnd(){
        if(front==null){
            System.out.println("List is empty");
        }else{
            node prev=front;
            while(prev.next!=rear){
                prev=prev.next;
            }
            prev.next=null;
            rear=prev;
            System.out.println("Element Poped");
        }
    }
    void display(){
        if(front==null){
            System.out.println("List is empty");
        }
        else{
            node temp=front;
            System.out.println("------------------------------");
            while(temp!=null){
                System.out.print(temp.data+"\t");
                temp=temp.next;
            }
            System.out.println("\n------------------------------");
            System.out.println("Queue Displayed");
        }
    }
}
public class DoublyEndedQueueUsingLinkedList {
    public static void main(String[] args){
        Queue abc=new Queue();
    int choice;
    do
    {
        System.out.println(" 1.Push element from front\t2.Push element from end \t 2.Pop element from front\t3.Pop element from end\t 5.Display \t 6.EXIT\nEnter choice:");
        choice = Integer.parseInt(new Scanner(System.in).nextLine());
        switch(choice)
        {
        case 1:
            abc.pushFront();
            break;
        case 2:
            abc.pushEnd();
            break;
        case 3:
            abc.popFront();
            break;
        case 4:
            abc.popEnd();
            break;
        case 5: 
            abc.display();
        default:
            System.out.println("INVALID COMMAND");
            break;
        case 6:
            break;
        }
    }while(choice!=6);
    }
}
