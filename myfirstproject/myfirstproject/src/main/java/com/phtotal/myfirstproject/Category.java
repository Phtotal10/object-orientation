package com.phtotal.myfirstproject;

import java.io.Serializable;
import java.util.Objects;

public class Category  implements Serializable {
    private static final long serialVersionUID = 1L;
    private long id;
    private string name;

    public Category() {
    }

    public Category(long id, string name ) {
        super();
        this.id = id;
        this.name =name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return getId() == category.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
