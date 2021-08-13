package ua.spark.shop.app.controller;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping
    public ResponseEntity<CollectionModel<Object>> showAll() {
        return null;
    }

    @GetMapping("{id}")
    public ResponseEntity<EntityModel<Object>> showById(@PathVariable Long id) {
        return null;
    }
}
