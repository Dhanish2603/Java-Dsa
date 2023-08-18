public class diagnol_sum_7 {
    public int diagonalSum(int[][] mat) {
        int row = mat.length;
        if(row ==1){
            return mat[0][0];
        }
            int count = 0;
       
            for(int i = 0;i<row;i++){
                // if(col%2 ==0){
                    count += mat[i][i] + mat[i][row-i-1];
                // }
                // else{
                //     if(row-i == i)
                //     count += mat[i][i];
                //     else
                //     count += mat[i][i] + mat[i][row-i-1];
                // }
            }
            if(row%2==1){
                count = count - mat[row/2][row/2];
            }
        return count;
    }
}
