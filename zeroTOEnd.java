public class zeroTOEnd {
    public static void zeroEnd(int arr[]){ 
    int position=0;
    for (int index = 0; index < arr.length; index++) {
        
        if (arr[index]!=0) {
        arr[position]=arr[index];
         position++;   
        }
    }while (position<arr.length) {
            arr[position] = 0;
        position++;
        }
    }
    public static void main(String[] args) {
        int arr[]={0,10,0,0,15,0,45,66};
        zeroEnd(arr);
        for (int i = 0; i < arr.length; i++) {
            
            System.out.print(arr[i]+" ");
        }
        
    }
}
