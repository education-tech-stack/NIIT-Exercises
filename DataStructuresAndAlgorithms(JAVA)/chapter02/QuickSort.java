/*
Algo-:      //efficient for sorting large lists
            //if pivot is the first element then best and worst case efficiency is O(n^2)
            // "  "       "   median(approx) then best case efficiency is O(nlogn) and for worst case is O(n^2)
            //the approx no. of reductions required to sort a list of n elements is logn
QuickSort(low, high)    //low is the index of the first element and high of last element
1. if(low>high)
    return;
2. Set pivot = ar[low];
3. Set i=low + i;
4. Set j=high;
5. Repeat until i>high or ar[i] > pivot    //Searching for a element greater than pivot
    i++;
6. Repeat until j<low or ar[j] < pivot
    j--;
7. If i<j       //if greater is on the left of smaller element
    Swap ar[i] with ar[j];
8. If i<=j
    go to 5;
9. If low<j
    Swap ar[low] with ar[j];
10. QuickSort(low,j-1);     //applying to the left  of the list
12. QuickSort(j+1,low);     //applying to the right of the list
*/
package chapter02;
import java.util.Scanner;
/**
 *
 * @author harsh
 */
public class QuickSort {
private static void quicksort(int ar[],int l,int u)
{
    int j;
    if(l<u)
    {
        j=partition(ar,l,u);    //insert the pivot at right position and return the pivot index
        quicksort(ar,l,j-1);    //sort the array left  to the pivot 
        quicksort(ar,j+1,u);    //sort the array right to the pivot
    }
}
private static int partition(int ar[],int l,int u)
{
    int temp,v,i,j;
    v=ar[l];    //pivot
    i=l;
    j=u+1;  //why +1? Bcz its is going to decrease using do-while
    do
    {
        do {i++;} while((ar[i]<v) && (i<=u));   //to find element larger to the pivot
        do {j--;} while(v<ar[j]);   //to find element smaller than pivot
        if(i<j)     //swapping
        {
            temp=ar[i];
            ar[i]=ar[j];
            ar[j]=temp;
        }
    }while(i<j);        //until the pivot is in its right position
    ar[l]=ar[j];        //interchanging the last elements
    ar[j]=v;
    return (j);     //returning the pivot position
}
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size : ");
        int n = scan.nextInt();
        int[] a = new int[n+n];
        System.out.println("Enter elements");
        for(int k=0;k<n;k++)
            a[k] = scan.nextInt();
        quicksort(a,0,n-1);
        System.out.println("Sorted array : ");
        for(int l=0;l<n;l++)
            System.out.println(a[l]);
        
    }
}
