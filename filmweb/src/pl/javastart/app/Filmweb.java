package pl.javastart.app;

import pl.javastart.db.ItemDatabase;
import pl.javastart.exceptions.DuplicateException;
import pl.javastart.ui.UIService;

public class Filmweb {

    private final static int ADD_MOVIE = 1;
    private final static int ADD_TV = 2;
    private final static int EXIT = 3;

    public static void main(String[] args) {
        ItemDatabase db = new ItemDatabase();

        int option = 0;

        do {
            showOptions();
            option = UIService.getInt();
            switch (option) {
                case ADD_MOVIE:
                    try {
                        db.addMovie();
                    } catch (DuplicateException e) {
                        System.out.println("Taki film już istnieje");
                    }
                    break;

                case ADD_TV:
                    try {
                        db.addTvSeries();
                    } catch (DuplicateException e) {
                        System.out.println("Taki serial już istnieje");
                    }
                    break;

                case EXIT:
                    break;
                default:
                    System.out.println("Nie ma takiej opcji");
            }
        } while (option != EXIT);

        db.printItems();
    }

    private static void showOptions() {
        System.out.println("Dodanie filmu - " + ADD_MOVIE);
        System.out.println("Dodanie serialu - " + ADD_TV);
        System.out.println("EXIT - " + EXIT);
    }
}
