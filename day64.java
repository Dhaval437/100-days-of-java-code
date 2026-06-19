public class day64{
    public static int linear_search(int arr[], int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int target=6;
        int s=linear_search(arr, target);
        if(s!=-1){
            System.out.println("element found at index:"+s);
        }
        else{
            System.out.println("element not found");
        }
    }
}

