package com.springproject.ecommerceApplication;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface ProductJpaRepository extends JpaRepository<Product, Long> {

    @Query("SELECT new com.springproject.ecommerceApplication.SimilarProduct(p.id, p.imageurl, p.name, p.price, p.brand, p.rating) " +
           "FROM Product p WHERE p.category.id = :categoryId AND p.id != :productId ORDER BY RANDOM()")
    List<SimilarProduct> findSimilarProducts(@Param("categoryId") Long categoryId, @Param("productId") Long productId, Pageable pageable);

@Query("SELECT p FROM Product p WHERE "
     + "(:category IS NULL OR p.category.id = :category) AND "
     + "(:rating IS NULL OR p.rating = :rating) AND "
     + "(COALESCE(:titleSearch, '') = '' OR LOWER(p.name) LIKE LOWER(CONCAT('%', :titleSearch, '%')))")
List<Product> findProducts(@Param("category") Integer category, 
                           @Param("titleSearch") String titleSearch, 
                           @Param("rating") Integer rating, 
                           Pageable pageable);

}
