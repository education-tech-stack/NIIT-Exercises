    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter04;
import java.util.Scanner;
/**
 *
 * @author harsh
 */
class node
{
    public int data;
    public node next,prev;
}
class operations
{
    public node start,last;
    int x;
    Scanner scan = new Scanner(System.in);
    operations()
    {
        start=last=null;
    }
    node newnode(int n)
    {
        node temp=new node();
        temp.data=n;
        temp.next=temp.prev=null;
        return temp;
    }
    void insertfront()
    {
        node temp;
        System.out.println("Enter a element");
        x=scan.nextInt();
        temp=newnode(x);
        if(start==null)
        {
            start=last=temp;
            System.out.println("First node Created");
        }
        else
        {
            start.prev=temp;
            temp.next=start;
            start=temp;
            System.out.println("Element inserted");
        }
    }
    void insertmid()
    {
        node temp,curr,back;
        curr=start;
        back=null;
        System.out.println("Enter a element");
        x=scan.nextInt();
        temp=newnode(x);
        if(start==null)
        {
            start=last=temp;
            System.out.println("First node Created");
        }
        else
        {
            while( x > curr.data && curr.next!=null)
            {
                back=curr;
                curr=curr.next;
            }
            if(curr.next==null) //if it reaches the last element
            {
                curr.next=temp;
                temp.prev=curr;
                last=temp;
            }
            else
                if(back==null)  //if loop stops at first element
            {
                curr.prev=temp;
                temp.next=curr;
                start=temp;
            }
            else
            {
                back.next=temp;
                temp.prev=back;
                temp.next=curr;
                curr.prev=temp;
            }
            System.out.println("Node inserted at correct position.");
        }
    }
    void insertlast()
    {
        node temp;
        System.out.println("Enter a element");
        x=scan.nextInt();
        temp=newnode(x);
        if(start==null)
        {
            start=last=temp;
            System.out.println("First node Created");
        }
        else
        {
            last.next=temp;
            temp.prev=last;
            last=temp;
            System.out.println("Element inserted at last.");
        }
    }
    void deletefront()
    {
        node temp;
        temp=start;
        if(start==null)
        {
            System.out.println("The list is empty");
        }
        else
        {
            start=start.next;
            start.prev=null;
            System.out.println("First element deleted");
        }
    }
    void deletemid()
    {
        node temp,curr,back;
        curr=start;
        back=null;
        System.out.println("Enter element to be deleted");
        x=scan.nextInt();
        if(start==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            while( x != curr.data && curr!=null)
            {
                back=curr;
                curr=curr.next;
            }
            if(curr==null)
            {
                System.out.println("Element not found");
            }
            else
                if(back==null)
            {
                temp=start;
                start=start.next;
                start.prev=null;
            }
            else
            {
                temp=curr;
                curr=curr.next;
                curr.prev=back;
                back.next=curr;
            }
            System.out.println("Node deleted");
        }
    }
    void deletelast()
    {
        node temp;
        if(start==null)
        {
            System.out.println("Empty list");
        }
        else
        {
            temp=last;
            last=last.prev;
            last.next=null;
            System.out.println("Node deleted from last");
        }
    }
    void displayasc()
    {
        node curr,back;
        curr=start;
        back=null;
        if(start==null)
        {
            System.out.println("Empty list");
        }
        else
        {
            while(curr!=null)
            {
                back=curr;
                System.out.println(curr.data+"\t");
                curr=curr.next;
            }
            System.out.println();
        }
    }
    void displaydsc()
    {
        node curr,back;
        curr=last;
        back=null;
        if(start==null)
        {
            System.out.println("Empty list");
        }
        else
        {
            while(curr!=null)
            {
                back=curr;
                System.out.println(curr.data+"\t");
                curr=curr.prev;
            }
            System.out.println();
        }
    }
}
public class DoublyLinkedList {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        operations opo=new operations();
    int choice;
    do
    {
        System.out.println("1.Insert front\t 2. Insert middle\t 3. Insert last\n4. Delete front\t 5. Delete middle\t 6. Delete last\n7. Display\t 0. END");
        System.out.println("Enter choice :");
        choice = scan.nextInt();
        switch(choice)
        {
        case 1:
            
            opo.insertfront();
            break;
        case 2:
            
            opo.insertmid();
            break;
        case 3:
            
            opo.insertlast();
            break;
        case 4:
            
            opo.deletefront();
            break;
        case 5:
            
            opo.deletemid();
            break;
        case 6:
            
            opo.deletelast();
            break;
        case 0:
            break;
        case 7:
            System.out.println("Ascending list");
            opo.displayasc();
            System.out.println("Descending list");
            opo.displaydsc();
            break;
        default:
            System.out.println("INVALID COMMAND");
        }
    }while(choice!=0);
    }
}
