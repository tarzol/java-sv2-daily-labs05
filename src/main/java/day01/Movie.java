package day01;

import java.time.LocalDateTime;
import java.util.List;

public class Movie {

    private String title;
    private List<LocalDateTime> timesOfScreening;

    public Movie(String title, List<LocalDateTime> timesOfScreening) {
        this.title = title;
        this.timesOfScreening = timesOfScreening;
    }

    public String getTitle() {
        return title;
    }

    public List<LocalDateTime> getTimesOfScreening() {
        return timesOfScreening;
    }
}
