package com.cisco.Sporty_shoes.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.cisco.Sporty_shoes.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, String> { 

}
