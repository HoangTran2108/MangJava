import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("chọn số tương ứng để thực hiện nhiệm vụ:");
            System.out.println("1. Độ F sang độ C");
            System.out.println("2. Độ C sang độ F");
            System.out.println("0. Thoát");
            System.out.println("Nhập vào lựa chọn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Nhập vào giá trị độ F: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Giá trị độ C: " + fahrenheitToCelsius(fahrenheit));
                    break;
                }
                case 2:{
                    System.out.println("Nhập vào giá trị độ C: ");
                    celsius = scanner.nextDouble();
                    System.out.println("Giá trị độ F: " + celsiusToFahrenheit(celsius));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}