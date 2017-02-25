package com.finxl.nab.user.service.interactions;

import org.springframework.stereotype.Service;

/**
 * Created by svshinde83 on 25/02/2017.
 */
@Service
public class UserInteractionServiceImpl implements UserInteractionService {
    public void promptUser() {
        System.out.println("Hello User.. Please provide an input to get calculations in one of the following formats.." +
                "1. Multiply 2 numbers 25 and 69 type -  25*69  \n" +
                "2. Add 2 numbers 25.2 and 69 type -  25.2+69  \n" +
                "3. Divide 2 numbers 19 and 4 type -  19/4  \n" +
                "4. Substract 2 numbers 66 and 55 type -  66-55  \n" +
                "To quit please type q and enter.");
    }

    public void handleUserExit() {
        System.out.println("You have chose to exit.\n" +
                "System quitting now.");
        System.exit(1);
    }

    public void printAnswer(Float result) {
        System.out.println("Answer: "+ result);
    }


}
