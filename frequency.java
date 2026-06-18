/*
Problem:
Find the frequency (number of occurrences) of each unique
element present in the array.

Example:

Input:
{10,10,1,20,50,20,30,30}

Output:
10 -> 2
1  -> 1
20 -> 2
50 -> 1
30 -> 2

Logic:

1. Traverse the array using an outer loop.

2. For each element, check whether it has already
   appeared before the current index.

3. If the element has already appeared,
   skip it using continue.

4. If it is a new element,
   initialize frequency = 0.

5. Traverse the entire array and count how many
   times the current element occurs.

6. Print:
      element -> frequency

7. Repeat until all elements are processed.

Time Complexity:
O(n²)

Reason:
For every element, we may scan the entire array.

Space Complexity:
O(1)

Reason:
Only a few extra variables are used.
*/
public class frequency {
    public static void freq(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            boolean already_appeared = false;

            for (int j = 0; j < i; j++) {

                if (arr[i] == arr[j]) {
                    already_appeared = true;
                    break;
                }
            }
            if (already_appeared) {
                continue;
            }
            int freq = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                }
            }
            System.out.println(arr[i] + " -> " + freq);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 10, 1, 20, 50, 20, 30, 30 };
        freq(arr);
    }
}