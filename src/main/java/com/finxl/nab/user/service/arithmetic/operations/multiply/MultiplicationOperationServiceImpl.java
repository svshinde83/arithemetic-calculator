package com.finxl.nab.user.service.arithmetic.operations.multiply;

import org.springframework.stereotype.Service;

/**
 * Created by svshinde83 on 24/02/2017.
 */
@Service
public class MultiplicationOperationServiceImpl implements MultiplicationOperationService {
    public Float multiply(Float a, Float b) {
        return a * b;
    }

    public static Float multiply1(Float a, Float b) {
        return a * b;
    }
}
