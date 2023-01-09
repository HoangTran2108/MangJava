import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, i, index;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int arr[] = new int[n];

        System.out.println("Nhập các phần tử của mảng: ");
        for (i = 0; i < n-1; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Nhập số nguyên x: ");
        int x = scanner.nextInt();
        System.out.println("Nhập vị trí của x: ");
        int indexX = scanner.nextInt();

        for (i = n-1; i > indexX; i--) {
            arr[i] = arr[i-1];
        }
        arr[indexX] = x;
        System.out.println("Mảng sau khi thêm phần tử " + x + " là: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}