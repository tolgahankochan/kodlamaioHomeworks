package kodlamaioProject.business.abstracts;

import java.util.List;

import kodlamaioProject.business.requests.programmingLanguage.CreateProgrammingLanguageRequest;
import kodlamaioProject.business.requests.programmingLanguage.DeleteProgrammingLanguageRequest;
import kodlamaioProject.business.requests.programmingLanguage.GetByIdProgrammingLanguageRequest;
import kodlamaioProject.business.requests.programmingLanguage.UpdateProgrammingLanguageRequest;
import kodlamaioProject.business.responses.programmingLanguage.CreateProgrammingLanguageResponse;
import kodlamaioProject.business.responses.programmingLanguage.DeleteProgrammingLanguageResponse;
import kodlamaioProject.business.responses.programmingLanguage.GetAllProgrammingLanguagesResponse;
import kodlamaioProject.business.responses.programmingLanguage.GetByIdProgammingLanguagesResponse;
import kodlamaioProject.business.responses.programmingLanguage.UpdateProgrammingLanguageResponse;

public interface ProgrammingLanguageService {
	/*
	List<PLanguage>getAll(); //Listeleme işlemi
	
	PLanguage getById(int id);// id ile çağırma işlemi
	
	void add(PLanguage language) throws Exception;
	void update(PLanguage language) throws Exception;
	void delete(int id); // id ile silme işlemi
	*/
	
	// CURD OPERATION 
	
	CreateProgrammingLanguageResponse add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest)throws Exception;
	
	UpdateProgrammingLanguageResponse update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest)throws Exception;
	
	DeleteProgrammingLanguageResponse delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest)throws Exception;
	
	// GET METHODS
	
	List<GetAllProgrammingLanguagesResponse> getAll();
	
	GetByIdProgammingLanguagesResponse getById(GetByIdProgrammingLanguageRequest getByIdProgrammingLanguageRequest);
	
	

}
