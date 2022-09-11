package com.example.demo123.repos;

import com.example.demo123.enums.Type;
import com.example.demo123.models.ItemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemRepo extends JpaRepository<ItemModel, Long> {
    List<ItemModel> findAllByType(Type type);
}
