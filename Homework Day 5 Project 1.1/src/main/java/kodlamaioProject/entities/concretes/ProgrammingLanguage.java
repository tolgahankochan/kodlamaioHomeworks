package kodlamaioProject.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "courselanguage") //veritabanında name'i courselanguage olana bak  //tabloya karşılık geleeck bir class belirttik
@Getter  //Getter'lar
@Setter  //Setter'lar
@AllArgsConstructor
@NoArgsConstructor  //parametresiz çalış
@Entity  //33.dkya bak
public class ProgrammingLanguage {

	@Id  //"Sen veritabanında primary key'sin" burada onu bunu belirttik.
	@GeneratedValue(strategy = GenerationType.IDENTITY) //"Veritabanına yeni veri eklenecekse birer artır.Stratejin bu" dedik
	
	@Column(name="id")
	private int id;
	
	@Column(name="languageName")
	private String languageName;
	
	@OneToMany(mappedBy = "programmingLangage")
	private List<SubTechnology> subTechnologies;
	
	
	
	
	
	
	
	
	
}
