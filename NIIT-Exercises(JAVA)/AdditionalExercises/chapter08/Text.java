/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter08;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
/**
 *
 * @author harsh
 */
public class Text {
    public static void main(String[] args){
        System.out.println("To enter the path press 1 and for default press 2 : ");
        int option;
        Scanner scan = new Scanner(System.in);
        option = scan.nextInt();
        String path;
        if(option==1){
            System.out.println("Enter file path : ");
            path = scan.next();
        }
        else
            path = "E:\\Sameer chauhan\\HARSH personal\\programing database\\java projects\\NIITExercises\\AdditionalExercises\\src\\chapter08\\new.txt";
        
        try(BufferedWriter file = new BufferedWriter(new FileWriter(path,true))){
            String text ;
            text = scan.nextLine();   //just have to  use it, without it the program not accepting the text so adding an extra nextLine() just worked
            while(!text.endsWith(" end")){
                System.out.println("Enter the text : ");
                text = scan.nextLine();
                file.write(text);
                file.newLine();
                System.out.println("Text written to the file");
            }
        }
        catch(IOException io){
            System.err.println("File crash case");
        }
    }
}
