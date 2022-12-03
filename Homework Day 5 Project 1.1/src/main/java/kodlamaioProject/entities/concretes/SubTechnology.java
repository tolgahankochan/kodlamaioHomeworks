package kodlamaioProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class SubTechnology {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	
	@Column(name="name")
	private String name;
	
	
	@ManyToOne
	@JoinColumn
	private ProgrammingLanguage pLanguage;
	
}
