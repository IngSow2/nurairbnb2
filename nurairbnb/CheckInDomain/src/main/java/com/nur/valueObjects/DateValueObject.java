package com.nur.valueObjects;



import core.BusinessRuleValidationException;
import core.ValueObject;
import rules.ValidDate;

import java.util.Date;

public class DateValueObject extends ValueObject {
    public DateValueObject(Date dateIn, Date dateOut) throws BusinessRuleValidationException {
        checkRule(new ValidDate(dateIn, dateOut));
    }
}
