package vlac.sauce.first_assignment.repositories;

import org.springframework.data.repository.CrudRepository;
import vlac.sauce.first_assignment.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
    
}
