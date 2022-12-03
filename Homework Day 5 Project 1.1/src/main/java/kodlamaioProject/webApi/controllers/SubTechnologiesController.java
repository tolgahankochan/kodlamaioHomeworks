package kodlamaioProject.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaioProject.business.abstracts.SubTechnologyService;
import kodlamaioProject.business.requests.subTechnology.CreateSubTechnologyRequest;
import kodlamaioProject.business.requests.subTechnology.DeleteSubTechnologyRequest;
import kodlamaioProject.business.requests.subTechnology.GetByIdSubTechnologyRequest;
import kodlamaioProject.business.requests.subTechnology.UpdateSubTechnologyRequest;
import kodlamaioProject.business.responses.subTechnology.CreateSubTechnologyResponse;
import kodlamaioProject.business.responses.subTechnology.DeleteSubTechnologyResponse;
import kodlamaioProject.business.responses.subTechnology.GetAllSubTechnologyResponse;
import kodlamaioProject.business.responses.subTechnology.GetByIdSubTechnologyResponse;
import kodlamaioProject.business.responses.subTechnology.UpdateSubTechnologyResponse;

@RestController
@RequestMapping("/api/subtechnologies/")
public class SubTechnologiesController {

	private SubTechnologyService subTechnologyService;

	@Autowired
	public SubTechnologiesController(SubTechnologyService subTechnologyService) {
		super();
		this.subTechnologyService = subTechnologyService;
	}
	
	// Crud
	
	@PostMapping("add")
	public CreateSubTechnologyResponse add(CreateSubTechnologyRequest createSubTechnologyRequest)throws Exception{
		return subTechnologyService.add(createSubTechnologyRequest); 
	}
	
	@PutMapping("update")
	public UpdateSubTechnologyResponse update(UpdateSubTechnologyRequest updateSubTechnologyRequest) throws Exception{
		return subTechnologyService.update(updateSubTechnologyRequest);
	}
	
	@DeleteMapping("delete")
	public DeleteSubTechnologyResponse delete(DeleteSubTechnologyRequest deleteSubTechnologyRequest) throws Exception {
		return subTechnologyService.delete(deleteSubTechnologyRequest);
	}
	
	// get methods
	
	@GetMapping("getall")
	public List<GetAllSubTechnologyResponse> getAll(){
		return subTechnologyService.getAll();
	}
	
	
	@GetMapping("getbyid")
	public GetByIdSubTechnologyResponse getById(GetByIdSubTechnologyRequest getByIdSubTechnologyRequest)
	{
		return subTechnologyService.getById(getByIdSubTechnologyRequest);
	}
	
	
	
	
	
	
	
	
}
