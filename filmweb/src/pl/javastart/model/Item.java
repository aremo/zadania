package pl.javastart.model;

public abstract class Item { //nie można tworzyć obiektow abstrakcyjnych
    private String title;
    private String description;
    private int year;
    private int rating;
    private Genre genre; //genre nie jest już Stringiem tylko enumem pl.javastart.model.Genre

    public Item(String title, String description, int year, int rating, Genre genre) {
        if (genre == null)
            throw new NullPointerException("No genre specified");
        this.genre = genre;
        this.title = title;
        this.description = description;
        this.year = year;
        this.rating = rating;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        if (genre == null)
            throw new NullPointerException("No genre specified");
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", year=" + year +
                ", rating=" + rating +
                ", genre='" + genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (year != item.year) return false;
        if (rating != item.rating) return false;
        if (title != null ? !title.equals(item.title) : item.title != null) return false;
        if (description != null ? !description.equals(item.description) : item.description != null) return false;
        return genre == item.genre;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + year;
        result = 31 * result + rating;
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        return result;
    }
}
