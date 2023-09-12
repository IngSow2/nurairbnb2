package factories;

import core.BusinessRuleValidationException;
import factories.check.in.CreateCheckIn;
import factories.persona.CreatePersona;
import model.CheckIn;
import model.Persona;
import model.Propiedad;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class CreatePersonaTest {
   private CreatePersona personaFactory;

   @BeforeEach
   public void setUp() {
      personaFactory = new CreatePersona();
   }

   @Test
   public void testCreatePersona() throws BusinessRuleValidationException {
      String name = "John";
      String lastName = "Doe";
      String ci = "1234567890";

      Persona persona = personaFactory.create(name, lastName, ci);

      Assertions.assertNotNull(persona);
      Assertions.assertEquals(name, persona.getName());
      Assertions.assertEquals(lastName, persona.getLastname());
      Assertions.assertEquals(ci, persona.getCi());
   }

}
