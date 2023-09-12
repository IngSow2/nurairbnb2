package event;

import core.BusinessRuleValidationException;
import model.CheckIn;
import model.Persona;
import model.Propiedad;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CheckInCompletedTest{

  @Test
   void testGetCheckIn() throws BusinessRuleValidationException {
    CheckIn checkIn = new CheckIn(UUID.randomUUID(), new ArrayList<Propiedad>(), new Persona("juan","perez", "123"));

    CheckInCompleted completed = new CheckInCompleted(checkIn);

    assertEquals(checkIn, completed.getCheckIn());
  }

  @Test
  public void testDateInheritance() throws BusinessRuleValidationException {
    CheckIn checkIn = new CheckIn(UUID.randomUUID(), new ArrayList<Propiedad>(), new Persona("juan","perez", "123"));

    CheckInCompleted completed = new CheckInCompleted(checkIn);
    assertNotNull(completed);
  }
}
