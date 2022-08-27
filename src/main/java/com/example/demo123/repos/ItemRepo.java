package com.example.demo123.repos;

import com.example.demo123.models.ItemModel;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepo extends CrudRepository<ItemModel, Long> {
}
