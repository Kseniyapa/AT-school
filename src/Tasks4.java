import java.util.Scanner;

public class Tasks4 {
    int[][] matrix;
    int rows, cols;

    public static void main(String[] args) {
        new Tasks4().foo();
    }

    public void foo() {
        Scanner scan = new Scanner(System.in);
        int requests, val1, val2;
        String op;
        rows = scan.nextInt();
        cols = scan.nextInt();
        requests = scan.nextInt();

        matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < requests; i++) {
            op = scan.next();
            val1 = scan.nextInt() - 1;
            val2 = scan.nextInt() - 1;

            switch (op) {
                case "c":
                    changeCols(val1, val2);
                    break;
                case "r":
                    changeRows(val1, val2);
                    break;
                case "g":
                    System.out.println(matrix[val1][val2]);
                    break;
            }
        }
    }

    private void changeRows(int row1, int row2) {
        int temp;
        for (int i = 0; i < cols; i++) {
            temp = matrix[row1][i];
            matrix[row1][i] = matrix[row2][i];
            matrix[row2][i] = temp;
        }
    }

    private void changeCols(int col1, int col2) {
        int temp;
        for (int i = 0; i < rows; i++) {
            temp = matrix[i][col1];
            matrix[i][col1] = matrix[i][col2];
            matrix[i][col2] = temp;
        }
    }
}
