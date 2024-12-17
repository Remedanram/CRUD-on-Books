package com.book.crud_on_books.dto;

import com.book.crud_on_books.controller.BookController;
import lombok.Data;

@Data
public class BookDto {
//    private long id;
    private String bookName;
    private String bookDescription;
    private double cost;
    private int numberOFPage;
    private String name;
    private int age;

}
