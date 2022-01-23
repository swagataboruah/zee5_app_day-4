package com.zee.zee5_app.serviceImpl;

import java.util.Optional;

import com.zee.zee5_app.dto.Series;
import com.zee.zee5_app.repository.SeriesRepository;
import com.zee.zee5_app.repository.SubscriptionRepository;
import com.zee.zee5_app.service.SeriesService;

public class SeriesServiceImpl implements SeriesRepository {
	
	private SeriesServiceImpl() {
		
	}
	private static SeriesService service;
	public static SeriesService getInstance() {
		if(service==null) {
			service = new SeriesServiceImpl();
		}
		return service;
	}
	
	SeriesRepository seriesRepository;
	
	
	@Override
	public String add(Series series) {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
	}

}
