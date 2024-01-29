package dev.rishav.movies.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }

    // searching a movie by id
    @GetMapping("/{imdbId}")
    public ResponseEntity<?> getSingleMovie(@PathVariable String imdbId){
        Optional<Movie> response = movieService.singleMovie(imdbId);
        if(response.isEmpty())
            return new ResponseEntity<String>("Not Found", HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<Optional<Movie>>(response, HttpStatus.OK);
    }
}
