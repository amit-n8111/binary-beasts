package com.javalearn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javalearn.domain.ShipwreckModel;
import com.javalearn.repository.ShipwreckRepository;

@Service
public class ShipwreckService {

	@Autowired
	private ShipwreckRepository shipwreckRepository;

	public List<ShipwreckModel> findAllShipwreck() {
		return shipwreckRepository.findAll();
	}

	public ShipwreckModel createShipwreck(ShipwreckModel shipwreck) {
		return shipwreckRepository.insert(shipwreck);
	}

	public Optional<ShipwreckModel> getShipwreck(String id) {
		return shipwreckRepository.findById(id);
	}

	public ShipwreckModel updateShipwreck(ShipwreckModel shipwreck) {
		return shipwreckRepository.save(shipwreck);
	}

	public void deleteShipwreck(String id) {
		shipwreckRepository.deleteById(id);
	}
}
