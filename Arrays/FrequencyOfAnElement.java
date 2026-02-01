//A java program to count the frequency (number of occurrences) of given element in the given array
//The program is space optimized as no array is used to store the elements
import java.util.Scanner;
public class FrequencyOfAnElement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an element to count the frequency : ");
        int key=sc.nextInt();
        System.out.print("Enter the total number of elements in an array : ");
        int n=sc.nextInt();
        if(n==0){
            System.out.print("Array is Empty");
            sc.close();
            return;
        }
        System.out.print("Enter the "+n+" array elements : ");
        int count=0;
        for(int i=0;i<n;i++){
           int num=sc.nextInt();
            if(num==key){
                count++;
            }
        }
        if(count==0){
            System.out.println("The given element is not found in the array");
            sc.close();
            return;
        }
        System.out.printf("The total number of occurrences of %d is %d\n",key,count);
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n)
SPACE COMPLEXITY : O(1)

OUTPUT 1:
Enter an element to count the frequency :11
Enter the total number of elements in an array : 8
Enter the 8 array elements : 23 11 46 11 59 64 11 52
The total number of occurrences of 11 is 3

OUTPUT 2:
Enter an element to count the frequency :18
Enter the total number of elements in an array : 5
Enter the 5 array elements : 16 34 97 58 26
The given element is not found in the array

*/