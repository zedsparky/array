public class fetechSmallest_Largest {
    public static void fetch(int arr []){
        int largest=arr[0];
        int smallest =arr[0];
        for (int i = 1; i < arr.length; i++) {
             if(arr[i] > largest){
            largest = arr[i];
           }
             if(arr[i] < smallest){
            smallest = arr[i];
        } 
    }System.out.println("largest element = " + largest);
    System.out.println("smallest element = " + smallest);
    }
    
    public static void main(String[] args) {
        int arr[]={10,85,46,23,75,99,12};  
        System.out.print("array = ");

        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
        
        }System.out.println();
         fetch(arr);
    }
    
}
