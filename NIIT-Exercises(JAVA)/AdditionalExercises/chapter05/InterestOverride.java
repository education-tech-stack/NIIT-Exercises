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
class FixedAccount{
    public void calculateInterest(){
        System.out.println("Fixed account interest called");
    }
}
class SavingsAccount extends FixedAccount{
    @Override
    public void calculateInterest(){
        System.out.println("Savings account interest called");
    }
}
public class InterestOverride {
    public static void main(String[] args){
        FixedAccount fa = new FixedAccount();
        SavingsAccount sa = new SavingsAccount();
        System.out.println("Enter the type of account \n1 for Fixed Account \n2 fot Savings Account");
        Scanner scan = new Scanner(System.in);
        int i=scan.nextInt();
        FixedAccount ref;       //Refernce variable for invoking overridden method
        if(i==1)
        {
            ref=fa;
            ref.calculateInterest();
        }
        else
        {
            ref=sa;
            ref.calculateInterest();
        }
    }
}
