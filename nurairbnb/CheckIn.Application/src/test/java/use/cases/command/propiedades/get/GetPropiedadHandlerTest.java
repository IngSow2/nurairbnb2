package use.cases.command.propiedades.get;

import an.awesome.pipelinr.Command;
import core.BusinessRuleValidationException;
import dtos.PropiedadDto;
import model.Propiedad;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Component;
import repositories.PropiedadRepository;
import utils.PropiedadMapper;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GetPropiedadHandlerTest {

  private PropiedadRepository propiedadRepository;
  private GetPropiedadHandler getPropiedadHandler;

  @BeforeEach
  public void setUp() {
    propiedadRepository = mock(PropiedadRepository.class);
    getPropiedadHandler = new GetPropiedadHandler(propiedadRepository);
  }

  @Test
  public void testHandle() throws BusinessRuleValidationException {
    UUID mockId = UUID.randomUUID();
    List<Propiedad> mockPropiedades = Arrays.asList(
            new Propiedad(UUID.randomUUID(), "Casa", "HABILITADA", 100.0)

    );
    GetPropiedadQuery query = new GetPropiedadQuery(mockId.toString());
    when(propiedadRepository.findPropiedadById(mockId)).thenReturn(mockPropiedades);

    List<PropiedadDto> result = getPropiedadHandler.handle(query);

    assertNotNull(result);
    assertEquals(mockPropiedades.size(), result.size());
  }
}



