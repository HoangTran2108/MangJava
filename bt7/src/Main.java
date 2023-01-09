import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng, cột của ma trận vuông: ");
        int n = scanner.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập vào phần tử có vị trí " + "[" + i + "]" + "[" + j + "] " );
                arr[i][j] = scanner.nextInt();
            }
        }

        int total = 0;
        for (int k = 0; k < n; k++) {
            total += arr[k][k];
        }
        System.out.println("Tổng đường chéo chính của ma trận là: " + total);
    }

}