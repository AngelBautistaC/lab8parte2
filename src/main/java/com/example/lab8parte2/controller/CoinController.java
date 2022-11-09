package com.example.lab8parte2.controller;


import com.example.lab8parte2.dao.CoinsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/coin")
public class CoinController {

    @Autowired
    CoinsDao coinDao;


    @GetMapping({"/list", "", "/"})
    public String listarProductos(Model model) {
        model.addAttribute("listaProductos", coinDao.listarCategorias());
        return "product/list";
    }


}
