/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter08;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
/**
 *
 * @author harsh
 */
public class Searching {
    public static void main(String[] args){
        int count=0;
        String entry, split[], search;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word to search :");
        search = scan.next();
        try(BufferedReader file = new BufferedReader(new FileReader("file.txt"))){  //Set the path yourself
            while((entry=file.readLine())!=null){
                split = entry.split(" ");
                for(String show : split)
                    if(show.contains(search))
                        count++;
            }
        }
        catch(IOException io){
            System.err.println("file crash case");
        }
        if(count==0)
            System.out.println("Word : "+search+" NOT FOUND");
        else
            System.out.println("word : "+search+" Found "+count+" times");
    }  
}
