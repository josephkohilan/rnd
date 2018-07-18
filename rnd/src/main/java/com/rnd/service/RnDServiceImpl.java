package com.rnd.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rnd.repository.RnDRepository;

@Service
public class RnDServiceImpl implements RnDService{
	
	@Autowired
	RnDRepository rndRepository;

	@Override
	@Transactional
	public Integer getData(Integer input) {
		return rndRepository.getData(input);
	}

}
