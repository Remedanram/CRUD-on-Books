package com.book.crud_on_books.controller;

import com.book.crud_on_books.dto.BookRequestDto;
import com.book.crud_on_books.entity.Book;
import com.book.crud_on_books.service.BookService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    // Get all books
    @Operation(summary = "Get all books", description = "Retrieve a list of all available books.")
    @ApiResponse(responseCode = "200", description = "Successfully retrieved the list of books.")
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }



    // Add a new book
    @Operation(summary = "Add a new book", description = "Add a new book to the database.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Book added successfully."),
            @ApiResponse(responseCode = "400", description = "Invalid input provided.")
    })
    @PostMapping
    public ResponseEntity<Book> addbooks(@RequestBody BookRequestDto requestDto) {
        Book responseDto = bookService.add(requestDto);
        return ResponseEntity.ok(responseDto);
    }

    // Get a book by its ID
    @Operation(summary = "Get a book by ID", description = "Retrieve details of a specific book by its ID.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Book found successfully."),
            @ApiResponse(responseCode = "404", description = "Book not found.")
    })
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        return bookService.getBookById(id)
                .map(book -> ResponseEntity.ok().body(book))
                .orElse(ResponseEntity.notFound().build());
    }

    // Update a book by ID
    @Operation(summary = "Update a book", description = "Update the details of an existing book using its ID.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Book updated successfully."),
            @ApiResponse(responseCode = "404", description = "Book not found.")
    })
    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book bookDetails) {
        Book updatedBook = bookService.updateBook(id, bookDetails);
        return ResponseEntity.ok(updatedBook);
    }

    // Delete a book by ID
    @Operation(summary = "Delete a book", description = "Delete a book from the database using its ID.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Book deleted successfully."),
            @ApiResponse(responseCode = "404", description = "Book not found.")
    })
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        bookService.deleteById(id);
    }
    @DeleteMapping
    public void delete(){
        bookService.deleteAll();
    }
}
