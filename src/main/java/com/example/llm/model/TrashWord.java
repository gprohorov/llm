package com.example.llm.model;
/*
  @author   george
  @project   llm
  @class  TrashWord
  @version  1.0.0 
  @since 30.11.23 - 13.48
*/

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class TrashWord {
    @Id
    private String id;
    private String body;
    private String root;
}
