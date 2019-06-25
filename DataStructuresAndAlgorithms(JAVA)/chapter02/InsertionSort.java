/*
Algo-:          --quadratic order of growth                                                 ---used for sorting short lists      
                ---if it is nearly sorted then Insertion is preffered than Bubble sort      ---best case efficieny O(n)
1. Repeat 2,3,4 and 5 varying i from 1->n-1;
2. Set temp = ar[i];
3. set j = i-1;
4. Repeat until j > 0 or aar[j] >= temp;
    a. Shift a[j] to ar[j+1];
    b. j--;
5. Store temp at ar[j+1];
*/
package chapter02;
import java.util.Scanner;
/**
 *
 * @author harsh
 */
public class InsertionSort {
    private static void Sort(int[] ar,int size){
        for ( int i=1;i<=size-1;i++){
            int temp = ar[i];
            int j=i-1;
            while(j>=0 && ar[j]>temp){
                ar[j+1]=ar[j];
                j--;
            }
            ar[j+1]=temp;
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
