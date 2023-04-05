package realestate.RealStateProject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import realestate.RealStateProject.people.People;
import realestate.RealStateProject.people.PeopleJpaRepository;

@CrossOrigin("http://localhost:4200/")
@RestController
public class PeopleController {

	@Autowired
	private PeopleJpaRepository repository;
	
	@GetMapping("/get")
	public List<People> getData(){
		List<People> data = repository.findAll();
		return data;
	}
}
