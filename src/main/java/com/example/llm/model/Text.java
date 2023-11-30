package com.example.llm.model;
/*
  @author   george
  @project   llm
  @class  Text
  @version  1.0.0 
  @since 26.11.23 - 13.16
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Text {
    private Item item;
    private List<WordUkr> words = new ArrayList<>();
    private List<PhraseUkr> phrase = new ArrayList<>();

    public Text() {
    }

    public Text(Item item, List<WordUkr> words, List<PhraseUkr> phrase) {
        this.item = item;
        this.words = words;
        this.phrase = phrase;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public List<WordUkr> getWords() {
        return words;
    }

    public void setWords(List<WordUkr> words) {
        this.words = words;
    }

    public List<PhraseUkr> getPhrase() {
        return phrase;
    }

    public void setPhrase(List<PhraseUkr> phrase) {
        this.phrase = phrase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return Objects.equals(getItem(), text.getItem()) && Objects.equals(getWords(), text.getWords()) && Objects.equals(getPhrase(), text.getPhrase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getItem(), getWords(), getPhrase());
    }

    @Override
    public String toString() {
        return "Text{" +
                "item=" + item +
                ", words=" + words +
                ", phrase=" + phrase +
                '}';
    }
}
