package pl.pjatk.RentalService.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.RentalService.domain.Movie;
import pl.pjatk.RentalService.services.RentalService;

@RestController
@RequestMapping("/rental")
public class RentalController {
    private final RentalService rentalService;

    public RentalController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @GetMapping("/getMovie")
    public ResponseEntity<Movie> getMovie(@PathVariable Integer id) {
        return rentalService.getMovie(id);
    }

    @PutMapping("/returnMovie")
    public ResponseEntity<Movie> returnMovie(@PathVariable Integer id) {
        return rentalService.returnMovie(id);
    }

    @PutMapping("/rentMovie")
    public ResponseEntity<Movie> rentMovie(@PathVariable Integer id) {
        return rentalService.rentMovie(id);
    }
}
