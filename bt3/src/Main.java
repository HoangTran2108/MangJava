import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr3 = new int[6];
        for (int i=0; i< arr1.length; i++ ) {
            arr3[i] = arr1[i];
        }
        for (int j = arr3.length - 1; j >= arr1.length; j-- ) {
            arr3[j] = arr2[j - arr1.length];
        }
        System.out.println(Arrays.toString(arr3));
    }
}