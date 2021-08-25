package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Repository.ProduitRepository;
import com.example.demo.entities.Produit;

@SpringBootTest
class ProduitsDemoApplicationTests {
    @Autowired
    private ProduitRepository ProduitRepos;
	@Test
	void TestCreateProduit () {
		Produit prod = new Produit("OMO","produit" , 2000);
		ProduitRepos.save(prod);
	}
	
	@Test
	void TestFindProduit () {
		Produit p = ProduitRepos.findById(1L).get();
		System.out.print("---------------"+p.getNomProduit()+"----------------");
	}
	
	@Test
	void TestDeleteProduit () {
		ProduitRepos.deleteById(1L);
	
	}
	
	@Test
	void TestUpdateProduit () {
		Produit p = ProduitRepos.findById(1L).get();
		p.setPrix(243);
		ProduitRepos.save(p);
	}
	


}
