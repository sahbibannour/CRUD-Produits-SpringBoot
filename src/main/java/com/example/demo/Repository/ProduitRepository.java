package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
