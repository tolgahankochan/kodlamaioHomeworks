package kodlamaioProject.business.concretes;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaioProject.business.abstracts.ProgrammingLanguageService;
import kodlamaioProject.business.requests.programmingLanguage.CreateProgrammingLanguageRequest;
import kodlamaioProject.business.requests.programmingLanguage.DeleteProgrammingLanguageRequest;
import kodlamaioProject.business.requests.programmingLanguage.GetByIdProgrammingLanguageRequest;
import kodlamaioProject.business.requests.programmingLanguage.UpdateProgrammingLanguageRequest;
import kodlamaioProject.business.responses.programmingLanguage.CreateProgrammingLanguageResponse;
import kodlamaioProject.business.responses.programmingLanguage.DeleteProgrammingLanguageResponse;
import kodlamaioProject.business.responses.programmingLanguage.GetAllProgrammingLanguagesResponse;
import kodlamaioProject.business.responses.programmingLanguage.GetByIdProgammingLanguagesResponse;
import kodlamaioProject.business.responses.programmingLanguage.UpdateProgrammingLanguageResponse;
import kodlamaioProject.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlamaioProject.entities.concretes.ProgrammingLanguage;

@Service  //Spring tarafında bunun bir service olduğunu belirttik.
public class ProgrammingLanguageManager implements ProgrammingLanguageService  {
	
	
	@Autowired
	private ModelMapper modelmapper;
	
	
	
	private ProgrammingLanguageRepository programmingLanguageRepository;

	@Override
	public CreateProgrammingLanguageResponse add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UpdateProgrammingLanguageResponse update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DeleteProgrammingLanguageResponse delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest)
			throws Exception {
		
		ProgrammingLanguage getReferanceByIdProgLanguageResult = programmingLanguageRepository .getReferenceById(deleteProgrammingLanguageRequest.getId());
		//Kullanıcıdan getirtilen id değeri ile mevcut olan programlama dilini çağırdık.
		
		programmingLanguageRepository.delete(getReferanceByIdProgLanguageResult);
		
		DeleteProgrammingLanguageResponse deleteProgrammingLanguageResponse = modelmapper.map(getReferanceByIdProgLanguageResult, DeleteProgrammingLanguageResponse.class);
		
		return deleteProgrammingLanguageResponse;
		
		
		//this.programmingLanguageRepository.deleteById(deleteProgrammingLanguageRequest.getId());
		
		
	}

	@Override
	public List<GetAllProgrammingLanguagesResponse> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetByIdProgammingLanguagesResponse getById(
			GetByIdProgrammingLanguageRequest getByIdProgrammingLanguageRequest) {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//veritabanına ihtiyacımız var bu yüzden bağlantı yapmadan
	//geçici bir veritabanı simülasyonu yapacağız veritabanı yapıldı.
	//Bu da dataAcces'te bir Repository oluştumamızı gerektirir.
	
	/*
	private PLanguageRepository langaugeRepository;
	*/
	
	
		
		
		
	
	
	

}
