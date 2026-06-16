public class binarySearch {
    public static int Search(int[] arr, int key){ //method header takes arraya and key or target to search
        int low=0; //search space from
        int high=arr.length-1; //end of search space
        while (low<=high) { //keep searching for valid range
            //if low>high then search space is empty hence stop
            int mid=(low+high)/2; //finds middle index 
            if (arr[mid]==key) { //compare if key equlas to mid index value
                return mid;
            } else if (key<arr[mid]) {
                high=mid-1;
            } else {
                low=mid+1;
            }
        }
        return -1;//not found
}

    public static void main(String[] args) {
        //binary works for only sorted array 
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int index = Search(arr, 70);
        System.out.println("found at index = "+index);
    }
}
/* time complexity = O(log(n))
because binary search is logratmic growth
space complexity = O(1) as only one variable is used (i) */