/*
Majority Element — Moore's Voting Algorithm
Given an array, find the element that appears more than n/2 times.
LOGIC : 
If an element appears more than half the time,
it will survive all pair cancellations with other elements.
Keep two variables candidate, count
*/
import java.util.Scanner;
public class MajorityElement{
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of the array : ");
    int n=sc.nextInt();
    if(n==0){
        System.out.println("Array is empty!");
        sc.close();
        return;
    }
    int arr[]=new int[n];
    System.out.print("Enter the array elements (votes) : ");
    int count=0, candidate=-1;
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        if(count==0){
            candidate=arr[i];
        }
        if(arr[i]==candidate){
            count++;
        }
        else count--;
        //when we encounter an element different from the current candidate, 
        //we decrement count because we are cancelling out pairs of different elements.
    }
    //verification to check if the majority element appears more than n/2 times
    count=0;
    for(int i=0;i<n;i++){
        if(arr[i]==candidate){
            count++;
        }
    }
    if(count>n/2){
       System.out.println("Majority Element : "+candidate);
    }
    else 
        System.out.println("No Majority Element ");
    
    sc.close();
 }
}
/*
TIME COMPLEXITY : O(n)
SPACE COMPLEXITY : O(1)

OUTPUT 1 :
Enter the size of the array : 8
Enter the array elements (votes) : 2 1 2 3 1 2 2 1    
Majority Element : 2

OUTPUT 2:
Enter the size of the array : 4
Enter the array elements (votes) : 1 2 1 2
No Majority Element 

OUTPUT 3:
Enter the size of the array : 0
Array is empty!
*/