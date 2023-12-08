package use.cases.command;

import core.BusinessRuleValidationException;
import dtos.CheckInDto;
import com.nur.model.CheckIn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.nur.repositories.CheckInRepository;
import use.cases.command.checkin.get.checkin.GetCheckInHandler;
import use.cases.command.checkin.get.checkin.GetCheckInQuery;

import java.util.UUID;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GetCheckInHandlerTest {
    private GetCheckInHandler getCheckInHandler;
    private CheckInRepository checkInRepository;

    @BeforeEach
    public void setUp() {
        checkInRepository = mock(CheckInRepository.class);
        getCheckInHandler = new GetCheckInHandler(checkInRepository);
    }

    @Test
    public void testHandle() throws BusinessRuleValidationException {
        // Arrange
        GetCheckInQuery query = new GetCheckInQuery(UUID.randomUUID().toString(), UUID.randomUUID().toString());
        CheckIn expectedCheckIn = new CheckIn(UUID.randomUUID(), null, null); // Replace with expected data

        when(checkInRepository.findByPersonAndId(any(UUID.class), any(UUID.class))).thenReturn(expectedCheckIn);

        CheckInDto checkInDto = getCheckInHandler.handle(query);

        Assertions.assertNotNull(checkInDto);
    }
}
