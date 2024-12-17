CREATE TABLE book (
                      id BIGINT AUTO_INCREMENT PRIMARY KEY,
                      book_name VARCHAR(255) NOT NULL,
                      book_description TEXT,
                      cost DECIMAL(10, 2) NOT NULL CHECK (cost >= 0),
                      number_of_pages INT NOT NULL CHECK (number_of_pages > 0),
                      INDEX idx_book_name (book_name)
);
