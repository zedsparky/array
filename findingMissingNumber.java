public class findingMissingNumber {
    public static void missing(int arr[]){
        int sum=0;
        int a=0;
        int n = arr.length + 1;
        int totalSum = (n * (n + 1)) / 2;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (totalSum - sum == 0) {
            System.out.println("nothing missing in array");
        } else {
            a = totalSum - sum;
            System.out.println(a + " is the missing element");
        }
    }public static void main(String[] args) {
        int[] arr={1,2,4,5,6,7,8,9};
        missing(arr);
    }
}