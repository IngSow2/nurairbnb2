package infraestructure.repositories.persona;

import infraestructure.model.PersonaJpaModel;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

public interface PersonaCrudRepository extends CrudRepository<PersonaJpaModel, UUID> {}
