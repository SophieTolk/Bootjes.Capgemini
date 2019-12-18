package Bootje3.Models;

import java.util.Scanner;

/**
 * Prints output
 * Reads input
 * Calls Tourhandler based on input
 */
public class MenuHandler {
    private static TourHandler tourHandler;

    public MenuHandler() {
        tourHandler = new TourHandler();
    }

    public void printDefaultMenu() {
        System.out.println("" +
                "1: Hoi Karel, druk op '1' om een nieuwe tour te starten. \n" +
                "2: Hoi Karel, druk op '2' om het aantal tours van de gehele dag in te zien. \n" +
                "3: Hoi Karel, druk op '3' om de gemiddelde duur van de tours in te zien. \n" +
                "4: Hoi Karel, let op: DAGAFSLUITING! Druk op '4' om de gehele dag af te sluiten.");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        switch (userChoice) {
            case 1:
                Tour tour = tourHandler.startTour();
                System.out.println("Hoi Karel, druk op 'einde' om de tour te af te ronden");
                scanner.next();
                tourHandler.endTour(tour);
                System.out.println();
                break;
            case 2:
                System.out.println(tourHandler.getTourCount());
                break;
            case 3:

                System.out.println(tourHandler.getAverageDuration());
                break;
            default:
                System.exit(0);
                break;
        }
    }
}
