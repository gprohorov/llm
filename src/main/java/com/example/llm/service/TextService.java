package com.example.llm.service;
/*
  @author   george
  @project   llm
  @class  TextService
  @version  1.0.0 
  @since 30.11.23 - 13.50
*/

import com.example.llm.model.TrashWord;
import com.example.llm.model.WordUkr;
import com.example.llm.repository.TrashWordRepository;
import com.example.llm.repository.WordUkrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.example.llm.utils.TextUtils.convertPdfToTxtInMemory;
import static com.example.llm.utils.TextUtils.tokenize;

@Service
public class TextService {

    String bookPdf = "/home/george/Desktop/book.pdf";
    String polPdf = "/home/george/Desktop/pol.pdf";

    private final TrashWordRepository trashWordRepository;
    private final WordUkrRepository wordUkrRepository;
    @Autowired
    public TextService(TrashWordRepository trashWordRepository, WordUkrRepository wordUkrRepository) {
        this.trashWordRepository = trashWordRepository;
        this.wordUkrRepository = wordUkrRepository;
    }

   // @PostConstruct
    void init() throws IOException {
        saveTrashWords(bookPdf, polPdf);
    }

    public  List<String> saveTrashWords(String file1, String file2) throws IOException {
        List<String> trash = new ArrayList<>();
        List<String> bk = tokenize(convertPdfToTxtInMemory(file1)).stream().distinct().toList();
        System.out.println("bk is ready " + bk.size());
        List<String> pl = tokenize(convertPdfToTxtInMemory(file2)).stream().distinct().toList();
        System.out.println("pl is ready " + pl.size());

        for (int i = 0; i < bk.size() ; i++) {
            String word = bk.get(i);
            if (pl.contains(word)) {
                trash.add(word);
                trashWordRepository.save(new TrashWord(word));
            }
        }
        System.out.println(trash.size());
        return  trash.stream().sorted().toList();
    }

    public  List<String> saveKeyWords(String file1, String file2) throws IOException {
        List<String> keyWords = new ArrayList<>();
        List<WordUkr> wordUkrs = new ArrayList<>();
        List<String> bk = tokenize(convertPdfToTxtInMemory(file1)).stream().distinct().toList();
        System.out.println("bk is ready " + bk.size());
        List<String> pl = tokenize(convertPdfToTxtInMemory(file2)).stream().distinct().toList();
        System.out.println("pl is ready " + pl.size());

        for (int i = 0; i < bk.size() ; i++) {
            String word = bk.get(i);
            if (!pl.contains(word)) {
                keyWords.add(word);
            }
        }
        wordUkrs = keyWords.stream()
                .distinct()
                .sorted()
                .map(word -> new WordUkr(word))
                .toList();
        wordUkrRepository.saveAll(wordUkrs);
        System.out.println(keyWords.size());
        return  keyWords.stream().sorted().toList();
    }



}
