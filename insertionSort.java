/*
Problem:
Sort an array in ascending order using Insertion Sort.

Example:
Input:
{50, 20, 40, 10, 30}

Output:
{10, 20, 30, 40, 50}

Logic:
1. Assume the first element is already sorted.
2. Pick the next element and store it in a variable called key.
3. Compare the key with elements on its left side.
4. Shift all elements greater than the key one position to the right.
5. Insert the key into the empty position created after shifting.
6. Repeat the process until the entire array becomes sorted.

Variables:
i   -> Current element being inserted.
key -> Value to be inserted into the sorted portion.
j   -> Index used to move left through the sorted portion.

Important Condition:
while(j >= 0 && arr[j] > key)

Meaning:
1. Stay within array bounds.
2. Continue while current element is greater than key.

Shift Operation:
arr[j + 1] = arr[j];

Insert Operation:
arr[j + 1] = key;

Time Complexity:
Best Case    : O(n)
Average Case : O(n²)
Worst Case   : O(n²)

Space Complexity:
O(1)

Key Idea:
Build a sorted portion of the array from left to right
by inserting each element into its correct position.

Memory Trick:
Insertion Sort = Shift larger elements and Insert the key.
*/
import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {

        // taking array values from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size = ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        // take array input
        System.out.println("element at indexs  : ");
        for (int j = 0; j < size; j++) {

            arr[j] = sc.nextInt();
        }
        sc.close();

        // print input array
        System.out.print("Array :" + " ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int key = 0;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

        }
    for(int i = 0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
}
}
