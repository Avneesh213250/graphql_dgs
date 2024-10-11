package com.graphql_dgs.repository;

import com.graphql_dgs.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
