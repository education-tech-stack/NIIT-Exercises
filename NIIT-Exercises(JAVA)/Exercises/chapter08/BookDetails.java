/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter08;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
/**
 *
 * @author harsh
 */
public class BookDetails {
    Scanner scan = new Scanner(System.in);
    String source;
    BookDetails(){
        source = "N.A";
    }
    private void showMenu(){
        int option;
        do{System.out.println("1. Enter Book Details \n2. Display Books Details \n3. EXIT \nEnter your choice : ");
        option = scan.nextInt();
        switch(option){
            case 1: enterData();
            break;
            case 2: display();
            break;
            case 3: 
                break;
            default: System.err.println("INVALID OPTION \nRE-ENTER THE OPTION");
        }
        }while(option!=3);
    }
    private void enterData(){
        
        System.out.println("Enter the following details");
        System.out.println("Book Name : ");
        writer(source);
        System.out.println("Author Name : ");
        writer(source);
        System.out.println("Price");
        writer(source);
        
    }
    private void writer(String source){
        try(FileWriter file = new FileWriter("file.txt",true)){     //Set the path yourself
        source = scan.next();
        char buffer[] = new char[source.length()];
        source.getChars(0, source.length(), buffer, 0);
        file.write(buffer);
        file.append("\n");
        }
        catch(IOException io){
            System.err.println("File can't be opened");
        }
    }
    private void display(){
        try(BufferedReader filer = new BufferedReader(new FileReader("file.txt"))){    //Set the path yourself
            String line = filer.readLine();
            int i=1;
            while(line != null){
                System.out.println("Book "+i);
                System.out.println("Book Name : "+line);
                line = filer.readLine();
                System.out.println("Author Name : "+line);
                line = filer.readLine();
                System.out.println("Price : "+line);
                line = filer.readLine();
                i++;
            }
            
        }
        catch(IOException io){
            System.err.println("File can't be opened");
        }
                
    }
    public static void main(String[] args){
        System.out.println("Book Details Application");
        BookDetails b = new BookDetails();
        b.showMenu();
    }
}
