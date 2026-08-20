import java.util.*;

public class Week4Task9 {

    static int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;

        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                for (int x = Math.max(0, i - k);
                     x <= Math.min(m - 1, i + k); x++) {

                    for (int y = Math.max(0, j - k);
                         y <= Math.min(n - 1, j + k); y++) {

                        result[i][j] += mat[x][y];
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int k = 1;

        int[][] result = matrixBlockSum(mat, k);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
