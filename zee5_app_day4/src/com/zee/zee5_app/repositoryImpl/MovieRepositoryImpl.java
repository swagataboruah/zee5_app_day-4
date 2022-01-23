package com.zee.zee5_app.repositoryImpl;

import java.util.ArrayList;
import java.util.Optional;

import com.zee.zee5_app.dto.Movie;
import com.zee.zee5_app.dto.Subscription;
import com.zee.zee5_app.repository.MovieRepository;

public class MovieRepositoryImpl implements MovieRepository {

	
	private ArrayList<Movie> arrayList = new ArrayList<>();
	
	
	// singleton design standard
		private MovieRepositoryImpl() {
			
		}
		private static MovieRepository repository;
		
		// in below command why we mentioned return type as interface?
		
		public static MovieRepository getInstance() {
			if(repository == null) {
				repository = new MovieRepositoryImpl();
			}
			return repository;
		} // singleton design standard
		
		
	@Override
	public String add(Movie movie) {
       boolean result = this.arrayList.add(movie);
		
		if(result) {
			return "success";
		}
		return "fail";
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
		for (Movie movie : arrayList) {
			if(movie.getId().equals(id)) {
				return Optional.of(movie);
			}
		}
		return  Optional.empty();
	}


}
