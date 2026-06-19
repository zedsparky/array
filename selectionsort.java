import java.util.Scanner;

public class selectionsort {
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
        // outer loop to select index
        System.out.println();
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            int temp = 0;
            // inner loop to perform selection sort
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;

                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        // print sorted array
        System.out.print("sorted array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}