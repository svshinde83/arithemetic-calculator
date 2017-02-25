package com.finxl.nab.user.service.arithmetic.operations.divide;

import org.springframework.stereotype.Service;

/**
 * Created by svshinde83 on 24/02/2017.
 */
@Service
public class DivisionOperationServiceImpl implements DivisionOperationService {


    public Float divide(Float a, Float b) {
        return a / b;
    }

    public static Float divide1(Float a, Float b) {
        return a / b;
    }
}
