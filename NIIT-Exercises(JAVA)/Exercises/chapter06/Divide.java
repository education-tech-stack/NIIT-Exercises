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
public class Divide {
    public int divide(int x,int y){
        System.out.println("Enter 2 no. to divide");
        Scanner scan = new Scanner(System.in);
        x=scan.nextInt();
        y=scan.nextInt();
        return x/y;
    }
    public static void main(String[] args){
        int a,b;
        a=b=0;
        Divide d = new Divide();
        try{
            System.out.println("Result : "+d.divide(a, b));
        }
        catch(ArithmeticException e){
            System.out.println("A no. can not be divided by 0");
            System.out.println("Result : "+d.divide(a, b));
        }
    }
}
