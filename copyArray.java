/*
Problem:
Create a copy of an array.

Example:
Input:
{10,20,30,40,50}

Output:
Original Array : 10 20 30 40 50
Copied Array   : 10 20 30 40 50

Logic:
1. Create a new array of the same size.
2. Traverse the original array.
3. Copy each element to the same index in the new array.
4. Print both arrays.

Time Complexity:
O(n)

Space Complexity:
O(n)
*/
public class copyArray {
    public static void main(String[] args) {
       
        int arr[]={10,20,30,40};
        int length=arr.length;
        int newArray[]=new int [arr.length];

        for (int i = 0; i < length; i++) {
          
              newArray[i]=arr[i];  
            }
        
        for (int j = 0; j < newArray.length; j++) {
            System.out.println(newArray[j]);
        }
        
    }
}
