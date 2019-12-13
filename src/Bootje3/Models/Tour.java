package Bootje3.Models;

import java.util.Date;
import java.util.concurrent.TimeUnit;

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

    public long getDurationInSeconds() {
        long timeDiffInMs = this.getEnd().getTime() - this.getStart().getTime();
        return TimeUnit.MILLISECONDS.toSeconds(timeDiffInMs);
    }

}
