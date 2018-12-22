package ui;

import java.text.NumberFormat;
import java.util.Scanner;
import business.Player;

public class Console {

    private static Scanner sc = new Scanner(System.in);
    
    public static String getString(String prompt) {
        String s = "";
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNext()) {
                s = sc.nextLine(); // read entire line
                isValid = true;
            } else {
                System.out.println("Error! Invalid string value. Try again.");
            }
        }
        return s;
    }

    public static double getDouble(String prompt) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                d = sc.nextDouble();
                isValid = true;
            } else {
                sc.next();     // discard the incorrectly entered double
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }

    public static double getDouble(String prompt, double min, double max) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            d = Console.getDouble(prompt);
            if (d < min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (d > max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return d;
    }

    public static int getInt(String prompt) {
        boolean isValid = false;
        int i = 0;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                sc.next();  // discard invalid data
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

    public static int getInt(String prompt, int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            i = Console.getInt(prompt);
            if (i < min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (i > max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return i;
    }
    
    public static void displayStats(Player p) {
    	NumberFormat decimalFormat = NumberFormat.getNumberInstance();
    	decimalFormat.setMinimumFractionDigits(3);
    	System.out.println("\nBatting average: " + decimalFormat.format(p.getBatAvg()));
    	System.out.println("Slugging percent: " + decimalFormat.format(p.getSlugPercent()));
    }
}