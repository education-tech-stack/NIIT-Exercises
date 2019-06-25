/*
Algo-:
1. Accept the value of n;
2. for loop i=2;i<=n/2;i++
   a. if n%i=0 break;
3. if i=n/2+1 "prime no"
   else
     "not a prime no.
*/
package chapter01;
import java.util.Scanner;
/**
 *
 * @author harsh
 */
public class PrimeNo {
    public static void main(String[] args){
        int n, i;
        System.out.println("Enter a no. : ");
        n = Integer.parseInt(new Scanner(System.in).nextLine());
        for ( i=2; i<=n/2; i++)
            if(n%i==0) break;
        if(i==n/2+1)
            System.out.println("It's a prime no.");
        else
            System.out.println("Not a prime no.");
    }
}
/*public class PrimeNo {                                  //to print the prime nos.
    public static void main(String[] args){
        int n=1, i ,count=0;
        while(n<100000){      \\fluctuate the integer
        for ( i=2; i<=n/2; i++)
            if(n%i==0) break;
        if(i==n/2+1){
            System.out.println(n+" is a prime no.");
            count++;
        }
        n++; 
    }
        System.out.println("Total nos. of primes : "+count);
    }
}*/