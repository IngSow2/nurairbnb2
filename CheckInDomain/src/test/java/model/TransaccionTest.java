package model;

import com.nur.model.TransaccionPago;
import core.BusinessRuleValidationException;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class TransaccionTest {
    @Test
     void testConstructor() throws BusinessRuleValidationException {
        TransaccionPago transaccionPago = new TransaccionPago("John", "Doe", "123456789");

        assertEquals("John", transaccionPago.getName());
        assertEquals("Doe", transaccionPago.getLastname());
        assertEquals("123456789", transaccionPago.getCi());
    }

    @Test
     void testConstructorWithId() throws BusinessRuleValidationException {
        TransaccionPago transaccionPago = new TransaccionPago(
                UUID.randomUUID(), "Jane", "Smith", new Date(), "987654321", true
        );

        assertEquals("Jane", transaccionPago.getName());
        assertEquals("Smith", transaccionPago.getLastname());
        assertEquals("987654321", transaccionPago.getCi());
    }

}
