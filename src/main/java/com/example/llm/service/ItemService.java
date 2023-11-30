package com.example.llm.service;

import com.example.llm.model.Item;
import com.example.llm.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

/*
  @author   george
  @project   llm
  @class  ItemService
  @version  1.0.0 
  @since 26.11.23 - 19.00
*/
@Service
public class ItemService {
    private final ItemRepository repository;

    @Autowired
    public ItemService(ItemRepository repository) {
        this.repository = repository;
    }

    public Item create(Item item) {
       return repository.save(item);
    }
    public Item update(Item item) {
       return repository.save(item);
    }
    public Item get(String id) throws ChangeSetPersister.NotFoundException {
       return repository.findById(id)
               .orElseThrow(() -> new ChangeSetPersister.NotFoundException());
    }
    public void delete(String id) {
        repository.deleteById(id);
    }
    public List<Item> getAll() {
        return repository.findAll();
    }



}
