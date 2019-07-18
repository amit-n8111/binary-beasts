package com.javalearn.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.javalearn.domain.ShipwreckModel;

@Repository
public interface ShipwreckRepository extends MongoRepository<ShipwreckModel, String> {

	List<ShipwreckModel> findAll();

	ShipwreckModel insert(ShipwreckModel shipwreckModel);

	Optional<ShipwreckModel> findById(String Id);

	ShipwreckModel save(ShipwreckModel shipwreckModel);

	void deleteById(String Id);

}
