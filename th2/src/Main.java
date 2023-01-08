import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] students = {"A1", "A2", "A3", "A4", "A5"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Vị trí của " + input_name + " trong danh sách là: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("không tìm thấy " + input_name + " trong danh sách.");
        }
    }
}