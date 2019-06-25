package chapter01;

/*
Algo-:
1. input n and m from the user
2. define and initialize three arrays two for storing data and one for storing merged array;
3. input the arrays using loops
4. repeat until i<n and j<m
   a. compare both the elements of the array 
   b. if a[] is shortest i++ 
   c. else j++
5. now copy the remaining elements to the third array
6. display the third array using loop
*/
import java.util.Scanner;
/**
 *
 * @author harsh
 */
public class MergingArray {
    public static void main(String[] args){
        int i=0, j=0, k=0, n, m;
        System.out.println("Enter array size A");
        Scanner scan=new Scanner(System.in);
        n = scan.nextInt();
        System.out.println("Enter array size B");
        m = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] c = new int[m+n];
        System.out.println("Enter array elements for array A: ");
        for(int x : a)
            x = scan.nextInt();
        System.out.println("Enter array elements for array B: ");
        for(int y : b)
            y = scan.nextInt();
        while(i<n && j<m){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
                k++;
            }
            else{
                c[k]=b[j];
                j++;
                k++;
            }
        }
        while(i<n){
            c[k]=a[i];
            i++;
            k++;
        }
        while(j<m){
            c[k]=b[j];
            j++;
            k++;
        }
        System.out.println("The merged array is : ");
        for(k=0;k<=m+n;k++)
            System.out.print(k+" ");
    }
}
