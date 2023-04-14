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
import realestate.RealStateProject.projectservices.PropertiesService;

@CrossOrigin("http://localhost:4200/")
@RestController
public class PropertiesController {

	
	@Autowired
	PropertiesService service;
	
	@GetMapping("/getProperties")
	public List<Properties> getAllProperties()
	{
		return service.getAllProperties();
	}
	
	@PostMapping("/postProperty")
	public Properties postProperty(@RequestBody Properties prop)
	{

		return service.postProperty(prop);
	}
	
	@GetMapping("/getPropertyById/{id}")
	public Properties getDataById(@PathVariable Integer id)
	{

		return service.getDataById(id);
	}
	
	@GetMapping("/getPropertyByUserId/{id}")
	public List<Properties> getDataByUserId(@PathVariable Integer id)
	{
		return service.getDataByUserId(id);
		
	}
	
	@PutMapping("/updateProperty")
	public Properties updateProperty(@RequestBody Properties property)
	{
		return service.updateProperty(property);
	}
	
	@DeleteMapping("/deleteProperty/{id}")
	public void deleteProperties(@PathVariable Integer id)
	{
		 service.deleteProperties(id);
	}
	
}
