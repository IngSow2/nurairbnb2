package model;

import core.BusinessRuleValidationException;
import core.Entity;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


 class MetodoPagoTest {
    @Test
     void testConstructorWithValidTipo() throws BusinessRuleValidationException {
        MetodoPago metodoPago = new MetodoPago("Detalle", "T");

        assertEquals("Detalle", metodoPago.getDetalle());
        assertEquals(MetodoTipo.TARJETA, metodoPago.getType());
    }



    @Test
     void testGetDetalle() throws BusinessRuleValidationException {
        MetodoPago metodoPago = new MetodoPago("Detalle", "T");

        assertEquals("Detalle", metodoPago.getDetalle());
    }

    @Test
     void testGetType() throws BusinessRuleValidationException {
        MetodoPago metodoPago = new MetodoPago("Detalle", "T");

        assertEquals(MetodoTipo.TARJETA, metodoPago.getType());
    }
}
