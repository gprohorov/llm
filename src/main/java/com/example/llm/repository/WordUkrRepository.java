package com.example.llm.repository;
/*
  @author   george
  @project   llm
  @class  WordUkrRepository
  @version  1.0.0 
  @since 26.11.23 - 18.58
*/

import com.example.llm.model.WordUkr;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordUkrRepository extends MongoRepository<WordUkr, String> {
}
