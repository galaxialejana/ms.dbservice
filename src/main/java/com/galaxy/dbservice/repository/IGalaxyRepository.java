package com.galaxy.dbservice.repository;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

@Document(collection = "galaxies")
public interface IGalaxyRepository extends MongoRepository<Galaxy, String>{

	public List<Galaxy> findAll();
}
