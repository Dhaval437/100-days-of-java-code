public class day62 {
    public static void transpose_matricx(int matrix[][]){
        int transpose[][]=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void printMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},
                        {4,5,6}};
        System.out.println("original matrix:");
        printMatrix(matrix);
        System.out.println("transpose matrix:");
        transpose_matricx(matrix);
    }
}

