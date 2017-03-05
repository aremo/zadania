package pl.javastart.minifilmweb;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private MovieActorRepository movieActorRepository;

    @Autowired
    private ActorRepository actorRepository;

    @GetMapping("/")
    public String movieList(Model model) {
        List<Movie> movies = movieRepository.findAll();
        model.addAttribute("movies", movies);
        return "movies";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("movie", new Movie());
        model.addAttribute("categories", Category.values());
        return "addForm";
    }

    @PostMapping("/add")
    public String addMovie(Movie movie) {
        movieRepository.save(movie);
        return "redirect:/";
    }

    @GetMapping("/movie")
    public String filmDetails(Model model, @RequestParam Long id) {
        Movie movie = movieRepository.findOne(id);

        model.addAttribute("movie", movie);
        model.addAttribute("comment", new Comment());

        double sum = 0;
        for (Comment comment : movie.getComments()) {
            sum = sum + comment.getRating();
        }

        double rating = sum / movie.getComments().size();
        model.addAttribute("rating", rating);
        List<Actor> actorList = new ArrayList<>();

        for (MovieActor movieActor : movie.getMovieActorList()) {
            actorList.add(movieActor.getActor());
        }

        model.addAttribute("actorList", actorList);
        return "movieDetails";
    }

    @ResponseBody
    @GetMapping("/api/movies/{id}")
    public ResponseEntity<?> getMovie(@PathVariable Long id) {
        Movie movie = movieRepository.findOne(id);

        if (movie != null) {
            return ResponseEntity.ok(movie);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @ResponseBody
    @PostMapping("/api/movies")
    public Movie insertMovie(@RequestBody Movie movie) {

        // dodać do bazy danych
        movieRepository.save(movie);

        // zwrócić z dodanym id
        return movie;
    }

    @ResponseBody
    @PutMapping("/api/movies/{id}")
    public ResponseEntity<?> editMovie(@RequestBody Movie targetMovie, @PathVariable Long id) {
        Movie movie = movieRepository.findOne(id);

        if (movie == null) {
            return ResponseEntity.notFound().build();
        }

        System.out.println("Tutaj przykład, że można sobie coś zalogować do konsoli, żeby podejrzeć czy działa.");

        movie.setTitle(targetMovie.getTitle());
        //
        //

        movieRepository.save(movie);

        return ResponseEntity.ok(movie);
    }

}
