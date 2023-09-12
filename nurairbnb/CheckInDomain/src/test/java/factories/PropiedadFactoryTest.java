package factories;

import core.BusinessRuleValidationException;
import factories.check.in.CreateCheckIn;
import factories.propiedad.PropiedadFactory;
import model.CheckIn;
import model.Persona;
import model.Propiedad;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class PropiedadFactoryTest {
   private PropiedadFactory checkInFactory;

   @BeforeEach
   void setUp() {
      checkInFactory = new PropiedadFactory();
   }

   @Test
   void testCreateCheckIn() throws BusinessRuleValidationException {

      UUID id = UUID.randomUUID();
      String nombre = "Sample Property";
      String estado = "Available";
      double precio = 1000.0;

      Propiedad propiedad = checkInFactory.create(id, nombre, estado, precio);

      Assertions.assertNotNull(propiedad);
      Assertions.assertEquals(id, propiedad.getId());
      Assertions.assertEquals(nombre, propiedad.getNombre());
   }


}
