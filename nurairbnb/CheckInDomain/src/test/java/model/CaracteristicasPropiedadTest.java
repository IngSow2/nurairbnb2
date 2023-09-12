package model;


import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CaracteristicasPropiedadTest {
    @Test
     void testGetId() {
        UUID id = UUID.randomUUID();
        CaracteristicasPropiedad caracteristicas = new CaracteristicasPropiedad(id, true, false, true, false, true, false, true, false);

        UUID result = caracteristicas.getId();
        assertEquals(id, result);
    }
}
