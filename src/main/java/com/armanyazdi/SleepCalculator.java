package com.armanyazdi;

import org.joda.time.DateTime;
import java.util.Scanner;

public class SleepCalculator {
    private static DateTime firstTime, secondTime, thirdTime, fourthTime, fifthTime, sixthTime;

    public static void bedTime() {
        try {
            System.out.print("What time do you want to wake up? ");

            Scanner scanner = new Scanner(System.in);
            String wakeUpTime = scanner.nextLine();
            DateTime time = DateTime.parse("T".concat(wakeUpTime));

            firstTime = DateTime.parse(String.valueOf(time.minusHours(9).minusMinutes(15)));
            secondTime = DateTime.parse(String.valueOf(time.minusHours(7).minusMinutes(45)));
            thirdTime = DateTime.parse(String.valueOf(time.minusHours(6).minusMinutes(15)));
            fourthTime = DateTime.parse(String.valueOf(time.minusHours(4).minusMinutes(45)));
            fifthTime = DateTime.parse(String.valueOf(time.minusHours(3).minusMinutes(15)));
            sixthTime = DateTime.parse(String.valueOf(time.minusHours(1).minusMinutes(45)));

            System.out.printf("To wake up refreshed at %s:%s, you need go to sleep at one of the following times:%n",
                    String.format("%02d", time.getHourOfDay()), String.format("%02d", time.getMinuteOfHour()));

            System.out.printf(ConsoleColors.GREEN_BOLD + "%s:%s%n", String.format("%02d", firstTime.getHourOfDay()), String.format("%02d", firstTime.getMinuteOfHour()));
            System.out.printf("%s:%s%n" + ConsoleColors.RESET, String.format("%02d", secondTime.getHourOfDay()), String.format("%02d", secondTime.getMinuteOfHour()));
            System.out.printf(ConsoleColors.PURPLE_BOLD + "%s:%s%n", String.format("%02d", thirdTime.getHourOfDay()), String.format("%02d", thirdTime.getMinuteOfHour()));
            System.out.printf("%s:%s%n" + ConsoleColors.RESET, String.format("%02d", fourthTime.getHourOfDay()), String.format("%02d", fourthTime.getMinuteOfHour()));
            System.out.printf(ConsoleColors.RED_BOLD + "%s:%s%n", String.format("%02d", fifthTime.getHourOfDay()), String.format("%02d", fifthTime.getMinuteOfHour()));
            System.out.printf("%s:%s%n" + ConsoleColors.RESET, String.format("%02d", sixthTime.getHourOfDay()), String.format("%02d", sixthTime.getMinuteOfHour()));
        }
        catch(Exception e) {
            System.out.println(ConsoleColors.RED_BOLD + "Exception: Invalid time value!" + ConsoleColors.RESET);
        }
    }

    public static void wakeUpTime() {
        DateTime now = new DateTime();

        firstTime = DateTime.parse(String.valueOf(now.plusHours(9).plusMinutes(15)));
        secondTime = DateTime.parse(String.valueOf(now.plusHours(7).plusMinutes(45)));
        thirdTime = DateTime.parse(String.valueOf(now.plusHours(6).plusMinutes(15)));
        fourthTime = DateTime.parse(String.valueOf(now.plusHours(4).plusMinutes(45)));
        fifthTime = DateTime.parse(String.valueOf(now.plusHours(3).plusMinutes(15)));
        sixthTime = DateTime.parse(String.valueOf(now.plusHours(1).plusMinutes(45)));

        System.out.println("If you go to sleep right now, you should try to wake up at one of the following times:");

        System.out.printf(ConsoleColors.GREEN_BOLD + "%s:%s%n", String.format("%02d", firstTime.getHourOfDay()), String.format("%02d", firstTime.getMinuteOfHour()));
        System.out.printf("%s:%s%n" + ConsoleColors.RESET, String.format("%02d", secondTime.getHourOfDay()), String.format("%02d", secondTime.getMinuteOfHour()));
        System.out.printf(ConsoleColors.PURPLE_BOLD + "%s:%s%n", String.format("%02d", thirdTime.getHourOfDay()), String.format("%02d", thirdTime.getMinuteOfHour()));
        System.out.printf("%s:%s%n" + ConsoleColors.RESET, String.format("%02d", fourthTime.getHourOfDay()), String.format("%02d", fourthTime.getMinuteOfHour()));
        System.out.printf(ConsoleColors.RED_BOLD + "%s:%s%n", String.format("%02d", fifthTime.getHourOfDay()), String.format("%02d", fifthTime.getMinuteOfHour()));
        System.out.printf("%s:%s%n" + ConsoleColors.RESET, String.format("%02d", sixthTime.getHourOfDay()), String.format("%02d", sixthTime.getMinuteOfHour()));
    }
}