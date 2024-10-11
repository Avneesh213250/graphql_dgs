package com.graphql_dgs.datafetcher;

import com.graphql_dgs.entity.Auther;
import com.graphql_dgs.entity.Book;
import com.graphql_dgs.entity.BookInput;
import com.graphql_dgs.service.BookService;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsMutation;
import com.netflix.graphql.dgs.DgsQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;

import java.util.List;
import java.util.Optional;

@DgsComponent
public class BookDataFetcher {


    @Autowired
    private BookService bookService;

    @DgsQuery
    public List<Book> findAll(){
        return bookService.findAll();
    }

    @DgsQuery
    public Optional<Book> findById(@Argument Integer id){
        return bookService.findById(id);
    }

    @DgsMutation
    public Book save(@Argument BookInput bookInput){
        Book book =new Book(bookInput.getName(), bookInput.getPageCount(), new Auther(bookInput.getAutherInput().getName()));

        return bookService.saveBook(book);
    }

    @DgsMutation
    public Book update(@Argument Integer id, @Argument String name, @Argument Integer pageCount){
        return bookService.updateBook(id, name, pageCount);
    }

    @DgsMutation
    public String delete(@Argument Integer id){
        return bookService.delete(id);
    }


}
