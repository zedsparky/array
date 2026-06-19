// wrong solution
public class leetcode169_majority_element {
    public static void main(String[] args) {
        int [] arr={10,10,10,20,20,20,35,45};
        int maxFreq = 0;
        int element = -1;
     
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
          int freq=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                
                }
            }
         
        if(freq > maxFreq) {
                maxFreq = freq;
                element = arr[i];
            }
        }

        System.out.println("Element = " + element);
        System.out.println("Frequency = " + maxFreq);
    }
}