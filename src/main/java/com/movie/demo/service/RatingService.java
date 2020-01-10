package com.movie.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.demo.entity.Rating;
import com.movie.demo.repository.RatingRepository;

@Service
public class RatingService {
	@Autowired
	RatingRepository ratingRepo;
	
	public List<Rating> getRating(){
		return ratingRepo.findAll();
	}
	
	public void saveRating(Rating rating) {
		ratingRepo.save(rating);
	}

	public Rating getRatingById(int id) {
		return ratingRepo.findById(id);
		
	}
}
