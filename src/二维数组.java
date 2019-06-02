public class 二维数组 {
    public static void main(String[] args) {
        int[][] ck = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        System.out.println(Number(ck,44));
        System.out.println(Number(ck,12));
        System.out.println(Number(ck,33));
        System.out.println(Number(ck,19));
    }

    static boolean Number(int[][] matrix,int target) {
        if(matrix.length<=1){
            return false;
        }
        int row=matrix[1].length-1;
        int col=0;
        while(row>=0 && col<matrix[0].length){
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                col++;
            }else if(matrix[row][col]>target){
                row--;
            }
        }
        return false;
    }
}
