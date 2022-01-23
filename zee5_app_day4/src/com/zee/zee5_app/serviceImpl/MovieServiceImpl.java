package com.zee.zee5_app.serviceImpl;

import java.util.Optional;

import com.zee.zee5_app.dto.Movie;
import com.zee.zee5_app.repository.MovieRepository;
import com.zee.zee5_app.repository.SeriesRepository;
import com.zee.zee5_app.service.MovieService;
import com.zee.zee5_app.service.SubscriptionService;

public class MovieServiceImpl implements MovieRepository {

	
	// singleton design
		private MovieServiceImpl() {
			
		}
		private static MovieService service;
		public static MovieService getInstance() {
			if(service==null) {
				service = new MovieServiceImpl();
			}
			return service;
		}
	
	MovieRepository movieRepository;
	
	@Override
	public String add(Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String del(String id, Movie movies1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(String id, Movie movie1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie[] getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Movie> getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
