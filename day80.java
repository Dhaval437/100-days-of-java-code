public class day80 {
    public static int linear_search(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static int binary_search(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start++;
            }
            else{
                end--;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int arr[]={1,2,3,4,5};
        int target=4;
        int s=linear_search(arr,target);
        if(s!=-1){
            System.out.println("element found at index:"+s);
        }
        else{
            System.out.println("element not found");
        }
        int a=binary_search(arr,target);
        if(a!=-1){
            System.out.println("element found at index:"+a);
        }
        else{
            System.out.println("element not found");
        }
    }
}
