package Bootje3.Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Holds a list of Tours
 * Can start a tour
 * Can end a tour
 * Can get count of finished tours
 * Can get average length of finished tours
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
        return getFinishedTours().size();
    }

    public double getAverageDuration(){
        long totalDuration = 0;
        List<Tour> finishedTours = getFinishedTours();

        for (Tour finishedTour : finishedTours) {
            totalDuration += finishedTour.getDurationInSeconds();
        }

        return (double) totalDuration / finishedTours.size();
    }

    private List<Tour>getFinishedTours(){
        List<Tour> finishedTours = new ArrayList<>();

        for(Tour tour: tours){
            if(tour.isFinished()){
                finishedTours.add(tour);
            }
        }

        return finishedTours;
    }
}
