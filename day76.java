public class day76 {
    public static void print_reverse_arr(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public  static void print_array_pairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.println("("+curr+","+arr[j]+")");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        print_reverse_arr(arr);
        print_array_pairs(arr);
    }
}

