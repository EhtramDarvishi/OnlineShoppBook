package com.example.onlineshopebook.model;

import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@Table(schema = SchemaName.schemaName)
public class ShoppingCard extends BaseEntity {

    private int count;
    @ManyToOne
    private Book book;
    @ManyToOne
    private Factor factor;
}
