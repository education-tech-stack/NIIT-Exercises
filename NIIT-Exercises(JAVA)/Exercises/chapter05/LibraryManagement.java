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

    class Books{
    String aname, title, stock;
    int price, nop;
    Scanner scan = new Scanner(System.in); 
    public void showBooks(){
        
        System.out.println("Enter the information for the book \nAuthor Name :");  aname=scan.nextLine();
        System.out.println("Title :");  title=scan.nextLine();
        System.out.println("Price :");  price=scan.nextInt();
        System.out.println("Stock :");  stock=scan.nextLine();
        System.out.println("Number of pages :");  nop=scan.nextInt();
    }
    public void display(){
        System.out.println("Book Information \nAuthor Name :"+aname+"\nTitle : "+title+"\nPrice : "+price+"\nStock : "+stock+"\nNumber of Pages : "+nop);
    }
}
class SoftCopy extends Books{
    int softver;
    public void showSoftCopy(){
    showBooks();
    System.out.println("Software Version :");
    softver = scan.nextInt();
}
    public void displaySoft(){
        display();
        System.out.println("Software Version :"+softver);
    }
}
class HardCopy extends Books{
    String hardcat, publisher;
    public void showHardCopy(){
        showBooks();
        System.out.println("Hardware Category :");
        hardcat = scan.nextLine();
        System.out.println("Publisher :");
        publisher = scan.nextLine();
    }
    public void displayHard(){
        display();
        System.out.println("Hardware Category :"+hardcat+"\nPublisher : "+publisher);
    }
}
public class LibraryManagement {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        SoftCopy sc = new SoftCopy();
        HardCopy hc = new HardCopy();
        System.out.println("Libray Management Application ");
        int op;
        do{
            System.out.println("1 for SoftCopy\n 2 for HardCopy \n3 for exit");
            op=scan.nextInt();
            switch(op){
                case 1:sc.showSoftCopy(); sc.displaySoft(); break;
                case 2:hc.showHardCopy(); hc.displayHard(); break;
                case 3: break;
                default: System.out.println("INVALID OPTION");
            }
        }while(op!=3);
    }
}
