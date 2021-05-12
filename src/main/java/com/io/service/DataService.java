package com.io.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.io.model.ProductData;
import com.io.repository.Repo;

@Service
public class DataService {
	
	@Autowired
	Repo repo;
	
	public void addData(List<ProductData> data) {
		repo.saveAll(data);
	}	
}
