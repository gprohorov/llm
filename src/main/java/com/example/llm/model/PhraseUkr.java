package com.example.llm.model;
/*
  @author   george
  @project   llm
  @class  Phrase
  @version  1.0.0 
  @since 24.11.23 - 20.12
*/

import java.util.List;
import java.util.Objects;

public class PhraseUkr {
    private String id;
    private String body;
    private List<WordUkr> phraseAsList;
    private String eng;
    private List<String> synonyms;

    public PhraseUkr() {
    }

    public PhraseUkr(String body, List<WordUkr> phraseAsList, String eng,
                     List<String> synonyms) {
        this.body = body;
        this.phraseAsList = phraseAsList;
        this.eng = eng;
        this.synonyms = synonyms;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<WordUkr> getPhraseAsList() {
        return phraseAsList;
    }

    public void setPhraseAsList(List<WordUkr> phraseAsList) {
        this.phraseAsList = phraseAsList;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public List<String> getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhraseUkr phraseUkr = (PhraseUkr) o;
        return Objects.equals(getId(), phraseUkr.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "PhraseUkr{" +
                "id='" + id + '\'' +
                ", body='" + body + '\'' +
                ", phraseAsList=" + phraseAsList +
                ", eng='" + eng + '\'' +
                ", synonyms=" + synonyms +
                '}';
    }
}
