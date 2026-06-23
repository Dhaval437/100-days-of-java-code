public class day68{
    public static int linear_search(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int target=4;
        int s=linear_search(arr, target);
        if(s!=-1){
            System.out.println("element founnd at index:"+s);
        }
        else{
            System.out.println("element not found");
        }
    }
}

