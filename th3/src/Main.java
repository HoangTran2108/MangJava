import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Nhập vào số lượng tỷ phú ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Số lượng không được vượt quá 20");
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập vào giá trị tài sản thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.print("Giá trị tài sản lớn nhất là: " + max + " Tại vị trí thứ " + index);
    }
}