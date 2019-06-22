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
public class Grocery {
    
    float weight;
    private void weightNow()
    {
        weight = 0;
    }
    private void checkWeight()
    {
        System.out.println(weight);
    }
    public static void main(String[] args)
    {
        Grocery obj = new Grocery();
        obj.weightNow();
        obj.checkWeight();
    }
}
