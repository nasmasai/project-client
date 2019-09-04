package groupwork.demo;

public class Suggested {
    private Long id;
    private String movieName;
    private int duration;

    public Suggested(int duration) {
        this.duration = duration;
    }

    public Suggested(String movieName) {
        this.movieName = movieName;
    }

    private Suggested() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie{" + "id=" + id +
                ", movieName='" + movieName + '\'' +
                '}';
    }
}