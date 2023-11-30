package com.example.llm.model;
/*
  @author   george
  @project   llm
  @class  WordUkr
  @version  1.0.0 
  @since 24.11.23 - 20.12
*/

import java.util.List;
import java.util.Objects;

public class WordUkr {
    private String id;
    private String body;
    private String root;
    private double importance;
    private String eng;
    private List<String> synonymsEng;
    private List<String> synonymsUkr;

    public WordUkr() {
    }

    public WordUkr(String body, String root,
                   double importance, String eng, List<String> synonymsEng,
                   List<String> synonymsUkr) {
        this.body = body;
        this.root = root;
        this.importance = importance;
        this.eng = eng;
        this.synonymsEng = synonymsEng;
        this.synonymsUkr = synonymsUkr;
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

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public double getImportance() {
        return importance;
    }

    public void setImportance(double importance) {
        this.importance = importance;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public List<String> getSynonymsEng() {
        return synonymsEng;
    }

    public void setSynonymsEng(List<String> synonymsEng) {
        this.synonymsEng = synonymsEng;
    }

    public List<String> getSynonymsUkr() {
        return synonymsUkr;
    }

    public void setSynonymsUkr(List<String> synonymsUkr) {
        this.synonymsUkr = synonymsUkr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordUkr wordUkr = (WordUkr) o;
        return Objects.equals(getId(), wordUkr.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "WordUkr{" +
                "id='" + id + '\'' +
                ", body='" + body + '\'' +
                ", root='" + root + '\'' +
                ", importance=" + importance +
                ", eng='" + eng + '\'' +
                ", synonymsEng=" + synonymsEng +
                ", synonymsUkr=" + synonymsUkr +
                '}';
    }
}
