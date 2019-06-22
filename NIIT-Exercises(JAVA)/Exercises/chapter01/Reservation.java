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
public class Reservation {
    
    int ticketid;
    private void showTicket()
    {
        System.out.println(ticketid);
    }
    Reservation(int id)
    {
        ticketid = id ;
    }
    public static void main(String[] args)
    {
        Reservation obj2 = new Reservation(500);
        obj2.showTicket();
    }
}
