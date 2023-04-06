package realestate.RealStateProject.properties;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PropertiesJpaRepository extends JpaRepository<Properties,Integer> {


	List<Properties> findByUserId(Integer id);
	
}
