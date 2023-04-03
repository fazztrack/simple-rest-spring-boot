package com.fazztrack.library.services.book;

import com.fazztrack.library.payloads.requests.BookRequest;
import com.fazztrack.library.payloads.responses.Response;

public interface BookService {
  Response addBook(BookRequest request);

  Response getBooks();

  Response getBookById(String uuid);

  Response updateBookById(String uuid, BookRequest request);

  Response deleteBookById(String uuid);
}
