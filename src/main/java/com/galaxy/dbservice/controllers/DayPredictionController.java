package com.galaxy.dbservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.galaxy.dbservice.repository.DayPrediction;
import com.galaxy.dbservice.repository.IWeatherPredictionRespository;

@RestController
@RequestMapping("/dayPredictions")
public class DayPredictionController {

	@Autowired
	private IWeatherPredictionRespository weatherRepository;
	
	@PostMapping
	public DayPrediction saveDayPrediction(@RequestBody DayPrediction day) {
		String newId = java.util.UUID.randomUUID().toString();
		day.setId(newId);
		return weatherRepository.save(day);
	}
	
	@GetMapping
	public DayPrediction getDayPrediction(@RequestParam int day) {
		
		return weatherRepository.findByDay(day);
	}
}
