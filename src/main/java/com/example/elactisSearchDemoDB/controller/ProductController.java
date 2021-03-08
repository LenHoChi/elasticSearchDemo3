package com.example.elactisSearchDemoDB.controller;


import com.example.elactisSearchDemoDB.model.Foods;
import com.example.elactisSearchDemoDB.service.FoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private FoodsService productService;

    @PostMapping("/addFoods")
    public ResponseEntity<?> addProduct(@RequestBody Foods foods){
        return ResponseEntity.ok(productService.addFoods(foods));
    }
    @GetMapping("/findAllFoods")
    public ResponseEntity<?> findAllProducts(){
        return ResponseEntity.ok(productService.getAllProduct());
    }
}
