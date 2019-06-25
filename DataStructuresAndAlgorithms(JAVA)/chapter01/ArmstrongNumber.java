/*Algo-:
1. Accept a number n;
2. Set temp=n, rem, arm=0;
3. repeat the steps until (n>0)
   a. rem= n%10;
   b. arm = arm + (rem*rem*rem);
   c. n=n/10;
4. if arm = temp 
     print "Armstrong no.";
   else
     print "not a.no.";
*/
package chapter01;
import java.util.Scanner;
/**
 *
 * @author harsh
 */
public class ArmstrongNumber {
    public static void main(String[] args){
        int temp, rem, arm=0, n;
        System.out.println("Enter the no. : ");
        n = Integer.parseUnsignedInt(new Scanner(System.in).nextLine());
        temp = n;
        while(n>0){
            rem= n%10;
            arm = arm + (rem*rem*rem);
            n = n/10;
    }
        if(arm == temp)
            System.out.println(temp+" is a armstrong no.");
        else
            System.out.println(temp+" is not an amstrong no.");
    }
}
/*public class ArmstrongNumber {              //to print the armstrong no.
    public static void main(String[] args){
        long temp, rem, arm, n;
        for(temp=1;temp>0;temp++){    //test condition is upto infinity or u can fluctuate it urself
        n=temp;                       
        arm=0;
        while(n>0){
            rem= n%10;
            arm = arm + (rem*rem*rem);
            n = n/10;
    }
        if(arm == temp)
            System.out.println(temp+" is a armstrong no.");
    }}
}*/