/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter02;

/**
 *
 * @author harsh
 */
public class ShiftOperators {
    public static void main(String[] args)
    {
        System.out.println("Performing Left  shift on 2 by 2 bits "+(2<<2));
        System.out.println("Performing Right shift on 2 by 2 bits "+(2>>2));
        System.out.println("Performing Unsigned right shift on -2 by 24 bits "+(-2>>>24));
    }
}
