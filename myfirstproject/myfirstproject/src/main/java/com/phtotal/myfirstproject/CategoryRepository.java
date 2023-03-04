package com.phtotal.myfirstproject;

import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class CategoryRepository {
    public void save (Category obj){
        ...
    }
    public Category findById(Long id){
        ...
    }
    public List<Category> findAll(){
        ...
    }
}
