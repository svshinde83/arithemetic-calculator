package com.finxl.nab.user;

import com.finxl.nab.user.dto.CalculationsResultDto;
import com.finxl.nab.user.service.arithmetic.operations.MathematicalOperationsService;
import com.finxl.nab.user.service.arithmetic.operations.MathematicalOperationsServiceImpl;
import com.finxl.nab.user.service.common.OperationsService;
import com.finxl.nab.user.service.interactions.UserInteractionService;
import com.finxl.nab.user.service.interactions.UserInteractionServiceImpl;
import com.finxl.nab.user.utils.ExtractUserInputUtils;
import com.finxl.nab.user.validation.Validations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by svshinde83 on 24/02/2017.
 */
public class Calculator {


    @Autowired
    private static Validations validations;

    @Autowired
    private static CalculationsResultDto result;

    @Autowired
    private static MathematicalOperationsService service;

    @Autowired
    private static UserInteractionService userInteractionService;


    /*Calculator() {
        this.validations = new Validations();
        this.result = new CalculationsResult();
    }*/


    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"application-context.xml"});

        Calculator getYourCalculation = (Calculator) context.getBean("getCalculations");
        getYourCalculation.getYourCalculations();
        getYourCalculations();
    }


    private static Object getYourCalculations() {
        while (true) {
            new UserInteractionServiceImpl().promptUser();

            String userInput = ExtractUserInputUtils.extractUserInput();

            if ("q".equals(userInput)) {
                new UserInteractionServiceImpl().handleUserExit();
            }


            validations = new Validations();
            result = new CalculationsResultDto();
            if (!validations.validate(userInput, result)) {
                System.out.println(result.getErrorDescription());
                System.out.println(result.getErrorDescription());
            }

            Float answer = (Float) OperationsService.getResult(userInput);
            new UserInteractionServiceImpl().printAnswer(answer);
            return null;
        }
    }


}
