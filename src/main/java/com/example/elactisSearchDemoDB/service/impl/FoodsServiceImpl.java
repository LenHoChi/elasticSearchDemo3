package com.example.elactisSearchDemoDB.service.impl;

import com.example.elactisSearchDemoDB.model.Foods;
import com.example.elactisSearchDemoDB.repository.ProductRepository;
import com.example.elactisSearchDemoDB.service.FoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodsServiceImpl implements FoodsService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public Foods addFoods(Foods foods) {
        return productRepository.save(foods);
    }

    @Override
    public List<Foods> getAllProduct() {
        return productRepository.findAll();
    }
}
