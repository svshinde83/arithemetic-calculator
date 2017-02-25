package com.finxl.nab.user.utils;

import com.finxl.nab.user.dto.UserInputDto;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

/**
 * Created by svshinde83 on 25/02/2017.
 */
public class ExtractUserInputUtils {

    //private final static String VALID_VALUES_USER_INPUT_REGEX = "^[0-9]+[.]?[0-9]* ?[\\|*|+|-] ?[0-9]+[.]?[0-9]*$";
    private UserInputDto dto;


    public static String extractUserInput() {

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine().trim();

        return userInput;
    }

    public static void main(String[] args) {
        getStringsDelimited("22-6");
    }


    public static List<String> getStringsDelimited(String args) {
        //String[] values = args.trim().split("[(?<=+|*|-|/)]");


        //String[] split = args.split(Pattern.quote("*"));
       /* String[] values = args.trim().split("(?=-)");
        String[] splitValues = new String[values.length];



        for (int i = 0; i < values.length; i++) {
            splitValues[i] = values[i].trim();
        }
        return splitValues;
    }*/
//        Pattern p = Pattern.compile(VALID_VALUES_USER_INPUT_REGEX);
//
//        Matcher m = p.matcher(args);
//
//        String group = m.group();


//        String s1 = args.substring(0,args.indexOf("/*"));


        List<String> values = null;

        boolean containsSubstraction = args.contains("-");
        if (containsSubstraction) {
            values = Arrays.asList(args.split("-"));
            values.add("/");
        }

        boolean containsDivision = args.contains("/");
        if (containsDivision) {
            values = Arrays.asList(args.split("/"));
            values.add("-");
        }

        boolean containsMultiplication = args.contains("*");
        if (containsMultiplication) {
            values = Arrays.asList(args.split("/*"));
            values.add("/*");
        }

        boolean containsAddition = args.contains("+");
        if (containsAddition) {
            values = Arrays.asList(args.split("/+"));
            values.add("+");
        }


        return values;
    }
}
