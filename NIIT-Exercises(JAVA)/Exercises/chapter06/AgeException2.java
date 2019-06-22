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
/*class Re{          //method2 using a class     
    Re(){
        throw new RuntimeException(); 
    }   
}*/
class EDetails2{
    String name, cd;
    int age;
    Scanner scan = new Scanner(System.in);
    void getDetails(){
        System.out.println("Enter the following Employee Details \nName : ");  name=scan.nextLine();
        System.out.println("Contact Details : ");  cd=scan.next();
        try{
            System.out.println("Age : ");
            age=scan.nextInt();
            if(age<20 || age>55){
                throw new RuntimeException();   //method 1
                /*Re ree = new Re(); */               //method 2 sub part
            }
                
        }
        catch(RuntimeException re){
            System.out.println("The age should be between 20 and 55. Re-enter the data");
            getDetails();
        }
    }
}
public class AgeException2 {
    public static void main(String[] args){
        EDetails2 ed = new EDetails2();
        ed.getDetails();
    }
}
