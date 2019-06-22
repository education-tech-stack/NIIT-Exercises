/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter03;
import java.util.Scanner;
/**
 *
 * @author harsh
 */
public class Exercise4 {
    public static void main(String[] args)
    {
        int a,b;
        Scanner scan = new Scanner(System.in);
        a=scan.nextInt();
        b=scan.nextInt();
        if(b==0)
            System.out.println("ERROR: b cannot be zero");
        else
            if(a%b==0)
                System.out.println("It's divisible");
    }
}
