package kodlamaioProject.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaioProject.business.abstracts.PLanguageService;
import kodlamaioProject.entities.concretes.PLanguage;

@RestController
@RequestMapping("/api/tolga")
public class CourseController {
private PLanguageService languageService;
	
	
	@Autowired
	public CourseController(PLanguageService languageService) {
	super();
	this.languageService = languageService;
}

	@GetMapping("/getAll")
	public List<PLanguage> getAll() {
		return languageService.getAll();
	}
	
	@GetMapping("/getById")
	public PLanguage getById(int id) {
		return languageService.getById(id);
	}
	
	@GetMapping("/add")
	public void add(PLanguage language) throws Exception {
		languageService.add(language);
		System.out.println("Added "+language.getLanguageName());
	}
	
	@GetMapping("/update")
	public void update(PLanguage language) throws Exception {
		languageService.update(language);
		System.out.println("Updated "+language.getLanguageName());
	}
	
	@GetMapping("/delete")
	public void delete(int id) {
		languageService.delete(id);
		System.out.println("Deleted.");
	}
}
