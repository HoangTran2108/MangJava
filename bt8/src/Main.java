import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Nhập vào 1 chuỗi ký tự: ");
        String str = scanner.next();

        System.out.print("Ký tự cần đếm: ");
        char ch = (char) scanner.next().charAt(0);

        int count=0;
        for (int i=0; i<str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("số lần xuất hiện của " + ch + ": là " + count );
}
}