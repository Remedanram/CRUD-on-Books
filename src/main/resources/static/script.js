document.addEventListener('DOMContentLoaded', function() {
    // Fetch and display books
    fetchBooks();

    // Add new book
    const addBookForm = document.getElementById('addBookForm');
    addBookForm.addEventListener('submit', function(e) {
        e.preventDefault();
        const formData = new FormData(addBookForm);
        const bookData = {
            bookName: formData.get('bookName'),
            bookDescription: formData.get('bookDescription'),
            cost: formData.get('cost'),
            numberOFPage: formData.get('numberOFPage'),
        };

        fetch('http://localhost:8080/api/books', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(bookData)
        }).then(response => response.json())
            .then(data => {
                alert('Book added successfully');
                fetchBooks();
            }).catch(error => alert('Error adding book'));
    });

    // Update book
    const updateBookForm = document.getElementById('updateBookForm');
    updateBookForm.addEventListener('submit', function(e) {
        e.preventDefault();
        const formData = new FormData(updateBookForm);
        const bookData = {
            bookName: formData.get('updatedBookName'),
            bookDescription: formData.get('updatedBookDescription'),
            cost: formData.get('updatedCost'),
            numberOFPage: formData.get('updatedNumberOFPage'),
        };
        const bookId = formData.get('bookId');

        fetch(`http://localhost:8080/api/books/${bookId}`, {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(bookData)
        }).then(response => response.json())
            .then(data => {
                alert('Book updated successfully');
                fetchBooks();
            }).catch(error => alert('Error updating book'));
    });

    // Delete book
    const deleteBookForm = document.getElementById('deleteBookForm');
    deleteBookForm.addEventListener('submit', function(e) {
        e.preventDefault();
        const bookId = document.getElementById('deleteBookId').value;

        fetch(`http://localhost:8080/api/books/${bookId}`, {
            method: 'DELETE',
        }).then(() => {
            alert('Book deleted successfully');
            fetchBooks();
        }).catch(error => alert('Error deleting book'));
    });
});

// Fetch all books from the API
function fetchBooks() {
    fetch('http://localhost:8080/api/books')
        .then(response => response.json())
        .then(data => {
            const bookList = document.querySelector('.book-list');
            bookList.innerHTML = '';
            data.forEach(book => {
                const bookItem = document.createElement('div');
                bookItem.classList.add('book-item');
                bookItem.innerHTML = `
                    <h3>${book.bookName}</h3>
                    <p>${book.bookDescription}</p>
                    <p>Cost: $${book.cost}</p>
                    <p>Pages: ${book.numberOFPage}</p>
                `;
                bookList.appendChild(bookItem);
            });
        })
        .catch(error => console.error('Error fetching books:', error));
}
