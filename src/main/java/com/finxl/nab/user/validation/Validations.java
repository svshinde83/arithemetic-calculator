package com.finxl.nab.user.validation;

import com.finxl.nab.user.dto.CalculationsResultDto;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by svshinde83 on 24/02/2017.
 */
public class Validations {

    @Autowired
    private TechnicalValidations technicalValidations = new TechnicalValidations();


    public boolean validate(String userInput, CalculationsResultDto calculationsResultDto) {

        if (!technicalValidations.canOperateMathematically(userInput)) {
            calculationsResultDto = new CalculationsResultDto();
            calculationsResultDto.setHasErrors(true);
            calculationsResultDto.setErrorDescription("technical error");
            return false;
        }

        calculationsResultDto.setHasErrors(false);
        return true;
    }
}
