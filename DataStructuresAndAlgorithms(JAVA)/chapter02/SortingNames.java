
package chapter02;
import java.util.Scanner;
/**
 *
 * @author harsh
 */
public class SortingNames {
    private static void Sort(String[] ar,int size){
        String temp;
        for(int i=0;i<size;i++){
            for(int j=i+1; j<size; j++){
                if(ar[i].toLowerCase().compareTo(ar[j])>0){     //compares the string lexographically visit oracle.docs to find more of compareTo function
                    temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size : ");
        int n = scan.nextInt();
        String[] a = new String[n];
        System.out.println("Enter elements");
        String i=scan.nextLine();   //just a waste statement i just have to do it its ur choice
        for(int k=0;k<n;k++)
            a[k] = scan.nextLine();
        Sort(a,n);
        System.out.println("Sorted array : ");
        for(int l=0;l<n;l++)
            System.out.println(a[l]);
        
    }
}
