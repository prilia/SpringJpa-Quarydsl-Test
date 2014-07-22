package org.nli.web.repository.jpa;

import java.util.List;

import org.nli.web.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AuthorRepository extends JpaRepository<Author, Long> {
	List<Author> findByLastName(String lastName);
}
