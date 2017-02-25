package com.finxl.nab.user.service.arithmetic.operations;


import com.finxl.nab.user.dto.UserInputDto;
import com.finxl.nab.user.service.arithmetic.operations.add.AddOperationOperationService;
import com.finxl.nab.user.service.arithmetic.operations.add.AddOperationOperationServiceImpl;
import com.finxl.nab.user.service.arithmetic.operations.divide.DivisionOperationService;
import com.finxl.nab.user.service.arithmetic.operations.divide.DivisionOperationServiceImpl;
import com.finxl.nab.user.service.arithmetic.operations.multiply.MultiplicationOperationService;
import com.finxl.nab.user.service.arithmetic.operations.multiply.MultiplicationOperationServiceImpl;
import com.finxl.nab.user.service.arithmetic.operations.substract.SubstractionOperationService;
import com.finxl.nab.user.service.arithmetic.operations.substract.SubstractionOperationServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by svshinde83 on 24/02/2017.
 */
@Service
public class MathematicalOperationsServiceImpl implements MathematicalOperationsService {


    public MathematicalOperationsServiceImpl() {
    }

    @Autowired
    private AddOperationOperationService addOperationService;

    @Autowired
    private SubstractionOperationService substractionService;

    @Autowired
    private DivisionOperationService divisionService;

    @Autowired
    private MultiplicationOperationService multiplicationService;


    public Float add(Float a, Float b) {
        return AddOperationOperationServiceImpl.add1(a, b);
    }

    public Float divide(Float a, Float b) {
        return DivisionOperationServiceImpl.divide1(a, b);
    }

    public Float multiply(Float a, Float b) {
        return new MultiplicationOperationServiceImpl().multiply(a, b);
    }

    public Float subtract(Float a, Float b) {
        return SubstractionOperationServiceImpl.subtract1(a, b);
    }

    public Object getResult(List<String> userInput) {

        UserInputDto inputDto = new UserInputDto().fillDto(userInput);
        String operation = inputDto.getOperation();
        String firstValue = inputDto.getFirstValue();
        String secondValue = inputDto.getSecondValue();

        Float result = null;
        if (operation.equals("*")) {

            result = multiply(Float.parseFloat(firstValue), Float.parseFloat(secondValue));

        } else if (operation.equals("+")) {

            result = add(Float.parseFloat(firstValue), Float.parseFloat(secondValue));

        } else if (operation.equals("-")) {

            result = subtract(Float.parseFloat(firstValue), Float.parseFloat(secondValue));

        } else if (operation.equals("/")) {

            result = divide(Float.parseFloat(firstValue), Float.parseFloat(secondValue));
        }

        return result;

    }


}
