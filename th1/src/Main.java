import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Nhập vào độ dài mảng ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Độ dài không được vượt quá 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập vào phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("Phần tử trong mảng: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "đảo ngược mảng: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "");
        }
    }
}