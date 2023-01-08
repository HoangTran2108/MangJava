public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 4, 0, 9, 2};
        int index = minValue(arr);
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + arr[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}