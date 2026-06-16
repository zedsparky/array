public class secondLargestElement {
    public static void main(String[] args) {
        
        int[] arr = {40,10,70,25,90};
        int largest=arr[0];
        int secondLargest=arr[0];
        for (int i : arr) {
            if (i>largest) {
               secondLargest=largest;
                largest=i;
                
            }
             else if (i> secondLargest){
                secondLargest=i;
            }
        }System.out.println(secondLargest);
    }
}