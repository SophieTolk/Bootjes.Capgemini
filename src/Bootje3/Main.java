package Bootje3;

import Bootje3.Models.Tour;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Tour> tours;
    private static long totalDuration;

    public static void main(String[] args) throws InterruptedException {
        tours = new ArrayList<Tour>();
        totalDuration = 0;

        printMenu();
//        // write your code here
//        Tour tour = new Tour(new Date());
//        Thread.sleep(3000);
//        tour.setEnd(new Date());
//        long duration = tour.getDurationInSeconds();
    }

    public static void printMenu() {
        System.out.println("" +
                "1: Start new Tour \n" +
                "2: See number of tours \n" +
                "3: See average length tours \n" +
                "4: exit program");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        switch (userChoice) {
            case 1:
                Tour tour = new Tour(new Date());
                System.out.println("Press any key when the tour has ended");
                scanner.next();
                tour.setEnd(new Date());
                long duration = tour.getDurationInSeconds();
                totalDuration += duration;
                System.out.println();
                tours.add(tour);
                break;
            case 2:
                System.out.println(tours.size());
                break;
            case 3:
                double averageDuration = (double) totalDuration / tours.size();
                System.out.println(averageDuration);
                break;
            default:
                System.exit(0);
                break;
        }

        printMenu();
    }
}
