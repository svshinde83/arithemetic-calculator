package com.finxl.nab.user.dto;

import java.util.List;

/**
 * Created by svshinde83 on 25/02/2017.
 */
public class UserInputDto {

    private List<String> userInput;
    private String firstValue;
    private String operation;
    private String secondValue;

    public UserInputDto(List<String> userInput) {
        this.userInput = userInput;
    }

    public String getFirstValue() {
        return firstValue;
    }

    public String getOperation() {
        return operation;
    }

    public String getSecondValue() {
        return secondValue;
    }

    public UserInputDto fillDto() {

        firstValue = userInput.get(0);
        operation = userInput.get(2);
        secondValue = userInput.get(1);
        return this;
    }
}
