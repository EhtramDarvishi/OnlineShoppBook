package com.example.onlineshopebook.model;


import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
@Getter
@Setter
@Table(schema = SchemaName.schemaName)
public class Factor extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
