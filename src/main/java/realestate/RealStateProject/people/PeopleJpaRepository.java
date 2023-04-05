package realestate.RealStateProject.people;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleJpaRepository extends JpaRepository<People,Integer> {

}
