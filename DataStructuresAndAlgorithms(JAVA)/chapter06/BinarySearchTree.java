/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter06;
import java.util.Scanner;
/**
 *
 * @author harsh
 */
class leaf
{
    public int data;
    leaf left,right;
}
class tree
{
    Scanner scan = new Scanner(System.in);
    leaf root,parent,curr;
    public tree()
    {
        root=parent=curr=null;
    }
    leaf createleaf(int n)
    {
        leaf temp=new leaf();
        temp.data=n;
        temp.left=temp.right=null;
        return temp;
    }
    void insert()
    {
        leaf temp;
        curr=root;
        int a;
        System.out.println("Enter data");
        a = scan.nextInt();
        temp=createleaf(a);
        if(root==null)
        {
            root=temp;
            System.out.println("Root added");
        }
        else
        {
            while(curr!=null)
            {
                parent=curr;
                if(temp.data > curr.data)
                    curr=curr.right;
                else if(temp.data < curr.data)
                    curr=curr.left;
                    else
                    {
                        System.out.println("DUPLICATES NOT ALLOWED");
                        return;
                    }
            }
            if(temp.data >parent.data)
            {
                System.out.println("Element inserted in right of "+parent.data);
                parent.right=temp;
            }
            else
                {
                    System.out.println("Element inserted in left of "+parent.data);
                    parent.left=temp;
                }
            System.out.println("Element added");
        }
    }
    void inorder(leaf temp)
    {
        if(temp==null)
        {
            return;
        }
        inorder(temp.left);
        System.out.print(temp.data+"  ");
        inorder(temp.right);
    }
    void preorder(leaf temp)
    {
         if(temp==null)
        {
            return;
        }
        System.out.print(temp.data+"  ");
        preorder(temp.left);
        preorder(temp.right);
    }
    void postorder(leaf temp)
    {
         if(temp==null)
        {
            return;
        }
        postorder(temp.left);
        postorder(temp.right);
        System.out.print(temp.data+"  ");
    }
    void traversal()
    {
        System.out.println("Inorder Traversal");
        System.out.println("----------------------------------------------------");
        inorder(root);
        System.out.println("\n----------------------------------------------------");
        System.out.println("Preorder Traversal");
        System.out.println("----------------------------------------------------");
        preorder(root);
        System.out.println("\n----------------------------------------------------");

        System.out.println("Postorder Traversal");
        System.out.println("----------------------------------------------------");
        postorder(root);
        System.out.println("\n----------------------------------------------------");
    }
    void deleteleaf(leaf curr,leaf parent)
    {
        if(curr.data < parent.data)
            parent.left=null;
        else
            parent.right=null;
        System.out.println(curr.data+" element deleted");
    }
    void deletehavingone(leaf curr,leaf parent)
    {
        leaf child;
        if(curr.left==null)
            child=curr.right;
        else
            child=curr.left;
        if(parent.right==curr)
            parent.right=child;
        else
            parent.left=child;
        System.out.println(curr.data+" deleted form tree");
    }
    void deletehavingboth(leaf curr,leaf parent)
    {
        leaf inos;    //find the inorder successor
        inos=curr.right;
        parent=curr;      //if curr=ROOT & parent=NULL
        while(inos.left!=null)
        {
            parent=inos;
            inos=inos.left;
        }

        curr.data=inos.data;
        if(inos.left==null  &&  inos.right==null)
        {
            deleteleaf(inos,parent);
        }
        else
            deletehavingone(inos,parent);
    }
    void deleteit()
    {
        int num;
        System.out.println("Enter element to be deleted");
        num = scan.nextInt();
        curr=root;
        if(root==null)
        {
            System.out.println("EMPTY TREE");
        }
        else
        {
            while(curr != null && num != curr.data)
            {
                parent = curr;
                if(num < curr.data)
                    curr = curr.left;
                else if(num > curr.data)
                    curr = curr.right;
            }
            if(curr==root && curr.left==null && curr.right==null)
            {
                root=null;
                System.out.println("Root deleted");
            }else if(curr==null)
            {
                System.out.println("Element NOT FOUND");
            }
            else if(curr.left==null  &&  curr.right==null)
                    deleteleaf(curr,parent);
                else if(curr.left!=null  &&  curr.right!=null)
                    deletehavingboth(curr,parent);
                    else
                        deletehavingone(curr,parent);
        }
    }
}
public class BinarySearchTree {
    public static void main(String[] args){
        tree bt = new tree();
    int opn;
    do{
        System.out.println("1. Insert\n2. Delete\n3. Display\n0. EXIT");
        opn = Integer.parseInt(new Scanner(System.in).nextLine());
        switch(opn){
            case 1:
                bt.insert();
                break;
            case 2:
            	bt.deleteit();
            	break;
            case 3:
                bt.traversal();
                break;
            case 0:
                break;
            default:
                System.out.println("INVALID COMMAND");
                break;
        }
    }while(opn!=0);
    }
}