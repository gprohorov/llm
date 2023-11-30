package com.example.llm.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Objects;
@Document
public class Item {
    @Id
    private String id;
    private String uri;
    private String name;
    private String authors;
    private String origins;
    private ItemType itemType;
    private LocalDate dateOfPublication;
    private TextLanguage language;
    private TextType type;
    private double size;
    private IndexVector indexVector;

    public Item() {
    }

    public Item(String uri, String name, String authors, String origins, ItemType itemType,
                LocalDate dateOfPublication, TextLanguage language,
                TextType type, double size, IndexVector indexVector) {
        this.uri = uri;
        this.name = name;
        this.authors = authors;
        this.origins = origins;
        this.itemType = itemType;
        this.dateOfPublication = dateOfPublication;
        this.language = language;
        this.type = type;
        this.size = size;
        this.indexVector = indexVector;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getOrigins() {
        return origins;
    }

    public void setOrigins(String origins) {
        this.origins = origins;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public LocalDate getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(LocalDate dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    public TextLanguage getLanguage() {
        return language;
    }

    public void setLanguage(TextLanguage language) {
        this.language = language;
    }

    public TextType getType() {
        return type;
    }

    public void setType(TextType type) {
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public IndexVector getIndexVector() {
        return indexVector;
    }

    public void setIndexVector(IndexVector indexVector) {
        this.indexVector = indexVector;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(getId(), item.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", uri='" + uri + '\'' +
                ", name='" + name + '\'' +
                ", authors='" + authors + '\'' +
                ", origins='" + origins + '\'' +
                ", itemType=" + itemType +
                ", dateOfPublication=" + dateOfPublication +
                ", language=" + language +
                ", type=" + type +
                ", size=" + size +
                ", indexVector=" + indexVector +
                '}';
    }
}
