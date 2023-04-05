package realestate.RealStateProject.properties;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
