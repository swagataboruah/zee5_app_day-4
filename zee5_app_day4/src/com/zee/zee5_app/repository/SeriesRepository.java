package com.zee.zee5_app.repository;

import java.util.Optional;

import com.zee.zee5_app.dto.Series;

public interface SeriesRepository {

	public String add(Series series);
	public String del(String id, Series series2);
	public String update(String id, Series series2);
	public Series[] getAll();
	public Optional<Series> getById(String id);
	public static SeriesRepository getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
