/*
Algo-:                  ---quadratic order of growth ---best case n-1
1. define array, size, temp;
2. repeat i vary 0->size 
   a. repeat j vary 0->size-1-i
   b. compare current and the next element 
   c. if current element is greater swap
3. Display the list
*/
package chapter02;
import java.util.Scanner;
/**
 *
 * @author harsh
 */
public class BubbleSort {
    private static void Sort(int[] ar,int size){
        int temp;
        for(int i=0;i<size;i++){
            for(int j=0; j<size-1-i; j++){
                if(ar[j]>ar[j+1]){
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size : ");
        int n = scan.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements");
        for(int k=0;k<n;k++)
            a[k] = scan.nextInt();
        Sort(a,n);
        System.out.println("Sorted array : ");
        for(int l=0;l<n;l++)
            System.out.println(a[l]);
        
    }
}
