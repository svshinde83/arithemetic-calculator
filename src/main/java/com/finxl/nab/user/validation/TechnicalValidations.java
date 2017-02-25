package com.finxl.nab.user.validation;

import java.util.regex.Pattern;
import org.springframework.stereotype.Component;

/**
 * Created by svshinde83 on 24/02/2017.
 */
@Component
public class TechnicalValidations {

//    private final static String VALID_VALUES_USER_INPUT_REGEX = "^([0-9]|[[0-9].[0-9]])\\s?(\\/|\\*|\\+|-)\\s?([0-9]|[[0-9].[0-9]])$";

//^[0-9]+[.]?[0-9]* ?[\\|*|+|-] ?[0-9]+[.]?[0-9]*$
    //^[0-9]+[.]?[0-9]* ?[\|*|+|-] ?[0-9]+[.]?[0-9]*$
    //^[0-9]+[.]?[0-9]* ?[\/*+-] ?[0-9]+[.]?[0-9]*$
    private final static String VALID_VALUES_USER_INPUT_REGEX = "^[0-9]+[.]?[0-9]* ?[\\/*+-] ?[0-9]+[.]?[0-9]*$";

    boolean canOperateMathematically(String userInput) {
        return Pattern.matches(VALID_VALUES_USER_INPUT_REGEX, userInput);
    }

}
