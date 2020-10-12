package vlac.sauce.first_assignment.repositories;

import org.springframework.data.repository.CrudRepository;
import vlac.sauce.first_assignment.models.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
    
}
