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

        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Nhập số nguyên k: ");
        int k = scanner.nextInt();

        for (index = i = 0; i < n; i++) {
            if (arr[i] != k) {
                arr[index] = arr[i];
                index++;
            }
        }

        n = index;
        System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}