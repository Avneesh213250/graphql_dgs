package com.graphql_dgs.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookInput {



    private String name;

    private Integer pageCount;
    private AutherInput autherInput;
}
