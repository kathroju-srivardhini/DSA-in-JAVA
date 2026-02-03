/*
A java program to merge two sorted integer arrays. The output array must be sorted.
LOGIC: Using Two-pointer technique
one pointer tracks 1st array, one tracks 2nd array. one more pointer is used to track the resultant array.
From the 2 arrays, the smallest element is stored in the resultant. 
At last if any elements are remained stored in the resultant
*/
import java.util.Scanner;
public class MergeTwoArrays{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of 1st array : ");
        int n1=sc.nextInt();
        System.out.print("Enter the size of 2nd array : ");
        int n2=sc.nextInt();
        if(n1 == 0 && n2 == 0){
              System.out.println("Both the arrays are empty");
              sc.close();
              return;
          }

        int[] arr1=new int[n1];
        if(n1>0){
        System.out.print("Enter the 1st array elements (sorted in ascending order) : ");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
      }
        int[] arr2=new int[n2];
        if(n2>0){
        System.out.print("Enter the 2nd array elements (sorted in ascending order) : ");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
    }
        int p1=0, p2=0;
        int n=n1+n2;
        int[] res=new int[n];
        int k=0;//to track result array
        //p1 is to track 1st array and p2 is to track the 2nd array
        while(p1<n1&&p2<n2){
           if(arr1[p1]<arr2[p2]){
               res[k]=arr1[p1];
               p1++;
           }
           else{
            res[k]=arr2[p2];
            p2++;
           }
           k++;
        }
        //if any elements are remained in array1
        while(p1<n1){
            res[k]=arr1[p1];
            p1++;
            k++;
        }
        //if any elements are remained in array2
        while(p2<n2){
            res[k]=arr2[p2];
            p2++;
            k++;
        }
        System.out.print("Merged Array : ");
        for(int num=0;num<n;num++){
            System.out.print(res[num]+" ");
        }
        sc.close();
    }
}
/*
Time: O(n1 + n2)
Auxiliary space: O(n1 + n2) (result array)
Input space: given

OUTPUT 1:
Enter the size of 1st array : 4
Enter the size of 2nd array : 6
Enter the 1st array elements (sorted in ascending order) : 2 5 9 16
Enter the 2nd array elements (sorted in ascending order) : 1 6 14 22 64 90
Merged Array : 1 2 5 6 9 14 16 22 64 90 

OUTPUT 2:
Enter the size of 1st array : 0
Enter the size of 2nd array : 0
Both the arrays are empty
*/