public class day69 {
    public static void print_patern(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print('*'+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        print_patern(n);
    }
}

