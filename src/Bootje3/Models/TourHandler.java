package Bootje3.Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Holds a list of Tours
 * Can start a tour
 * Can end a tour
 * Can get count of tours
 * Can get average length of tours
 */
public class TourHandler {
    private static List<Tour> tours;

    public TourHandler() {
        tours = new ArrayList<>();
    }

    public Tour startTour(){
        Tour tour = new Tour(new Date());
        tours.add(tour);
        return tour;
    }

    public void endTour(Tour tour){
        tour.setEnd(new Date());
    }

    public int getTourCount(){
        return tours.size();
    }

    public double getAverageDuration(){
        long totalDuration = 0;

        for (Tour aTour : tours) {
            totalDuration += aTour.getDurationInSeconds();
        }

        return (double) totalDuration / tours.size();
    }

}
