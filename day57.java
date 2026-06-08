public class day57{
    public static void half_triangle(int n){
        for(int i=0;i<=n;i++){
            for(int j=n-i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        half_triangle(n);
    }
}

