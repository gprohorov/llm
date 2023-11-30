package com.example.llm.controller;
/*
  @author   george
  @project   llm
  @class  TextController
  @version  1.0.0 
  @since 30.11.23 - 18.09
*/

import com.example.llm.model.Item;
import com.example.llm.service.ItemService;
import com.example.llm.service.TextService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    @RestController
    @RequestMapping("/api/v1/texts")
    @RequiredArgsConstructor
    public class TextController {
        private final TextService service;

       @GetMapping("/trash/{file1}/{file2}")
       public void extractTrashToDb(@PathVariable String file1, @PathVariable String file2) {

       }

    }
