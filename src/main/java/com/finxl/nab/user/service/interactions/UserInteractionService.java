package com.finxl.nab.user.service.interactions;

/**
 * Created by svshinde83 on 25/02/2017.
 */
public interface UserInteractionService {

    void promptUser();

    void handleUserExit();

    void printAnswer(Float result);
}
