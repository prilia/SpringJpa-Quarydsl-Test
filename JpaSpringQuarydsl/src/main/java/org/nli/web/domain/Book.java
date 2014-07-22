package org.nli.web.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Data;

@Entity
@Data
@JsonAutoDetect
public class Book implements java.io.Serializable {
	private static final long serialVersionUID = -4164260175007239385L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	
//	@ManyToMany(fetch = FetchType.EAGER)
//	@JoinTable(name = "book_author",
//			joinColumns = {@JoinColumn(name = "book_id", referencedColumnName = "id")},
//			inverseJoinColumns = {@JoinColumn(name = "author_id", referencedColumnName = "id")})
//	private List<Author> authors;

//	@ManyToMany(fetch = FetchType.EAGER)
//	@JoinTable(name = "book_narrator",
//			joinColumns = {@JoinColumn(name = "book_id", referencedColumnName = "id")},
//			inverseJoinColumns = {@JoinColumn(name = "author_id", referencedColumnName = "id")})
//	private List<Author> narrators;

//	@ManyToMany(fetch = FetchType.EAGER)
//	@JoinTable(name = "book_editor",
//			joinColumns = {@JoinColumn(name = "book_id", referencedColumnName = "id")},
//			inverseJoinColumns = {@JoinColumn(name = "author_id", referencedColumnName = "id")})
//	private List<Author> editors;
	
	@ManyToMany(cascade = {CascadeType.ALL}, fetch=FetchType.EAGER)
    @JoinTable(name="Author", 
                joinColumns={@JoinColumn(name="author_id")}, 
                inverseJoinColumns={@JoinColumn(name="id")})
	private List<Author> editors;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
	/*
	@ManyToOne
	@JoinColumn(name = "author_id")
	private Category author;
	*/
}
