import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng ");
        int m = scanner.nextInt();
        System.out.print("Nhập số cột ");
        int n = scanner.nextInt();

        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập vào phần tử có vị trí " + "[" + i + "]" + "[" + j + "] " );
                arr[i][j] = scanner.nextInt();
            }
        }

            System.out.print("Nhập vào cột muốn tính tổng ");
            int index = scanner.nextInt();

            int total = 0;
            for (int j = 0; j < m; j++) {
                total += arr[j][index - 1];
            }
            System.out.println("Tổng cột " + index + " là: " + total);
        }

}