public class countEvenOdd {
    public static void evenOdd(int arr[]) {
        int EvenCount=0;
        int OddCount=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                EvenCount++;
               
            }else{
                OddCount++;  
                           
            }
        } System.out.println("total Even numbers in array = "+EvenCount); 
          System.out.println("total Odd numbers in array = "+ OddCount); 
    }
    public static void main(String[] args) {
        int arr[]={45,98,231,75,621,54,46,33,21,54};
        System.out.print("Array = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        } 
        System.out.println();
        evenOdd(arr);
    }
}
