public class day58 {
    public static int binary_search(int arr[], int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=end-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int target=8;
        int a=binary_search(arr, target);
        if(a!=-1){
            System.out.println("element found at index:"+a);
        }
        else{
            System.out.println("element not found");
        }
    }
}

