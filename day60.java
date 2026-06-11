public class day60 {
    public static int count_element(int matrix[][],int target){
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int matrix[][]={{4,7,8},
                        {8,8,7}};
        int target=7;
        System.out.println(count_element(matrix, target));
    }
}

