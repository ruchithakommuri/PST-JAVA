import java.util.*;

public class Week4Task10 {

    static void rotate(int[][] matrix, int r) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] result = new int[m][n];

        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {

            ArrayList<Integer> list = new ArrayList<>();

            for (int j = layer; j < n - layer; j++)
                list.add(matrix[layer][j]);

            for (int i = layer + 1; i < m - layer; i++)
                list.add(matrix[i][n - layer - 1]);

            for (int j = n - layer - 2; j >= layer; j--)
                list.add(matrix[m - layer - 1][j]);

            for (int i = m - layer - 2; i > layer; i--)
                list.add(matrix[i][layer]);

            int size = list.size();
            int shift = r % size;

            int index = 0;

            for (int j = layer; j < n - layer; j++)
                result[layer][j] = list.get((index++ + shift) % size);

            for (int i = layer + 1; i < m - layer; i++)
                result[i][n - layer - 1] = list.get((index++ + shift) % size);

            for (int j = n - layer - 2; j >= layer; j--)
                result[m - layer - 1][j] = list.get((index++ + shift) % size);

            for (int i = m - layer - 2; i > layer; i--)
                result[i][layer] = list.get((index++ + shift) % size);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        rotate(matrix, 2);
    }
}
