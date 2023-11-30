package com.example.llm.controller;

import com.example.llm.model.Item;
import com.example.llm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
  @author   george
  @project   llm
  @class  ItemController
  @version  1.0.0 
  @since 26.11.23 - 19.11
*/
@RestController
@RequestMapping("/api/v1/items")
public class ItemController {
    private final ItemService service;

    @Autowired
    public ItemController(ItemService service) {
        this.service = service;
    }
    @GetMapping()
    public List<Item> getAll(){
        return service.getAll();
    }
    @GetMapping("/{id}")
    public Item getOne(@PathVariable String id) throws ChangeSetPersister.NotFoundException {
        return service.get(id);
    }

    @PostMapping()
    public Item insertOne(@RequestBody Item item) {
        return service.create(item);
    }

    @PutMapping()
    public Item updateOne(@RequestBody Item item) {
        return service.update(item);
    }

    @DeleteMapping("/{id}")
    public void deleteOne(@PathVariable String id) {
        service.delete(id);
    }

}
