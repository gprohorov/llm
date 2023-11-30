package com.example.llm.repository;
/*
  @author   george
  @project   llm
  @class  ItemRepository
  @version  1.0.0 
  @since 26.11.23 - 18.57
*/

import com.example.llm.model.Item;
import com.example.llm.model.PhraseUkr;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends MongoRepository<Item, String> {
    /*
          @author   george
          @project   llm
          @class  ItemRepository
          @version  1.0.0
          @since 26.11.23 - 18.48
        */
    @Repository
    interface WordUkrRepository extends MongoRepository<PhraseUkr, String> {
    }
}
