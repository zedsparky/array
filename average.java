public class average {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int sum=0;
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
 // here we are typecasting sum to double to get the average as a decimal value instead of an integer value.
        System.out.println("Sum: " + sum);      
        double avg = (double) sum / arr.length;
        System.out.println("Average: " + avg);
    }
}
