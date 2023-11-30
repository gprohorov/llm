package com.example.llm.model;
/*
  @author   george
  @project   llm
  @class  IndexVector
  @version  1.0.0 
  @since 24.11.23 - 20.02
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class IndexVector {
    private Map<Tag, Double> vector = new HashMap<>();

    public IndexVector() {
    }

    public IndexVector(Map<Tag, Double> vector) {
        this.vector = vector;
    }

    public Map<Tag, Double> getVector() {
        return vector;
    }

    public void setVector(Map<Tag, Double> vector) {
        this.vector = vector;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IndexVector that = (IndexVector) o;
        return Objects.equals(getVector(), that.getVector());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVector());
    }

    @Override
    public String toString() {
        return "IndexVector{" +
                "vector=" + vector +
                '}';
    }
}
