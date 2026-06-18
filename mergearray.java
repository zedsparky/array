/*
Problem:
Given two arrays, create a new array that contains
all elements of the first array followed by all
elements of the second array.

Example:
arr1 = {10,20,85,45}
arr2 = {35,20,85}

Output:
{10,20,85,45,35,20,85}

Logic:
1. Create a new array of size:
      arr1.length + arr2.length

2. Copy all elements of arr1 into the new array.

3. Start from index arr1.length and copy
   all elements of arr2.

4. Print the merged array.

Time Complexity:
O(n + m)

Space Complexity:
O(n + m)
*/ 
public class mergearray {
    public static void merge(int arr1[], int arr2[]){
        int length1=arr1.length;
        int length2=arr2.length;

        int arr[]= new int[length1+length2];
//loop to copy array 1 value to new array 
        for (int i = 0; i < length1; i++) {
            arr[i]=arr1[i];
        }
//loop to copy array 2 value to new array 
        for (int i = 0; i < length2; i++) {
            arr[length1+i]=arr2[i];
        }
 //loop to print out the new array       
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }public static void main(String[] args) {

        int arr1[]={10,20,85,45};
        int arr2[]={35,20,85};
        merge(arr1, arr2);

       
        }
    }

