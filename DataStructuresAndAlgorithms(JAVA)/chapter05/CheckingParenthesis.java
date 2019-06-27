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
class node1{
    int data;
    node1 next;
    node1(){
    data=0;
    next = null;
}
}
class stack{
    Scanner scan = new Scanner(System.in);
    public int x,i=0;
    public node1 front;
    stack(){
        front = null;
    }
    node1 newNode(){
        node1 temp = new node1();
        temp.data=1;
        temp.next=null;
        return temp;
    }
    void push(){
        node1 temp;
        temp = newNode();
        if(front == null){
            System.out.println("First element pushed");
            front = temp;
            i++;
        }else{
            temp.next=front;
            front=temp;
            i++;
            System.out.println("Element pushed");
        }
    }
    void pop(){
        if(front==null){
            System.out.println("Empty Stack");
            i--;
        }else{
            front=front.next;
            i--;
            System.out.println("Element Poped");
        }
    }
    boolean memory(){
        return 0==i;
    }
}
public class CheckingParenthesis {
    public static void main(String[] args){
        stack abc = new stack();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the line");
        String string = scan.next();
        char[] buf =new char[string.length()];
        string.getChars(0, string.length(), buf, 0);
        for(char i : buf){
            if(i=='{')
                abc.push();
            if(i=='}')
                abc.pop();
        }
        if(abc.memory())
            System.out.println("All the parenthesis are closed");
        else
            System.err.println("All parenthsis are not closed");
    }
}
