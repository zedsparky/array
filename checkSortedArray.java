public class checkSortedArray {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        boolean sorted = true;
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }
        if(sorted) {
            for (int i = 0; i < arr.length; i++) {
                 System.out.print("|"+arr[i]+"|");
            }System.out.println(" = sorted Array");
        } else {
            System.out.println("Unsorted Array");
        }
    }
}