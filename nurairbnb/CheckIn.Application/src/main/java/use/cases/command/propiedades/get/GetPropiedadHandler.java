package use.cases.command.propiedades.get;

import an.awesome.pipelinr.Command;
import core.BusinessRuleValidationException;
import dtos.PropiedadDto;
import com.nur.model.Propiedad;
import org.springframework.stereotype.Component;
import com.nur.repositories.PropiedadRepository;
import utils.PropiedadMapper;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class GetPropiedadHandler
  implements Command.Handler<GetPropiedadQuery, List<PropiedadDto>> {

  private final PropiedadRepository propiedadRepository;

  public GetPropiedadHandler(PropiedadRepository propiedadRepository) {
    this.propiedadRepository = propiedadRepository;
  }

  @Override
  public List<PropiedadDto> handle(GetPropiedadQuery command) {
    try {
      List<Propiedad> propiedades = propiedadRepository.findPropiedadById(
              UUID.fromString(command.id)
      );
      return propiedades.stream().map(PropiedadMapper::from).collect(Collectors.toList());
    } catch (BusinessRuleValidationException e) {
      e.printStackTrace();
      return null;
    }
  }
}
