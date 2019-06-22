/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter01;

/**
 *
 * @author harsh
 */
public class SampleClass {
    
    public int counter = 1;
    private void display()
    {
        System.out.println(counter);
    }
    public static void main(String[] args)
    {
        SampleClass obj = new SampleClass();
        obj.display();
    }
}
