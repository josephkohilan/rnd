package com.rnd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rnd.service.RnDService;

@RestController
public class RnDController {
	
	@Autowired
	RnDService rndService;
	
	@GetMapping(value = "/data/{input}")
	public Integer getData(@PathVariable Integer input) {
		return rndService.getData(input);
	}
	
}
