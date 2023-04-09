package com.armanyazdi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(ConsoleColors.YELLOW + "1) Calculate bedtime");
        System.out.println("2) Calculate wake-up time" + ConsoleColors.RESET);
        System.out.print("Enter your choice: ");

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        if (choice.equals("1")) SleepCalculator.bedTime();
        else if (choice.equals("2")) SleepCalculator.wakeUpTime();
        else System.out.println(ConsoleColors.RED_BOLD + "Exception: Invalid input!" + ConsoleColors.RESET);
    }
}