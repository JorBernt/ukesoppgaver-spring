package com.example.demo;

import java.util.*;
import java.util.Locale;

public abstract class Temperatur {
    private static final Integer[] tempArray = new Integer[]{-3,-2,2,7,12,16,18,17,12,7,3,-2};

    public static String getTemp(String maned) {
        int n = 0;
        maned = maned.toLowerCase();
        List<String> maneder = new ArrayList<>();

        maneder.add("januar");
        maneder.add("februar");
        maneder.add("mars");
        maneder.add("april");
        maneder.add("mai");
        maneder.add("juni");
        maneder.add("juli");
        maneder.add("august");
        maneder.add("september");
        maneder.add("oktober");
        maneder.add("november");
        maneder.add("desember");

        Map<Integer, String> scoreMap = new HashMap<>();
        int max = 0;
        for(String s : maneder) {
            int score = 0;
            int index = 0;
            for(char c : maned.toCharArray()) {
                if(s.contains(""+c)) score++;
                if(index < s.length())
                if(s.charAt(index) == c) score++;
            }
            scoreMap.put(score, s);
            max = Math.max(max, score);
        }
        maned = scoreMap.get(max);
        if(max==0) maned = "error";
        switch (maned) {
            case "januar":n=0;break;
            case "februar":n=1;break;
            case "mars":n=2;break;
            case "april":n=3;break;
            case "mai":n=4;break;
            case "juni":n=5;break;
            case "juli":n=6;break;
            case "august":n=7;break;
            case "september":n=8;break;
            case "oktober":n=9;break;
            case "november":n=10;break;
            case "desember":n=11;break;
        }
        return maned.equals("error")?"Du må skrive inn en gyldig måned":"I " + maned + " var det " + tempArray[n] + " grader.";
    }
}
