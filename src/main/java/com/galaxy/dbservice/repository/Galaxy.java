package com.galaxy.dbservice.repository;

import java.util.List;

public class Galaxy {
	private Sun sun;
	private List<Planet> planets;
	
	public Galaxy() {
		super();
	}
	
	public Galaxy(List<Planet> planets, Sun sun) {
		
		this.sun = sun;
		this.planets = planets;
		
	}

	public List<Planet> getPlanets() {
		return this.planets;
	}

	public Sun getSun() {
		return sun;
	}
}
