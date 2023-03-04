package com.phtotal.myfirstproject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value ="/categories" )
public class CategoryResource {
    public CategoryResource() {

    }

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
       List<Category> list = new ArrayList<>();
        list.add(new Category(1L, "Electronics"));
        list.add(new Category(2L, "Books"));
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<...>findyById(@PathVariable long id) {
        Category cat = new Category(1L,"Electronics");
        return ResponseEntity.ok().body(cat);
    }

}
