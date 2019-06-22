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
class EDetails{
    String name, cd;
    int age;
    Scanner scan = new Scanner(System.in);
    void getDetails(){
        System.out.println("Enter the following Employee Details \nName : ");  name=scan.nextLine();
        System.out.println("Contact Details : ");  cd=scan.next();
        try{
            System.out.println("Age : ");
            age=scan.nextInt();
            assert (age<55)&&(age>20):"The age should be between 20 and 55";
        }
        catch(AssertionError ae){
            getDetails();
        }
    }
}
public class AgeException {
	
    public static void main(String[] args){
        EDetails ed = new EDetails();
        ed.getDetails();
    }
}
