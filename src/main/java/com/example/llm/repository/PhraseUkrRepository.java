package com.example.llm.repository;
/*
  @author   george
  @project   llm
  @class  ItemRepository
  @version  1.0.0 
  @since 26.11.23 - 18.54
*/

import com.example.llm.model.*;;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhraseUkrRepository extends MongoRepository<PhraseUkr, String> {
}
