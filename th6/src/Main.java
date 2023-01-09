import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        do {
            System.out.print("Nhập vào số lượng sinh viên: ");
            size = scanner.nextInt();
            if (size>30) {
                System.out.println("Số lượng tối đa là 30");
            }
        } while (size>30);

        int count =0;
        double[] arr = new double[size];
            for (int i=0; i<size; i++) {
                System.out.print("Nhập điểm số sinh viên thứ "+ (i +1) + ": ");
                arr[i] = scanner.nextInt();
                if (arr[i]>=5) {
                    count++;
                }
            }
        System.out.println("Số sinh viên thi đỗ là: " + count);
    }
}