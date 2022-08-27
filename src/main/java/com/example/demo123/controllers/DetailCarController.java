package com.example.demo123.controllers;

import com.example.demo123.models.ItemModel;
import com.example.demo123.repos.ItemRepo;
import com.example.demo123.servise.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/detailCar")
public class DetailCarController {
    @Autowired
    ItemRepo itemRepo;

    @Autowired
    CurrencyService currencyService;

    @GetMapping("/{id}")
    public String getDetailPage(@PathVariable long id, Model model){
        Optional<ItemModel> itemModel = itemRepo.findById(id);
        List<ItemModel> list = new ArrayList<>();
        itemModel.ifPresent(list::add);
        ItemModel itemModel1 = list.get(0);
        model.addAttribute("car", itemModel1);
        System.out.println(currencyService.getUSD(itemModel1.getPrice()));
        System.out.println(currencyService.getEUR(itemModel1.getPrice()));
        return "detailcar";
    }
}
