public class linearSearch {
    public static void main(String[] args) {
        int[] arr={40,10,70,25,90};
        int target=70;
        boolean found=false;
       for (int j = 0; j < arr.length; j++) {
            if (arr[j]==target) {
                System.out.println("found at index "+j);
               found=true;
                break;
            }
        }
        if (!found) {
                System.out.println("not found");
        }
                
    }
}

