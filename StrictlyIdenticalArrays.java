package HW1;
import java.util.Scanner;
public class StrictlyIdenticalArrays {
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void display(int[] list) {
        for (int num : list) {
            System.out.print(num + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        int[] list1 = new int[n];
        int[] list2 = new int[n];
        System.out.println("\nEnter numbers for list 1");
        System.out.println("---------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            list1[i] = input.nextInt();
        }

        System.out.println("\nEnter numbers for list 2");
        System.out.println("-----------------------------");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            list2[i] = input.nextInt();
        }

        System.out.println("\nList 1  -----------------------");
        display(list1);

        System.out.println("List 2 ------------------------");
        display(list2);

        System.out.println("-------------------------------");
        if (equals(list1, list2)) {
            System.out.println("Two lists are identical");
        } else {
            System.out.println("Two lists are NOT identical");
        }

        input.close();
    }
}
