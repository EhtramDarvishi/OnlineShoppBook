package com.example.onlineshopebook.model;


import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@Table(schema = SchemaName.schemaName)
public class Book extends BaseEntity{

    private String bookName;
    private long price;
}

