package vlac.sauce.first_assignment.repositories;

import org.springframework.data.repository.CrudRepository;
import vlac.sauce.first_assignment.models.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
    
}
