package use.cases.command.tipropiedades.create;

import dtos.TipoPropiedadDto;
import model.TipoPropiedad;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repositories.TipoPropiedadRepository;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CreateTipoHandlerTest {

    private TipoPropiedadRepository tipoPropiedadRepository;
    private CreateTipoHandler createTipoHandler;

    @BeforeEach
    public void setUp() {
        tipoPropiedadRepository = mock(TipoPropiedadRepository.class);
        createTipoHandler = new CreateTipoHandler(tipoPropiedadRepository);
    }

    @Test
    public void testHandle() {
        CreateTipoCommand command = new CreateTipoCommand( new TipoPropiedadDto(UUID.randomUUID(), "casa"));
        when(tipoPropiedadRepository.update(any(TipoPropiedad.class))).thenReturn(UUID.randomUUID());
        TipoPropiedadDto result = createTipoHandler.handle(command);
        assertNotNull(result);
    }
}
