public class largest {
    public static void main(String[] args) {
        int largest=0;
        int arr[]={99,10,20,30};
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>largest) {
               largest=arr[i];
            }
        }System.out.println(largest);
    }
}
