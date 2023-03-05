package com.phtotal.myfirstproject;

import com.phtotal.myfirstproject.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/categories" )
public class CategoryResource {

    @Autowired
    private CategoryRepository categoryRepository;
    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
       List<Category> list = categoryRepository.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findyById(@PathVariable long id) {
        Category cat = categoryRepository.findById(id);
        return ResponseEntity.ok().body(cat);
    }

}
