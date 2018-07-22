package com.galaxy.dbservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface IWeatherPredictionRespository extends MongoRepository<DayPrediction, String> {

	public DayPrediction findByDay(int day);
}
