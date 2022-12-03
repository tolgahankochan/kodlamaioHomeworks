package kodlamaioProject.business.abstracts;

import java.util.List;

import kodlamaioProject.entities.concretes.PLanguage;

public interface PLanguageService {
	
	List<PLanguage>getAll(); //Listeleme işlemi
	
	PLanguage getById(int id);// id ile çağırma işlemi
	
	void add(PLanguage language) throws Exception;
	void update(PLanguage language) throws Exception;
	void delete(int id); // id ile silme işlemi
	

}
