package com.example.lab8parte2.controller;

import com.example.lab8parte2.dao.NewDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/new")
public class NewController {
    @Autowired
    NewDao newDao;

    @GetMapping({"/list", "", "/"})
    public String filtrarC(Model model) {
        model.addAttribute("listaProductos", newDao.filtrar());
        return "product/list";
    }

}
