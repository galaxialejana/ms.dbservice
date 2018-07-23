package com.galaxy.dbservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galaxy.dbservice.repository.Galaxy;
import com.galaxy.dbservice.repository.IGalaxyRepository;


@RestController
@RequestMapping("db/galaxies")
public class GalaxyController {

	@Autowired
	private IGalaxyRepository galaxyRepository;
	
	@GetMapping
	public Galaxy getGalaxy() {
				
		List<Galaxy> list = galaxyRepository.findAll();
		System.out.println(list);
		if(!list.isEmpty())
			return list.get(0);
		
		return null;
	}
	
	
}
