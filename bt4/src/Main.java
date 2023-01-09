import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số hàng: ");
        int m = scanner.nextInt();

        System.out.println("Nhập số cột: ");
        int n = scanner.nextInt();

        int[][] a = new int[m][n];
        int max = a[0][0];
        int index1 =0;
        int index2 =0;
        for (int i = 0; i<m ; i++){
            for (int j = 0; j<n ; j++) {
                System.out.println("Nhập vào phần tử có vị trí " + "[" + i + "]" + "[" + j + "]");
                a[i][j] = scanner.nextInt();
                if (max<a[i][j]) {
                    max = a[i][j];
                    index1 = i;
                    index2 = j;
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + max + " tại toạ độ " + "[" + index1 + "]" + "[" + index2 + "]");
    }
}