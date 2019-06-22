/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter02;
import java.util.Scanner;
public class VolumeCylinder {
    private float r , h, volume;
    Scanner scan = new Scanner(System.in);
    VolumeCylinder()
    {
        r=0; h=0;
    }
    public void input()
    {
        System.out.println("Enter the following measurements : \nRadius :");
        r = scan.nextFloat();
       System.out.println("\n Height :");
       h = scan.nextFloat();
       compute();
    }
    public void compute()
    {
        volume = (22/7)*r*h*h;
        System.out.println("\n Volume of Cylinder :"+volume);
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args)
    {
        VolumeCylinder obj = new VolumeCylinder();
        obj.input();
    }
}
