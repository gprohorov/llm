package com.example.llm.repository;
/*
  @author   george
  @project   llm
  @class  TrashWordRepository
  @version  1.0.0 
  @since 30.11.23 - 13.56
*/

import com.example.llm.model.TrashWord;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrashWordRepository extends MongoRepository<TrashWord, String> {
}
