package com.finxl.nab.user.service.common;

import com.finxl.nab.user.service.arithmetic.operations.MathematicalOperationsService;
import com.finxl.nab.user.service.arithmetic.operations.MathematicalOperationsServiceImpl;
import com.finxl.nab.user.utils.ExtractUserInputUtils;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by svshinde83 on 25/02/2017.
 */
public interface OperationsService {


    static Object getResult(String userInput) {

        List<String> stringsDelimited = ExtractUserInputUtils.getStringsDelimited(userInput);
        String operation = stringsDelimited.get(2);
        if (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")) {
            return new MathematicalOperationsServiceImpl().getResult(stringsDelimited);
        }

        return null;
    }
}
