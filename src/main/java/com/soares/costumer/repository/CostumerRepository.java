package com.soares.costumer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.soares.costumer.model.Costumer;

public interface CostumerRepository extends PagingAndSortingRepository<Costumer, Long>{
	
	@Query("select c from Costumer c where lower(c.name) like lower(concat('%', :name,'%'))")
	public List<Costumer> findByName(String name);

}
