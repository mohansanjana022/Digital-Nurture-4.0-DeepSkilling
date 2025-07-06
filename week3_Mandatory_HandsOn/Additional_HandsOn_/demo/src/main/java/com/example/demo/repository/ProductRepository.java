package com.example.demo.repository;

import com.example.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    // 1. Contains (case insensitive)
    List<Product> findByNameContainingIgnoreCase(String keyword);

    // 2. Starts With
    List<Product> findByNameStartingWith(String prefix);

    // 3. Greater than price
    List<Product> findByPriceGreaterThan(double minPrice);

    // 4. Less than price
    List<Product> findByPriceLessThan(double maxPrice);

    // 5. Between two dates
    List<Product> findByReleaseDateBetween(LocalDate start, LocalDate end);

    // 6. Sorted results by price (in controller/service)
    // 7. Top N
    List<Product> findTop3ByOrderByPriceDesc(); // top 3 highest price
}
