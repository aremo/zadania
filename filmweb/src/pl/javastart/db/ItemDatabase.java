package pl.javastart.db;

import pl.javastart.exceptions.DuplicateException;
import pl.javastart.model.Genre;
import pl.javastart.model.Item;
import pl.javastart.model.Movie;
import pl.javastart.model.TvSeries;
import pl.javastart.ui.UIService;

import java.util.Scanner;

public class ItemDatabase {

    private static final int MAX_SIZE = 10;

    private Item[] items = new Item[MAX_SIZE];
    private int size = 0;
    private Scanner scan = new Scanner(System.in);

    public int size() {
        return size;
    }

    public void addMovie() throws DuplicateException {
        Movie movie = UIService.createMovie();
        if (!contains(movie)) {
            items[size] = movie;
            size++;
        } else {
            throw new DuplicateException();
        }
    }

    public boolean contains(Item item) {
        boolean exists = false;
        for (int i = 0; i < size; i++) {
            if (item.equals(items[i])) {
                exists = true;
                break;
            }
        }
        return exists;
    }

    public void addTvSeries() throws DuplicateException {
        TvSeries tvs = UIService.createTvSeries();
        if (!contains(tvs)) {
            items[size] = tvs;
            size++;
        } else {
            throw new DuplicateException();
        }

    }

    public void printItems() {
        for (Item item : items) {
            if (item != null)
                System.out.println(item);
        }
    }

}