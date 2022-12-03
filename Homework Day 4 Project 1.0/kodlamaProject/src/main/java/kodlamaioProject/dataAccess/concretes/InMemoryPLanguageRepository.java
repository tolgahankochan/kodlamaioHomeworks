package kodlamaioProject.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlamaioProject.dataAccess.abstracts.PLanguageRepository;
import kodlamaioProject.entities.concretes.PLanguage;

public class InMemoryPLanguageRepository implements PLanguageRepository {

	// Şu an veritabanı oluşturuyoruz simüle ediyoruz
	
	List<PLanguage> pLanguages;
	
	public InMemoryPLanguageRepository() {
	pLanguages = new ArrayList<PLanguage>();
	pLanguages.add(new PLanguage(1, "C#"));
	pLanguages.add(new PLanguage(2, "Python"));
	pLanguages.add(new PLanguage(3,"Java"));
	pLanguages.add(new PLanguage(4, "Flutter"));
	pLanguages.add(new PLanguage(5, "Swift"));
	pLanguages.add(new PLanguage(6, "Fortran"));
	pLanguages.add(new PLanguage(7, "Matlab"));
	pLanguages.add(new PLanguage(8, "HTML"));
	
	
	}
	
	
	@Override
	public List<PLanguage> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PLanguage getById(int id) {
		PLanguage languageById = null ;
		
		for(PLanguage lang : pLanguages) {
			if(lang.getId()==id)
			{
				languageById = lang;
				}		
		}
		if(languageById!= null)
			return languageById;
			throw null;
		
	}

	
	
	@Override
	public void add(PLanguage language)
	{
		int lastId = pLanguages.get(pLanguages.size() -1).getId();
		
		language.setId(lastId+1);
		
		pLanguages.add(language);
		
	}

	@Override
	public void update(PLanguage language) {
		
		for (PLanguage lang: pLanguages) {
			if(lang.getId() == language.getId()) {
				lang.setLanguageName(language.getLanguageName());
				break;
			}
		}
	}

	@Override
	public void delete(int id) {
		
		PLanguage deleteTo = getById(id);
		
		if(deleteTo != null) {
			pLanguages.remove(deleteTo);
			return;
		}
		throw null;
	}

}
