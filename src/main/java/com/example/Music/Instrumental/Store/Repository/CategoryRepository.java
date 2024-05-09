package com.example.Music.Instrumental.Store.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Music.Instrumental.Store.Model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
