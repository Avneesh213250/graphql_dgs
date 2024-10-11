package com.graphql_dgs.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private Integer pageCount;

    @OneToOne(mappedBy = "book", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Auther auther;

    public Book(String name, Integer pageCount, Auther auther) {
        this.name = name;
        this.pageCount = pageCount;
        this.auther = auther;
    }
}
