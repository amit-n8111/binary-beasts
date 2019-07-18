package com.javalearn.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javalearn.domain.ShipwreckModel;
import com.javalearn.service.ShipwreckService;

@RestController
@RequestMapping("api/v1")
public class ShipwreckController {

	@Autowired
	private ShipwreckService shipwreckService;

	@RequestMapping(value = "/shipwrecks", method = RequestMethod.GET)
	public List<ShipwreckModel> list() {
		return shipwreckService.findAllShipwreck();
	}

	@RequestMapping(value = "shipwrecks", method = RequestMethod.POST)
	public ShipwreckModel create(@RequestBody ShipwreckModel shipwreck) {
		return shipwreckService.createShipwreck(shipwreck);
	}

	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.GET)
	public Optional<ShipwreckModel> get(@PathVariable String id) {
		return shipwreckService.getShipwreck(id);
	}

	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.PUT)
	public ShipwreckModel put(@PathVariable String id, @RequestBody ShipwreckModel shipwreck) {
		return shipwreckService.updateShipwreck(shipwreck);
	}

	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable String id) {
		shipwreckService.deleteShipwreck(id);
	}

}
