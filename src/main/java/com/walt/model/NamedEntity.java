package com.walt.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class NamedEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String name;

    public NamedEntity() {
    }

    public NamedEntity(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "NamedEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
