package com.galaxy.dbservice.repository;

import org.springframework.data.annotation.Id;

public class DayPrediction {
	
	@Id
	private String id;
	
	private int day;
	
	private String weather;

	public DayPrediction() {
		super();
	}
	
	public DayPrediction(int day, String weather) {
		super();
		this.day = day;
		this.weather = weather;
	}

	public String getId() {
		return id;
	}

	public int getDay() {
		return day;
	}

	public String getWeather() {
		return weather;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}
}
