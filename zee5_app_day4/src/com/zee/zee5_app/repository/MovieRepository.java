package com.zee.zee5_app.repository;

import java.util.Optional;

import com.zee.zee5_app.dto.Movie;

import lombok.Data;
@Data


public interface MovieRepository {

	public String add(Movie movie);
	public String del(String id, Movie movies1);
	public String update(String id, Movie movie1);
	public Movie[] getAll();
	public Optional<Movie> getById(String id);
	
	public static MovieRepository getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
}
