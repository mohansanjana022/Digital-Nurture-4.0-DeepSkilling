package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> searchByName(String keyword) {
        return productRepository.findByNameContainingIgnoreCase(keyword);
    }

    public List<Product> startsWithName(String prefix) {
        return productRepository.findByNameStartingWith(prefix);
    }

    public List<Product> priceGreaterThan(double minPrice) {
        return productRepository.findByPriceGreaterThan(minPrice);
    }

    public List<Product> priceLessThan(double maxPrice) {
        return productRepository.findByPriceLessThan(maxPrice);
    }

    public List<Product> fetchBetweenDates(LocalDate start, LocalDate end) {
        return productRepository.findByReleaseDateBetween(start, end);
    }

    public List<Product> getAllSortedByPriceAsc() {
        return productRepository.findAll(Sort.by("price").ascending());
    }

    public List<Product> getTop3ExpensiveProducts() {
        return productRepository.findTop3ByOrderByPriceDesc();
    }
}