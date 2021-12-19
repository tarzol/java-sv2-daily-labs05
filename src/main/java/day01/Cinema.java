package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cinema {

    public List<Movie> getMovieList() {
        return movieList;
    }

    private List<Movie> movieList = new ArrayList<>();

    public void addMovie(Movie movie) {
        movieList.add(movie);
    }

    public List<String> findMovieByTime(LocalDateTime time) {
        List<String> filteredMovies = new ArrayList<>();
        for ( Movie actual : movieList) {
            if ( movieContainsTimeOfScreening(actual, time)) {
                filteredMovies.add(actual.getTitle());
            }
        }
        return filteredMovies;
    }

    private boolean movieContainsTimeOfScreening(Movie movie, LocalDateTime time) {
        for (LocalDateTime actual : movie.getTimesOfScreening()) {
            if ( actual.equals(time)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Cinema cinema = new Cinema();

        cinema.addMovie(new Movie("Titanic", Arrays.asList(
                LocalDateTime.of(2021,11,8,12,45),
                LocalDateTime.of(2021,11,8,22,25)
        )));
        cinema.addMovie(new Movie("Jurassic Park", Arrays.asList(
                LocalDateTime.of(2021,11,8,19,45),
                LocalDateTime.of(2021,11,8,20,25),
                LocalDateTime.of(2021,11,8,22,25)
        )));

        System.out.println("Filmek listája: "+cinema.movieList.size());
        System.out.println(cinema.movieList.get(0).getTimesOfScreening()+" "
                    +cinema.movieList.get(0).getTimesOfScreening());

        System.out.println(cinema.findMovieByTime(LocalDateTime.of(2021,11,8,10,45))); // []
        System.out.println(cinema.findMovieByTime(LocalDateTime.of(2021,11,8,19,45))); // [Jurassic Park]
        System.out.println(cinema.findMovieByTime(LocalDateTime.of(2021,11,8,22,25))); // [Titanic, Jurassic Park]

    }
}
