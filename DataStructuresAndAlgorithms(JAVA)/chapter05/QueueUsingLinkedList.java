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
    void push(){
        System.out.println("Enter element");
        x = scan.nextInt();
        node temp=newNode(x);
        if(front==null){
            front = rear = temp;
            System.out.println("First element pushed");
        }else{
            rear.next=temp;
            rear=temp;
            System.out.println("Element pushed");
        }
    }
    void pop(){
        if(front==null){
            System.out.println("List is empty");
        }else{
            front=front.next;
            System.out.println("Element Poped");
        }
    }
    void display(){
        if(front==null){
            System.out.println("List is empty");
        }
        else{
            node temp=front;
            while(temp!=null){
                System.out.println(temp.data+"\t");
                temp=temp.next;
            }
            System.out.println("Queue Displayed");
        }
    }
}
public class QueueUsingLinkedList {
    public static void main(String[] args){
        Queue abc=new Queue();
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
