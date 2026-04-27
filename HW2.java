package HW2;
import java.util.Scanner;

public class HW2 {
public static void main(String[] args) {
        String[] NAMES = {"Tom", "Jane", "Mark"};
        String[] DAYS = {"MON", "TUE", "WED", "THU", "FRI"};

        double[][] hours = new double[NAMES.length][DAYS.length];

        input_hours(hours, NAMES, DAYS);
        display_hours(hours, NAMES, DAYS);

        System.out.println("Total hours : " + totalHours(hours, NAMES, DAYS));

        totalHoursByEmployee(hours, NAMES, DAYS);
    }
public static void input_hours(double[][] hours, String[] NAMES, String[] DAYS) {
    Scanner input = new Scanner(System.in);

    for (int i = 0; i < NAMES.length; i++) {
        System.out.println("\nEnter the work hours for " + NAMES[i]);

        for (int j = 0; j < DAYS.length; j++) {
            System.out.print(DAYS[j] + " : ");
            hours[i][j] = input.nextDouble();
        }
    }
}


public static void display_hours(double[][] hours, String[] NAMES, String[] DAYS) {

    System.out.println("\nDisplay Weekly Work Hours");
    System.out.print("       ");
    for (int j = 0; j < DAYS.length; j++) {
        System.out.printf("%-5s", DAYS[j]);
    }
    System.out.println();

    System.out.println("---------------------------------------------------");


    for (int i = 0; i < NAMES.length; i++) {
        System.out.printf("%-5s |", NAMES[i]);

        for (int j = 0; j < DAYS.length; j++) {
            System.out.printf("%-6.1f", hours[i][j]);
        }
        System.out.println();
    }

    System.out.println("---------------------------------------------------");
}


public static double totalHours(double[][] hours, String[] NAMES, String[] DAYS) {
    double total = 0;

    for (int i = 0; i < hours.length; i++) {
        for (int j = 0; j < hours[i].length; j++) {
            total += hours[i][j];
        }
    }
    return total;
}

public static void totalHoursByEmployee(double[][] hours, String[] NAMES, String[] DAYS) {

    System.out.println("\nTotal Hours By Employee");

    for (int i = 0; i < NAMES.length; i++) {
        double sum = 0;

        for (int j = 0; j < DAYS.length; j++) {
            sum += hours[i][j];
        }

        System.out.printf("%-5s | %.1f\n", NAMES[i], sum);
    }
}


}