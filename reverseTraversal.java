public class reverseTraversal {
    public static void main(String[] args) {
     int[] arr = {10,20,30,40,50};
     int j=arr.length-1;
        for (int i = j; i>=0; i--) {
            System.out.println(arr[i]);
        }
}
}