package realestate.RealStateProject.propertieslikes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyLikesRepo extends JpaRepository<PropertyLikes ,Integer> {

}
