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
public class PrimeNumber {
    public static void main(String[] args)
    {
        int num;
        System.out.println("Enter the number : ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        int flag=0;  //0 means not a prime no.
        if(num==2)
            flag=1;
          else if(num%2==0||num==0||num==1)        //as the even no. not a prime no.(except 2)& 0,1 are not prime nos.  
          {}
          else
                for (int i=3;i<=num;i+=2)
                {
                    if(num%i==0)
                    {
                        if(i==num) flag=1;
                        break;
                    }
                }
        if(flag==1)
            System.out.println("PRIME NUMBER");
        else
            System.out.println("NOT A PRIME NUMBER");
    }
}
