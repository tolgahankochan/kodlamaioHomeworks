package kodlamaioProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaioProject.entities.concretes.SubTechnology;

@Repository
public interface SubTechnologyRepository extends JpaRepository<SubTechnology, Integer>  {

	SubTechnology getByName(String name);
}
