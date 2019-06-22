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
            path = "E:\\Sameer chauhan\\HARSH personal\\programing database\\java projects\\NIITExercises\\Exercises\\src\\chapter08\\new.txt";
        try(BufferedWriter file = new BufferedWriter(new FileWriter(path,true))){
            String text = " ";
            while(text.matches("\\send\\s*$")){
                text = scan.nextLine();
                char buffer[] = new char[text.length()];
                text.getChars(0, text.length(), buffer, 0);
                file.write(buffer);
                System.out.println("Text written to the file");
            }
        }
        catch(IOException io){
            System.err.println("File crash case");
        }
    }
}
