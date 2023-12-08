package com.danny.checkinapi.controllers;

import an.awesome.pipelinr.Pipeline;
import dtos.PersonaDto;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import use.cases.command.persona.get.persona.GetPersonaQuery;

@CrossOrigin(origins = "*")
@RestController
public class PersonaController {

  //  Logger logger = LoggerFactory.getLogger(PersonaController.class);
  final Pipeline pipeline;

  public PersonaController(Pipeline pipeline) {
    this.pipeline = pipeline;
  }

  @GetMapping("/persona")
  public List<PersonaDto> getPassengers() {
    GetPersonaQuery query = new GetPersonaQuery();
    return query.execute(pipeline);
  }
}
