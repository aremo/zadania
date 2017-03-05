package pl.javastart.ui;


import pl.javastart.model.Genre;
import pl.javastart.model.Movie;
import pl.javastart.model.TvSeries;

import java.util.Scanner;

public class UIService {

    private static final Scanner scan = new Scanner(System.in);

    public static int getInt(){
        int value = scan.nextInt();
        scan.nextLine();
        return value;
    }

    public static Movie createMovie() {
        System.out.println("Title");
        String title = scan.nextLine();
        System.out.println("Description");
        String description = scan.nextLine();
        System.out.println("Year");
        int year = scan.nextInt();
        scan.nextLine();
        System.out.println("Rating");
        int rating = scan.nextInt();
        scan.nextLine();
        System.out.println("Genre");
        Genre genre = Genre.valueOf(scan.nextLine()); //zamienia stringa na enuma, ale trzeba wpisać dokładnie COMEDY, SCI_FI, DRAMA;
        System.out.println("Director");
        String director = scan.nextLine();
        return new Movie(title, description, year, rating, genre, director);
    }

    public static TvSeries createTvSeries() {
        System.out.println("Title");
        String title = scan.nextLine();
        System.out.println("Description");
        String description = scan.nextLine();
        System.out.println("Year");
        int year = scan.nextInt();
        scan.nextLine();
        System.out.println("Rating");
        int rating = scan.nextInt();
        scan.nextLine();
        System.out.println("Genre");
        Genre genre = Genre.valueOf(scan.nextLine()); //COMEDY, SCI_FI, DRAMA
        System.out.println("Seasons");
        int seasons = scan.nextInt();
        scan.nextLine();
        System.out.println("Episodes");
        int episodes = scan.nextInt();
        scan.nextLine();
        return new TvSeries(title, description, year, rating, genre, seasons, episodes);
    }
}
