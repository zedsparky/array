/*
Problem: Rotate the array one position to the right.
Example: Input: {10,20,30,40,50}
Output: {50,10,20,30,40}
Logic:
1. Save the last element.
2. Shift all elements one position to the right.
3. Place the saved last element at index 0.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class rotateArray {
    public static void rotate(int arr[]){
//save variable is created to save the element at last index 
        int n = arr.length;
        int save = arr[n-1];
// Shift all elements one position to the right.
// Loop starts from the last index and moves left
// to avoid overwriting values before using them.
        for (int i =n-1 ; i >0; i--) {
            arr[i]=arr[i-1];            
        }
// next line put the last index saved value at start index        
        arr[0]=save;
//next loop prints the array with one bit rotated       
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        System.out.print("Array = ");
       
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        } 
        System.out.println();
        System.out.print("rotated array = ");
        rotate(arr);
    }
    
}

