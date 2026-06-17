public class removeDuplicate {
public static int duplicates(int arr[]){
    int unique=0;
    for (int i = 1; i < arr.length; i++) {
        if (arr[unique]!=arr[i]) {
            unique++;
            arr[unique] = arr[i];
        } 
    }return unique+1;
}public static void main(String[] args) {
    int arr[]={10,20,30,40,50,60};
    int duplicateCount=duplicates(arr);
    if (duplicateCount==arr.length) {
        System.out.println("no duplicate in the array ");
    }else{
        System.out.println("duplicates found and removed");
          System.out.print("the array with duplictes removed : ");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
    
    }
  
    }
}
