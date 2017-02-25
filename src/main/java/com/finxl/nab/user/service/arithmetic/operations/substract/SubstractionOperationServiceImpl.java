package com.finxl.nab.user.service.arithmetic.operations.substract;

import org.springframework.stereotype.Service;

/**
 * Created by svshinde83 on 24/02/2017.
 */
@Service
public class SubstractionOperationServiceImpl implements SubstractionOperationService {


    public Float subtract(Float a, Float b) {
        return a - b;
    }

    public static Float subtract1(Float a, Float b) {
        return a - b;
    }
}
