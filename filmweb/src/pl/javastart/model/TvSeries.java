package pl.javastart.model;

public class TvSeries extends Item {
    private int seasons;
    private int episodes;

    public TvSeries(String title, String description, int year, int rating, Genre genre, int seasons, int episodes) {
        super(title, description, year, rating, genre);
        this.seasons = seasons;
        this.episodes = episodes;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "pl.javastart.model.TvSeries{" +
                super.toString() +
                "seasons=" + seasons +
                ", episodes=" + episodes +
                '}';
    }
}
