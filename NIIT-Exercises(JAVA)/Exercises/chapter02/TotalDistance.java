/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter02;
import java.util.Scanner;
/**
 *
 * @author harsh
 */
public class TotalDistance {
    
    public static void main(String[] args)
    {
        float u, a, t, distance;
        System.out.println("Enter the following information \nInitial velocity(m/sec) :");
        Scanner scan;
        scan = new Scanner(System.in);
        u = scan.nextFloat();
        System.out.println("\n Acceleration(m/sec^2) :");
        a = scan.nextFloat();
        System.out.println("\n Time(sec) :");
        t = scan.nextFloat();
        distance = (u*t) + (a*t*t)/2;
        System.out.println("\n Distance(m) : "+distance);
    }
}
