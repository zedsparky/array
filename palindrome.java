public class palindrome {
    public static void check(int arr[]){
        int left=0;
        int right=arr.length-1;
        while (left<right) {
            if(arr[left]!=arr[right]){
                System.out.println("this ia not a palindrome");
                return ;
               
            } left++;
                right--;
        }System.out.println("this is a palindrome");
    }public static void main(String[] args) {
        int arr[]={10,20,30,20,10};
        System.out.print("Array = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }System.out.println();
        check(arr);
    }
}
 