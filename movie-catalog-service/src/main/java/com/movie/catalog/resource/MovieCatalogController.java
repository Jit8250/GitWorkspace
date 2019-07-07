package com.movie.catalog.resource;


import com.movie.catalog.models.CatalogItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("api")
public class MovieCatalogController {



    @GetMapping("catalog/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
        List<CatalogItem> catalogs=new LinkedList<>();

        catalogs.add(new CatalogItem("Transformers","Robots,aliens",5.5d));
        return  catalogs;
    }
}
