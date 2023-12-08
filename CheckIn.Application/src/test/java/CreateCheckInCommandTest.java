import dtos.CheckInDto;
import org.junit.jupiter.api.Test;
import use.cases.command.checkin.create.checkin.CreateCheckInCommand;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreateCheckInCommandTest {
    @Test
    public void testConstructor_ShouldSetCheckInDto() {
        // Arrange
        CheckInDto expectedCheckInDto = new CheckInDto(/* initialize with test data */);

        // Act
        CreateCheckInCommand createCheckInCommand = new CreateCheckInCommand(expectedCheckInDto);
        CheckInDto actualCheckInDto = createCheckInCommand.checkInDto;

        // Assert
        assertEquals(expectedCheckInDto, actualCheckInDto);
    }
}
