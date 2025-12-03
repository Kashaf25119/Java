import java.util.Scanner;

public class Sample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];

        // array input
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        // before sorting
        System.out.println("Before sorting:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // sorting
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // after sorting
        System.out.println("\nAfter sorting:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
