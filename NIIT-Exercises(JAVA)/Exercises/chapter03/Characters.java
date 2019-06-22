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
public class Characters {
    public static void main(String[] args)
    {
        char ch;
        System.out.print("Enter a character : ");
        Scanner scan = new Scanner(System.in);
        ch = scan.next().charAt(0);
        switch(ch)
        {
            case 'a': case 'A':System.out.print("It's a vowel");
            break;
            case 'e': case 'E':System.out.print("It's a vowel");
            break;
            case 'i': case 'I':System.out.print("It's a vowel");
            break;
            case 'o': case 'O':System.out.print("It's a vowel");
            break;
            case 'u': case 'U':System.out.print("It's a vowel");
            break;
            default:System.out.print("It's a not a vowel");
        }
        
        
    }
}
