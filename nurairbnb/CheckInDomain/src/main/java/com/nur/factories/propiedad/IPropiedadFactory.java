package com.nur.factories.propiedad;


import com.nur.model.Propiedad;
import core.BusinessRuleValidationException;

import java.util.UUID;

public interface IPropiedadFactory {
    Propiedad create(String id,String nombre, String estado, double precio) throws BusinessRuleValidationException;
}
