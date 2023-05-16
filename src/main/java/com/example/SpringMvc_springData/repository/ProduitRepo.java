package com.example.SpringMvc_springData.repository;

import com.example.SpringMvc_springData.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepo extends JpaRepository<Produit,Integer> {

}
