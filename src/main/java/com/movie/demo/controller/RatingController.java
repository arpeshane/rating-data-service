package com.movie.demo.controller;

import java.util.List;	

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.demo.entity.Rating;
import com.movie.demo.service.RatingService;

@RestController
public class RatingController {

	@Autowired
	RatingService ratingSer;

	@GetMapping("rating")
	public List<Rating> getMovieRating() {
		return ratingSer.getRating();
	}

	@PostMapping("saveRating")
	public void saveCatalog(@RequestBody Rating rating) {
		ratingSer.saveRating(rating);
	}
	
	@GetMapping("rating/{id}")
	public Rating getMovieRating(@PathVariable Integer id) {
		return ratingSer.getRatingById(id);
	}

}
