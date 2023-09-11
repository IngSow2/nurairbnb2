package utils;

import core.BusinessRuleValidationException;
import dtos.MetodoPagoDto;
import model.MetodoPago;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MetodoPagoMapperTest {

    @Test
    public void testFromMetodoPagoNotNull() throws BusinessRuleValidationException {
        MetodoPago baggage = createSampleMetodoPago();

        MetodoPagoDto baggageDto = MetodoPagoMapper.from(baggage);
        assertNotNull(baggageDto);
    }

    @Test
    public void testFromMetodoPagoNull() {
        MetodoPago mtodo = null ;
        MetodoPagoDto baggageDto = MetodoPagoMapper.from(mtodo);
        assertNotNull(baggageDto);
    }

    @Test
    public void testFromMetodoPagoDto() throws BusinessRuleValidationException {
        MetodoPagoDto baggageDto = createSampleMetodoPagoDto();
        MetodoPago baggage = MetodoPagoMapper.from(baggageDto);

        assertNotNull(baggage);
    }

    private MetodoPago createSampleMetodoPago() throws BusinessRuleValidationException {
        MetodoPago baggage = new MetodoPago("tarjeta", "T");
        return baggage;
    }

    private MetodoPagoDto createSampleMetodoPagoDto() {
        MetodoPagoDto baggageDto = new MetodoPagoDto("Tarjeta", "T");
        return baggageDto;
    }


}
