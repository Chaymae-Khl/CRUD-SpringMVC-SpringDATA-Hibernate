package com.example.SpringMvc_springData.Services;

import com.example.SpringMvc_springData.models.Produit;
import com.example.SpringMvc_springData.repository.ProduitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProduitService {
    @Autowired
    ProduitRepo repo;
    public List<Produit> getAll() {
        return repo.findAll();
    }

    public Produit getProduitById(int id) {
        return repo.findById(id).orElse(null);
    }

    public void saveOrUpdateProduit(Produit produit) {
        repo.save(produit);
    }
    public void delete(int id) {
        repo.deleteById(id);
    }
}
