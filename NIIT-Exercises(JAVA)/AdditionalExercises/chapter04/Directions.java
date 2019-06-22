/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter04;

/**
 *
 * @author harsh
 */
public class Directions {
    enum Direction{
        NORTH("0"), SOUTH("180"), EAST("90"), WEST("270"), NORTHEAST("45"), NORTHWEST("315"), SOUTHWEST("225"), SOUTHEAST("135");
        private final String deg;
        Direction(String d){
            deg=d;
        }
        String getDeg(){
            return deg;
        }
    }
    public static void main(String[] args){
        Directions obj = new Directions();
        Direction dir;
        for(Direction i : Direction.values()){
            System.out.println("Direction : "+i+"  Degrees : "+i.getDeg());
        }
            
        
    }
}
