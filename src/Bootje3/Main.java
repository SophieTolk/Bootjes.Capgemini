package Bootje3;

import Bootje3.Models.Tour;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Tour> tours;

    public static void main(String[] args) {
        tours = new ArrayList<Tour>();

        while (true) {
            printMenu();
        }
    }

    public static void printMenu() {
        System.out.println("" +
                "1: Hoi Karel, druk op '1' om een nieuwe tour te starten. \n" +
                "2: Hoi Karel, druk op '2' om het aantal tours van de gehele dag in te zien. \n" +
                "3: Hoi Karel, druk op '3' om de gemiddelde duur van de tours in te zien. \n" +
                "4: Hoi Karel, let op: DAGAFSLUITING! Druk op '4' om de gehele dag af te sluiten.");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        switch (userChoice) {
            case 1:
                Tour tour = new Tour(new Date());
                System.out.println("Hoi Karel, druk op 'einde' om de tour te af te ronden");
                scanner.next();
                tour.setEnd(new Date());
                System.out.println();
                tours.add(tour);
                break;
            case 2:
                System.out.println(tours.size());
                break;
            case 3:
                long totalDuration = 0;

                for (Tour aTour : tours) {
                    totalDuration += aTour.getDurationInSeconds();
                }

                double averageDuration = (double) totalDuration / tours.size();
                System.out.println(averageDuration);
                break;
            default:
                System.exit(0);
                break;
        }
    }
}
