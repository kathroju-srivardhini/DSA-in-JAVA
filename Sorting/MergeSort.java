/*
Sort the given array in ascending order using Merge Sort.
LOGIC :
Divide the array into two halves.
Recursively sort both halves
Merge the two sorted halves
*/
import java.util.Scanner;
public class MergeSort{
        public static void mergeSort(int[] arr, int low, int high){
            if(low<high){
                int mid= low + (high-low)/2;
                mergeSort(arr,low,mid);
                mergeSort(arr,mid+1,high);
                merge(arr, low, mid, high);
            }
        }
        public static void merge(int arr[], int low, int mid, int high){
            int a=mid-low+1;
            int b=high-mid;
            int h1[]=new int[a]; //duplicate array for 1st half
            int h2[] =new int[b]; //duplicate array for 2nd half
            int i=0, j=0, k=low;
            for(i=0;i<a;i++){
                h1[i]=arr[low+i];
            }
            for(j=0;j<b;j++){
                h2[j]=arr[mid+1+j];
            }
            i=0;
            j=0;
            while(i<a && j<b){
                if(h1[i]<=h2[j]){ //merge in ascending order
                    arr[k]=h1[i];
                    i++;
                    k++;
                }
                else{
                    arr[k]=h2[j];
                    j++;
                    k++;
                }
            }
            while(i<a){ //add remaining elements of h1
                arr[k]=h1[i];
                i++;
                k++;
            }
            while(j<b){ //add remaining elements of h2
                arr[k]=h2[j];
                j++;
                k++;
            }
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the size of the array : ");
            int n=sc.nextInt();
            if(n==0){
                System.out.println("Array is Empty!");
                sc.close();
                return;
            }
            int[] arr=new int[n];
            System.out.printf("Enter the %d integer array elements : ",n);
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            int low=0, high=n-1;
            mergeSort(arr,low,high);
            System.out.print("Sorted Array : ");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            sc.close();
        }
}
/*
TIME COMPLEXITY : O(n log n)
The array is divided repeatedly into halves : O(log n)
At each level, arrays are merged. Total elements processed in a level is n. SO O(n)
Auxiliary space : O(n)
At every merge step, we create temporary arrays that together store n elements total at a level.

OUTPUT 1:
Enter the size of the array : 5
Enter the 5 integer array elements : 12 4 6 18 9
Sorted Array : 4 6 9 12 18 

OUTPUT 2:
Enter the size of the array : 0
Array is Empty!
*/