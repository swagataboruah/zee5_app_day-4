package com.zee.zee5_app.service;

import java.util.Optional;

import com.zee.zee5_app.dto.Series;
public interface SeriesService {

	public String add(Series series);
	public String update(String id, Series series);
	public Optional<Series> getById(String id);
	public Series[] getAll();
	public String del(String id);
}
