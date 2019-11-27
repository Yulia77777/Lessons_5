import java.util.Random;

public class Task_4 {

    public static void main(String[] args) {
        Random ran = new Random();
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(10);
            if (arr[i] % 2 == 0) {
                counter = counter + 1;
            }
            System.out.println(arr[i]);
        }
        System.out.println("Number of even elements = " + counter);
    }
}
