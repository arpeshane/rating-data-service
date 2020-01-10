package com.movie.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.movie.demo.entity.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Integer> {

	@Query("select r from Rating r where id =:id")
	public Rating findById(@Param("id") int id);

}



