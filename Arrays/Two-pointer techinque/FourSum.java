/*
Given an array and a target, return all unique quadruplets that sum to target.
LOGIC : 
Sort the array
Fix first number (i)
Fix second number (j)
Use two pointers (left, right) to find remaining two
*/
import java.util.Scanner;
import java.util.Arrays;
public class FourSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("array is empty!");
            sc.close();
            return;
        }
        System.out.print("Enter the integer array elements : ");
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Enter the target : ");
        int target=sc.nextInt();
        int i,j,left, right;
        long temp;
        boolean found=false;
        for(i=0;i<n-3;i++){

            if(i>0 && arr[i]==arr[i-1]) continue; //skip duplicates

            if((long)arr[i] + arr[i+1] + arr[i+2] + arr[i+3] > target) break;
            //If smallest possible sum for current i is already greater than target
            // No future combination can work

            if(arr[i]+arr[n-1]+arr[n-2]+arr[n-3]<target) continue;
            //If largest possible sum for current i is still less than target
            //This i cannot work, try with larger i

            for(j=i+1;j<n-2;j++){
                if(j>i+1 && arr[j]==arr[j-1]) continue; //skip duplicates

                if(arr[i]+arr[j]+arr[j+1]+arr[j+2] > target) break;
                //If smallest possible sum for current i is already greater than target
                // No future combination can work
                
                left=j+1;
                right=n-1;
                while(left<right){
                    temp=(long)arr[i]+arr[j]+arr[left]+arr[right];
                    if(temp==target){
                        System.out.printf("Quadrapulets : [%d, %d, %d, %d]\n",arr[i],arr[j],arr[left],arr[right]);
                        while(left<right && arr[left]==arr[left+1]) left++; //skip duplicates
                        while(left<right && arr[right]==arr[right-1]) right--; //skip duplicates
                        found=true;
                        left++;
                        right--;
                    }
                    else if(temp>target) right--; //move to left
                    else left++; //move to right
                }
            }
        }
        if(!found){
            System.out.println("No quadrapulent found!");
        }
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n^3)
SPACCE COMPLEXITY : O(1)

OUTPUT 1:
Enter the size of the array : 10
Enter the integer array elements : -5 4 1 0 1 2 4 -6 5 2
Enter the target : 4
Quadrapulets : [-6, 1, 4, 5]
Quadrapulets : [-6, 2, 4, 4]
Quadrapulets : [-5, 0, 4, 5]
Quadrapulets : [-5, 1, 4, 4]
Quadrapulets : [-5, 2, 2, 5]
Quadrapulets : [0, 1, 1, 2]

OUTPUT 2:
Enter the size of the array : 2
Enter the integer array elements : 5 6
Enter the target : 4
No quadrapulent found!

OUTPUT 3:
Enter the size of the array : 0
array is empty!
*/