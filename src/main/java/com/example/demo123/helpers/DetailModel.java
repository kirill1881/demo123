package com.example.demo123.helpers;

import com.example.demo123.models.ItemModel;
import lombok.Data;

@Data
public class DetailModel {
    private ItemModel itemModel;
    private String usdPrise;
    private String eurPrice;
}
