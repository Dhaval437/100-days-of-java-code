public class day89{
    public static print_pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;i++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n=4;
        print_pattern(4);
    }
}

