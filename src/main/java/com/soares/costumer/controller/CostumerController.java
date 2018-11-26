package com.soares.costumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soares.costumer.model.Costumer;
import com.soares.costumer.repository.CostumerRepository;

@RestController
@RequestMapping("/api")
public class CostumerController {
	
	@Autowired
	private CostumerRepository costumerRepository;
	
	@RequestMapping(value="/find/{name}")
	private List<Costumer> findByName(@PathVariable("name") String name){
		return costumerRepository.findByName(name);
	}

}
