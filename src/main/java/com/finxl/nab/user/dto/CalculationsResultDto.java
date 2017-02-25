package com.finxl.nab.user.dto;

import org.springframework.stereotype.Component;

/**
 * Created by svshinde83 on 25/02/2017.
 */
@Component
public class CalculationsResultDto {
    private Float result;
    private boolean hasErrors;
    private String errorDescription;


    public Float getResult() {
        return result;
    }

    public void setResult(Float result) {
        this.result = result;
    }

    public boolean isHasErrors() {
        return hasErrors;
    }

    public void setHasErrors(boolean hasErrors) {
        this.hasErrors = hasErrors;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }
}
