package com.zee.zee5_app.service;
import java.util.Optional;

import com.zee.zee5_app.dto.Movie;

public interface MovieService {

	public String add(Movie movie);
	public String update(String id, Movie movie);
	public Optional<Movie> getById(String id);
	public Movie[] getAll();
	public String del(String id);
}
