package kodlamaioProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaioProject.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Integer> {
	
	//ÖNEMLİ :
	/*
	 *  dataAccess sınıfının concretes'ini yazmadık çünkü spring'in jpa kısmı bunu bizim için belleğe yerleştiriyor.
	 * 
	 * 
	 * 
	 * */
	
	
	/*
	List<PLanguage> getAll();
	PLanguage getById(int id);
	void add(PLanguage language);
	void update(PLanguage language);
	void delete(int id);
	*/ 
	
	/* Burayı silebiliriz çünkü spring JpaRepository bize bunu sağlıyor zaten.
	 * 
	 * findAll(); vs vs.
	 * 
	 * */
	

}
