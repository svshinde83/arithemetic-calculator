package com.finxl.nab.user.service.arithmetic.operations.add;

import org.springframework.stereotype.Service;

/**
 * Created by svshinde83 on 24/02/2017.
 */
@Service
public class AddOperationOperationServiceImpl implements AddOperationOperationService {

    public Float add(Float a, Float b) {
        return a + b;
    }

    public static Float add1(Float a, Float b) {
        return a + b;
    }
}
