/*
Problem:n Sort an array in ascending order using Bubble Sort.

Example: Input: {54, 88, 45, 63, 99, 99, 55, 48}
Output: {45, 48, 54, 55, 63, 88, 99, 99}
Logic:
1. Compare adjacent elements.
2. If left element is greater than right element,
   swap them.
3. After one complete pass, the largest element
   moves to its correct position at the end.
4. Repeat the process for the remaining unsorted part.
5. Continue until the entire array becomes sorted.

Variables:
i    -> Current pass number.
j    -> Current comparison index.
temp -> Temporary variable used for swapping.

Outer Loop: Controls the number of passes.
Inner Loop: Compares adjacent elements and performs swapping.

Condition: if(arr[j] > arr[j + 1])

Swap:
temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;

Time Complexity:
Best Case    : O(n)  (with optimization)
Average Case : O(n²)
Worst Case   : O(n²)

Space Complexity: O(1)

Key Idea:
After every pass, the largest element
"bubbles up" to the end of the array.
*/
public class bubbleSort {
    public static void Bubble(int arr[]) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {54, 88, 45, 63, 99, 99, 55, 48};
        Bubble(arr);
    }
}
