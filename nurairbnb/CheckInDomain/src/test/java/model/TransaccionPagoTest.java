package model;

import core.BusinessRuleValidationException;
import core.Entity;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import value.objects.CIValue;
import value.objects.PersonNameValue;

import java.util.Date;
import java.util.UUID;

public class TransaccionPagoTest {


    private UUID code;
    private String descripcion;
    private Double monto;

    @BeforeEach
    public void setUp() {
        code = UUID.randomUUID();
        descripcion = "Sample Transaction";
        monto = 1000.0;
    }

    @Test
    public void testTransaccionConstructorAndGetters() {
        // Arrange
        Transaccion transaccion = new Transaccion(code, descripcion, monto);

        // Act
        UUID retrievedCode = transaccion.getCode();
        String retrievedDescripcion = transaccion.getDescripcion();
        Double retrievedMonto = transaccion.getMonto();

        // Assert
        Assertions.assertEquals(code, retrievedCode);
        Assertions.assertEquals(descripcion, retrievedDescripcion);
        Assertions.assertEquals(monto, retrievedMonto, 0.01); // Allow for small floating-point differences
    }

}
