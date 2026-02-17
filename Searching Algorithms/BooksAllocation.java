/*
Book Allocation Problem – Statement
You are given:
An array arr[] of size n,
where arr[i] represents the number of pages in the i-th book.
An integer m representing the number of students.
Your task is to allocate books to students such that:
Each student gets at least one book.
Each student gets continuous books only.
A book can be assigned to only one student.
Your goal is to:
Minimize the maximum number of pages assigned to any student.
Return that minimum value.

LOGIC :
Search answer between largest book and total pages.
For each mid, greedily count students needed.
Shrink search space based on whether students ≤ m.
*/
import java.util.Scanner;
public class BooksAllocation{
  public static boolean isValid(int arr[], int m, int max_value)
  //greedy algorithm
  {
    int s=1, //start with 1 student
     sum=0;
    for(int i=0; i<arr.length; i++){
      if(sum+arr[i]>max_value) 
      //if it exceeds max value
      {
        s++; //assign new student
        sum=arr[i]; //start with current book
      }
      else{
        sum+=arr[i]; //continue with the same student
      }
    }
    if(s<=m){
      return true;
    }
    else return false;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the total no. of books : ");
    int n=sc.nextInt();
    if(n==0){
        System.out.println("There are no books!");
        sc.close();
        return;
    }
    System.out.print("Enter the no. of pages in each book : ");
    int[] books=new int[n];
    books[0]=sc.nextInt();
    int sum=books[0];
    int max=books[0];
    for(int i=1;i<n;i++){
        books[i]=sc.nextInt();
        max=Math.max(max, books[i]);
        sum+=books[i];
    }
    System.out.print("Enter the number of students : ");
    int m=sc.nextInt();
    if(n<m){
      System.out.println("There are no enough books to allocate for each student!");
      sc.close();
      return;
    }
    int low=max, //minimum possible answer
     high=sum, //maximum possible answer
      mid;
    int ans=high;
    while(low<=high){
      mid=low+(high-low)/2;
      if(isValid(books,m,mid)){
        ans=mid; //store mid
        high=mid-1; //shrink to get minimum possible answer
      }
      else low=mid+1; //try larger value
    }
    System.out.println("Result : "+ans);
    sc.close();
  }
}
/*
TIME COMPLEXITY : O(n* log(sum))
Auxiliary Space : O(1)

OUTPUT 1:
Enter the total no. of books : 4
Enter the no. of pages in each book : 12 34 67 90
Enter the number of students : 2
Result : 113


*/