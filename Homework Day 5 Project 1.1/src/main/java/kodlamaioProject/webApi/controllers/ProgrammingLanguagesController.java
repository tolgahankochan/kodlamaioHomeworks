package kodlamaioProject.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

@RestController
@RequestMapping("/api/tolga")
public class ProgrammingLanguagesController {
private ProgrammingLanguageService languageService;
	

	private ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}
	
	// CRUD Tarafı 
	
	
	@PostMapping("add")
	public CreateProgrammingLanguageResponse add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest)throws Exception{
		return programmingLanguageService.add(createProgrammingLanguageRequest);
		
	}
	
	@PostMapping("update")
	public UpdateProgrammingLanguageResponse update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest)throws Exception{
		return programmingLanguageService.update(updateProgrammingLanguageRequest);
	}
	
	@PostMapping("delete")
	public DeleteProgrammingLanguageResponse delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest)throws Exception{
		
		return programmingLanguageService.delete(deleteProgrammingLanguageRequest);
	}
	
	// GET Methods
	
	@GetMapping("getall")
	public List<GetAllProgrammingLanguagesResponse>getAll(){
		return programmingLanguageService.getAll();
	}
	
	@GetMapping("getbyid")
	public GetByIdProgammingLanguagesResponse getById(GetByIdProgrammingLanguageRequest getByIdProgrammingLanguageRequest) {
		return programmingLanguageService.getById(getByIdProgrammingLanguageRequest);
	}
	
	
	
	

	
}
