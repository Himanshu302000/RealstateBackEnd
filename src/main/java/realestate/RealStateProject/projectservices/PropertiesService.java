package realestate.RealStateProject.projectservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import realestate.RealStateProject.properties.Properties;
import realestate.RealStateProject.properties.PropertiesJpaRepository;

@Service
public class PropertiesService {
	@Autowired
	PropertiesJpaRepository repository;

	public List<Properties> getAllProperties() {
		// TODO Auto-generated method stub
		 return repository.findAll();
	}

	public Properties postProperty(Properties prop) {
		// TODO Auto-generated method stub
		return repository.save(prop);
	}

	public List<Properties> getDataByUserId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findByUserId(id);
	}

	public Properties updateProperty(Properties property) {
		// TODO Auto-generated method stub
		return repository.save(property);
	}

	public void deleteProperties(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	public Properties getDataById(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}
	
}
