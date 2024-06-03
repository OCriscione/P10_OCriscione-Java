import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Project10_CriscioneO extends P10Search {
    public static void main(String[] args) {
        int[] a = new int[1000];
        int[] a1 = new int[1000];
        Random random = new Random();
        for (int numgen = 0; numgen < 1000; numgen++) {
            int num = random.nextInt(1000);
            a[numgen] = num;
            a1[numgen] = num;
        }
        Arrays.sort(a);
        Scanner kb = new Scanner(System.in);
        System.out.println("1000 random numbers from 0 to 999 have been generated\n");

        boolean exitLoop = false;
        while (!exitLoop) {
            System.out.print("Enter an integer to search the arrays (EOF to stop): ");
            try {
                int input = kb.nextInt();
                int count1 = seq_search(a1, input);
                int count2 = bin_search(a, input);

                if (count1 != -1) {
                    System.out.println("sequential search found the value " + input + " in element " + count1 + " with " + (count1 + 1) + " searches.");
                    System.out.println("binary search found the value " + input + " in element " + count2 + ".");
                } else {
                    System.out.println("sequential search did not find the value with 1000 items scanned.");
                    System.out.println("binary search did not find the value with 10 items scanned.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer.");
                exitLoop = true; // Exit the loop in case of an exception
            }
        }
    }
}
