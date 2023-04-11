package realestate.RealStateProject.properties;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import realestate.RealStateProject.people.People;

@CrossOrigin("http://localhost:4200/")
@RestController
public class PropertiesController {
	@Autowired
	PropertiesJpaRepository repository;
	
	@GetMapping("/getProperties")
	public List<Properties> getAllProperties()
	{
		return repository.findAll();
	}
	
	@PostMapping("/postProperty")
	public Properties postProperty(@RequestBody Properties prop)
	{
		Properties p=repository.save(prop);
		return p;
	}
	
	@GetMapping("/getPropertyById/{id}")
	public Properties getDataById(@PathVariable Integer id)
	{
		Properties pt=repository.findById(id).get();
		return pt;
	}
	
	@GetMapping("/getPropertyByUserId/{id}")
	public List<Properties> getDataByUserId(@PathVariable Integer id)
	{
		return repository.findByUserId(id);
		
	}
	
	@PutMapping("/updateProperty")
	public Properties updateProperty(@RequestBody Properties property)
	{
		return repository.save(property);
	}
	
	@DeleteMapping("/deleteProperty/{id}")
	public void deleteProperties(@PathVariable Integer id)
	{
		 repository.deleteById(id);
	}
	
	/*@DeleteMapping("/jpa/users/{username}/todos/{id}")
		public ResponseEntity<Void> deleteTodo(@PathVariable String username,@PathVariable int id)
		{		
			 todoJpaRepository.deleteById(id);
			 return ResponseEntity.noContent().build();
	}*/
}
