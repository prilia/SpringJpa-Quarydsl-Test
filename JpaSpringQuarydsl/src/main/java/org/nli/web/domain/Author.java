package org.nli.web.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Data;

@Entity
@Data
@JsonAutoDetect
public class Author implements java.io.Serializable {
	private static final long serialVersionUID = 7276341303621208893L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String firstName;
	private String lastName;
}
