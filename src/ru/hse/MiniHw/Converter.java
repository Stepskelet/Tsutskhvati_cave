package ru.hse.MiniHw;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        System.out.println("You would like to convert:\n" +
                "1) centimeters to inches\n" +
                "2) inches to centimeters\n" +
                "Choose the number of required option");

        Scanner scanner = new Scanner(System.in);

        int option;

        while (true) {
            if (scanner.hasNextInt()) {
                int numb = scanner.nextInt();
                scanner.nextLine();

                if (numb < 1 || numb > 2) {
                    System.out.println("Please input an integer in range [1; 2]");
                    continue;
                }

                option = numb;
                break;
            }

            else {
                scanner.nextLine();
                System.out.println("Please input an integer in range [1; 2]");
            }

        }

        if (option == 1) {
            System.out.println("Please input centimeters:");
        }

        else {
            System.out.println("Please input inches:");
        }

        double value;

        while (true) {
            if (scanner.hasNextDouble()) {
               double numb = scanner.nextDouble();
               scanner.nextLine();

               if (numb < 0.0D) {
                   System.out.println("Please input a real number >= 0");
                   continue;
               }

               value = numb;
               break;
            }

            else {
                scanner.nextLine();
                System.out.println("Please input a real number >= 0");
            }
        }

        if (option == 1) {
            System.out.println(value + " centimeters equals " + value / 2.54 +
                               " inches");
        }

        else {
            System.out.println(value + " inches equals " + value * 2.54 +
                    " centimeters");
        }

        scanner.close();
    }
}
