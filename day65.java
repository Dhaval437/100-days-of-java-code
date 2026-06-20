public class day65{
    public static int binary_search(int arr[], int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target>mid){
                start++;
            }
            else{
                end--;
            }
        }
    return -1;
    }
    public static void main(String[]args){
        int arr[]={1,2,3,4,5,6,7};
        int target=3;
        int s=binary_search(arr,target);
        if(s!=-1){
            System.out.println("element found at index:"+s);
        }
        else{
            System.out.println("element not found");
        }
    }
}

