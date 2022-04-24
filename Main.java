package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How do you prefer to transport: ");
        String a = scanner.next();
        a = a.toLowerCase(Locale.ROOT);
        System.out.print("How many kilometers there are: ");
        int km = scanner.nextInt();

        Date date = new Date();
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int hours = hour;
        int minute = calendar.get(Calendar.MINUTE);
        int day = calendar.get(Calendar.DATE);
        int days = day;

        switch (a) {
            case "water" -> {
                Water water = new Water();
                double[] data = water.transport(km);
                hour += (int) data[0];
                while ((hour - 24) >= 0) {
                    hour -= 24;
                    days++;
                }
                System.out.println("Transportation speed km/h " + data[1] + " Estimated time " + data[0] + " hours");
                System.out.println("Start date: " + day + " " + hours + ":" + minute);
                System.out.println("Approximate arrival date " + days + " " + hour + ":" + minute);
                break;
            }
            case "land" -> {
                Land land = new Land();
                double[] data = land.transport(km);
                hour += (int) data[0];
                while ((hour - 24) >= 0) {
                    hour -= 24;
                    days++;
                }
                System.out.println("Transportation speed km/h " + data[1] + " Estimated time " + data[0] + " hours");
                System.out.println("Start date: " + day + " " + hours + ":" + minute);
                System.out.println("Approximate arrival date " + days + " " + hour + ":" + minute);
                break;
            }
            case "plane" -> {
                Plane air = new Plane();
                double[] data = air.transport(km);
                hour += (int) data[0];
                while ((hour - 24) >= 0) {
                    hour -= 24;
                    days++;
                }
                System.out.println("Transportation speed km/h " + data[1] + " Estimated time " + data[0] + " hours");
                System.out.println("Start date: " + day + " " + hours + ":" + minute);
                System.out.println("Approximate arrival date " + days + " " + hour + ":" + minute);
                break;
            }
            default -> System.out.println("No transportation method found, Please try writing in capital letters");
        }
    }
}