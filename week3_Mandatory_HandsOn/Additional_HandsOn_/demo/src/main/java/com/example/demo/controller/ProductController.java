package com.example.demo.controller;


import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/search")
    public List<Product> search(@RequestParam String keyword) {
        return service.searchByName(keyword);
    }

    @GetMapping("/starts-with")
    public List<Product> startsWith(@RequestParam String prefix) {
        return service.startsWithName(prefix);
    }

    @GetMapping("/greater-than")
    public List<Product> greaterThan(@RequestParam double price) {
        return service.priceGreaterThan(price);
    }

    @GetMapping("/less-than")
    public List<Product> lessThan(@RequestParam double price) {
        return service.priceLessThan(price);
    }

    @GetMapping("/between-dates")
    public List<Product> betweenDates(@RequestParam String start, @RequestParam String end) {
        return service.fetchBetweenDates(LocalDate.parse(start), LocalDate.parse(end));
    }

    @GetMapping("/sorted")
    public List<Product> sorted() {
        return service.getAllSortedByPriceAsc();
    }

    @GetMapping("/top3")
    public List<Product> top3() {
        return service.getTop3ExpensiveProducts();
    }
}
