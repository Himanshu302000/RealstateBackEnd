package realestate.RealStateProject.propertieslikes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("http://localhost:4200/")
@RestController
public class PropertyLikesController {
	@Autowired
	PropertyLikesRepo repo;
	
	@GetMapping("/checkUser/{userID}/{itemId}")
	public Integer checkUser(@PathVariable Integer userID,@PathVariable Integer itemId)
	{
		List<PropertyLikes> res=repo.findAll();
		for(PropertyLikes item:res)
		{
			if(userID.equals(item.getUserId()) && itemId.equals(item.getPropertyId()))
			{
				return item.getId();
			}
		}
		return -1;
	}
	
	@PostMapping("/createLikeUser")
	public PropertyLikes createUser(@RequestBody PropertyLikes p)
	{
		return repo.save(p);
	}
	
	@DeleteMapping("/deleteuserLikeById/{id}")
	public void deletepropbyid(@PathVariable Integer id)
	{
		repo.deleteById(id);
	}
	
}
