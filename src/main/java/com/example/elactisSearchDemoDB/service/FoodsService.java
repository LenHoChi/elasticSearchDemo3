package com.example.elactisSearchDemoDB.service;


import com.example.elactisSearchDemoDB.model.Foods;

import java.util.List;

public interface FoodsService {
    public Foods addFoods(Foods foods);

    public List<Foods> getAllProduct();
}
