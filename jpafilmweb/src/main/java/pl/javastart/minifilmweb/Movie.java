package pl.javastart.minifilmweb;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Movie {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date premiereDate;

    private String actors;

    @Enumerated(EnumType.STRING)
    private Category category;

    @OneToMany (mappedBy = "movie")
    @JsonIgnore
    private List<Comment> comments;

    @OneToMany (mappedBy = "movie")
    private List<MovieActor> movieActorList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPremiereDate() {
        return premiereDate;
    }

    public void setPremiereDate(Date premiereDate) {
        this.premiereDate = premiereDate;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<MovieActor> getMovieActorList() {
        return movieActorList;
    }

    public void setMovieActorList(List<MovieActor> movieActorList) {
        this.movieActorList = movieActorList;
    }
}