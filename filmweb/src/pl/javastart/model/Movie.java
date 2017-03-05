package pl.javastart.model;

public class Movie extends Item {
    private String director;

    public Movie(String title, String description, int year, int rating, Genre genre, String director) {
        super(title, description, year, rating, genre);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "pl.javastart.model.Movie{" +
                super.toString() +
                "director='" + director + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Movie movie = (Movie) o;

        return director != null ? director.equals(movie.director) : movie.director == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (director != null ? director.hashCode() : 0);
        return result;
    }
}
