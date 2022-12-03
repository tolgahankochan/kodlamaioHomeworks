package kodlamaioProject.dataAccess.abstracts;

import java.util.List;

import kodlamaioProject.entities.concretes.PLanguage;

public interface PLanguageRepository {
	
	List<PLanguage> getAll();
	PLanguage getById(int id);
	void add(PLanguage language);
	void update(PLanguage language);
	void delete(int id);
	

}
