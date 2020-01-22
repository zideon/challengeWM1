package com.workingminds;

import com.workingminds.util.MissingNumbersFinder;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int min = 1, max = 10, limit=10;

        if(args.length ==2){
            min = Integer.parseInt(args[0]);
            max = Integer.parseInt(args[1]);
            limit = Integer.parseInt(args[2]);
        }
        int[] arr = new Random().ints(limit, min, max).toArray();

        System.out.println(Arrays.toString(MissingNumbersFinder.find(min,max,arr)));

    }
}
