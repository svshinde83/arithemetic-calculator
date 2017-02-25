package com.finxl.nab.user.service.arithmetic.operations;

import com.finxl.nab.user.service.common.OperationsService;
import org.springframework.stereotype.Service;

/**
 * Created by svshinde83 on 24/02/2017.
 */
@Service
public interface MathematicalOperationsService extends OperationsService {

    Float add(Float a , Float b);
    Float divide(Float a , Float b);
    Float multiply(Float a , Float b);
    Float subtract(Float a , Float b);


}
