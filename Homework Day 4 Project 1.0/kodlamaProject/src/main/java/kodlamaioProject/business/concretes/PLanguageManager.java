package kodlamaioProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaioProject.business.abstracts.PLanguageService;
import kodlamaioProject.dataAccess.abstracts.PLanguageRepository;
import kodlamaioProject.entities.concretes.PLanguage;

@Service  //Spring tarafında bunun bir service olduğunu belirttik.
public class PLanguageManager implements PLanguageService {

	
	//veritabanına ihtiyacımız var bu yüzden bağlantı yapmadan
	//geçici bir veritabanı simülasyonu yapacağız
	//Bu da dataAcces'te bir Repository oluştumamızı gerektirir.
	
	
	private PLanguageRepository langaugeRepository;
	
	
	
	
	@Autowired
	public PLanguageManager(PLanguageRepository langaugeRepository) {
		super();
		this.langaugeRepository = langaugeRepository;
	}
	

	@Override
	public List<PLanguage> getAll() {
		return langaugeRepository.getAll();
	}

	@Override
	public PLanguage getById(int id) {
		return langaugeRepository.getById(id);
	}

	@Override
	public void add(PLanguage language) throws Exception {
		ValEmpty(language);
		langaugeRepository.add(language);
		
	}

	@Override
	public void update(PLanguage language) throws Exception {
		ValEmpty(language);
		langaugeRepository.update(language);
		
	}

	@Override
	public void delete(int id) {
		langaugeRepository.delete(id);
	}
	
	private void ValEmpty(PLanguage language) throws Exception{
		if(language.getLanguageName()=="")
		
			throw new Exception("Programming language must not empty !");
		var pLanguages = langaugeRepository.getAll();
		
		for(PLanguage language1 : pLanguages)
		{
			if(language1.getLanguageName().equals(language1.getLanguageName())) {
				throw new Exception("This programming language is already exist.");
			}
		}
		
		
		
		
	}
	
	
	
	

}
