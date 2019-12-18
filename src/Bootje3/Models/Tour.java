package Bootje3.Models;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Tour object
 * has a start date
 * has an end date
 * can return the calculated duration
 */
public class Tour {
    private Date start;
    private Date end;

    public Tour(Date start) {
        this.start = start;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public boolean isFinished(){
        return (this.end != null);
    }

    public long getDurationInSeconds() {
        // Get the time in ms of the end date subtract the time in ms of the start date.
        long timeDiffInMs = this.getEnd().getTime() - this.getStart().getTime();
        // return the time difference in seconds converted from ms
        return TimeUnit.MILLISECONDS.toSeconds(timeDiffInMs);
    }
}
