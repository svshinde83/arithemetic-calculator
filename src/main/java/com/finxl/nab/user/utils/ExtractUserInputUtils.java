package com.finxl.nab.user.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by svshinde83 on 25/02/2017.
 */
public class ExtractUserInputUtils {

    //private final static String VALID_VALUES_USER_INPUT_REGEX = "^[0-9]+[.]?[0-9]* ?[\\|*|+|-] ?[0-9]+[.]?[0-9]*$";

    public static String extractUserInput() {

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine().trim();

        return userInput;
    }

    public static void main(String[] args) {
        getStringsDelimited("22*6");
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


        List<String> valuesAsList = new ArrayList<>(3);

        boolean containsSubstraction = args.contains("-");
        if (containsSubstraction) {
            String[] values1 = args.split("-");

            extractToList(valuesAsList, values1);
            valuesAsList = Arrays.asList(args.split("-"));
            valuesAsList.add("-");
        }

        boolean containsDivision = args.contains("/");
        if (containsDivision) {
            String[] valuesArray = args.split("/");

            extractToList(valuesAsList, valuesArray);
            valuesAsList.add("/");
        }

        boolean containsMultiplication = args.contains("*");
        if (containsMultiplication) {
            String[] valuesArray = args.split("\\*");
            extractToList(valuesAsList, valuesArray);
            valuesAsList.add("*");
        }

        boolean containsAddition = args.contains("+");
        if (containsAddition) {
            String[] valuesArray = args.split("/+");
            extractToList(valuesAsList, valuesArray);
            valuesAsList.add("+");
        }


        return valuesAsList;
    }

    private static void extractToList(List<String> valuesAsList, String[] valuesArray) {
        for (String aValues1 : valuesArray) {
            valuesAsList.add(aValues1);
        }
    }
}
