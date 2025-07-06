package com.example.demo;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final ProductRepository productRepository;

    public DataLoader(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) {
        productRepository.save(new Product(null, "Laptop", 80000, LocalDate.of(2023, 5, 10)));
        productRepository.save(new Product(null, "Keyboard", 1500, LocalDate.of(2024, 1, 12)));
        productRepository.save(new Product(null, "Monitor", 12000, LocalDate.of(2024, 3, 5)));
        productRepository.save(new Product(null, "Mouse", 600, LocalDate.of(2024, 5, 15)));
        productRepository.save(new Product(null, "Phone", 45000, LocalDate.of(2023, 11, 30)));
    }
}