public class MInElement {
    public static void main(String[] args) {
     int[] arr = {40,10,70,25,90};
     int min =arr[0];
     for (int j = 0; j < arr.length; j++) {
         if (arr[j]<min){
            min=arr[j];
         } 
     }   System.out.println(min);
    }
}
