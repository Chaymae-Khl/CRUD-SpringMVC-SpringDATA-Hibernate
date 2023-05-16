package com.example.SpringMvc_springData.Controllers;

import com.example.SpringMvc_springData.Services.ProduitService;
import com.example.SpringMvc_springData.models.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProduitC {
    @Autowired
    private ProduitService produitservice;
    @GetMapping("/")
    public String indexx()
    {
        return "redirect:/produits";
    }
    @GetMapping("/produits")
    public String getProducts(Model model) {
        List<Produit> produit = produitservice.getAll();
        model.addAttribute("listproduit",produit);
        return "index";
    }
    @GetMapping("/produits/add" )
    public String showform(Model m){
        m.addAttribute("p", new Produit());
        return "AddForm";
    }
    @PostMapping("/produits/add")
    public String save(@ModelAttribute("p") Produit p){
        produitservice.saveOrUpdateProduit(p);
        return "redirect:/produits";
    }
    @RequestMapping("/produits/edit/{id}")
    public String editForm(@PathVariable("id") int id, Model model) {
        Produit produit = produitservice.getProduitById(id);
        model.addAttribute("data", produit);
        return "updateForm";
    }
    @PostMapping( "/produits/update/{id}")
    public String update(@ModelAttribute("data") Produit produit ){
        produitservice.saveOrUpdateProduit(produit);
        return "redirect:/produits";
    }
    @RequestMapping("/produits/delete/{id}")
    public String delete(@PathVariable int id){
        produitservice.delete(id);
        return "redirect:/";
    }
}
