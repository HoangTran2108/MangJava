import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số phần tử: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        for(int i=0; i<size; i++) {
            System.out.print("Nhập vào giá trị phần tử thứ " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for(int j=0; j<size; j++) {
            if(min > arr[j]) {
                min = arr[j];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là " + min);
    }
}