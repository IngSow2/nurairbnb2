import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Pipeline;
import controllers.PersonaController;
import controllers.PropiedadController;
import dtos.PersonaDto;
import dtos.PropiedadDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.when;

public class PersonaControllerTest {

    @Mock
    Pipeline pipeline;


    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }



    @Test
    void testListPersonas() {
        List<PersonaDto> personaDtos = new ArrayList<>();
        personaDtos.add(new PersonaDto());
        when(pipeline.send((Command<Object>) anyObject())).thenReturn(personaDtos);

        PersonaController controller = new PersonaController(pipeline);
        List<PersonaDto> response = controller.getPassengers();
        assertNotNull(response);
    }
}