package com.fazztrack.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fazztrack.library.models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {

}
