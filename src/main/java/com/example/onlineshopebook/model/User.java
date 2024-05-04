package com.example.onlineshopebook.model;

import jakarta.persistence.Table;
import lombok.*;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@Table(schema = SchemaName.schemaName)
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class User extends BaseEntity{


    private String username;
    private String password ;
}
