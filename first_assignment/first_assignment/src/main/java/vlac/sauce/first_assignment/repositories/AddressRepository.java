package vlac.sauce.first_assignment.repositories;

import org.springframework.data.repository.CrudRepository;
import vlac.sauce.first_assignment.models.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {
    
}
