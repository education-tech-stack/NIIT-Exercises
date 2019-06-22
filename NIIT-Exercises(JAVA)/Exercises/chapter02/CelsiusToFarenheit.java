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
public class CelsiusToFarenheit {
    public static void main(String[] args)
    {
        float c, f;
        System.out.println("Enter the temperature in celsius : ");
        Scanner scan = new Scanner(System.in);
        c = scan.nextFloat();
        f = c*9/5+32;
        System.out.println("Temperature in Farenheit : "+f);
    }
    
}
