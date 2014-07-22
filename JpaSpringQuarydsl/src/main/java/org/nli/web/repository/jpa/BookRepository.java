package org.nli.web.repository.jpa;

import java.util.List;

import org.nli.web.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Long> {
	List<Book> findByTitle(String title);
}
