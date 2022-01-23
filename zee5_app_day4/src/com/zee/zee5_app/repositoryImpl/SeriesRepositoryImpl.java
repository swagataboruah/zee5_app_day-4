package com.zee.zee5_app.repositoryImpl;

import java.util.ArrayList;
import java.util.Optional;

import com.zee.zee5_app.dto.Movie;
import com.zee.zee5_app.dto.Register;
import com.zee.zee5_app.dto.Series;
import com.zee.zee5_app.repository.SeriesRepository;
import com.zee.zee5_app.repository.SubscriptionRepository;

public class SeriesRepositoryImpl implements SeriesRepository {

	
	private ArrayList<Series> arrayList = new ArrayList<>();
	
	
	 // singleton design
    private SeriesRepositoryImpl() {
		
	}
	private static SeriesRepository repository;
	
	// in below command why we mentioned return type as interface?
	
	public static SeriesRepository getInstance() {
		if(repository == null) {
			repository = new SeriesRepositoryImpl();
		}
		return repository;
	} // singleton desing
	
	
	@Override
	public String add(Series series) {
       boolean result = this.arrayList.add(series);
		
		if(result) {
			return "success";
		}
		return "fail";
	}

	@Override
	public String del(String id, Series series2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(String id, Series series2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Series[] getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Series> getById(String id) {
			for (Series series : arrayList) {
				if(series.getId().equals(id)) {
					return Optional.of(series);
				}
				
			}
			return  Optional.empty();
		}
	}

}
