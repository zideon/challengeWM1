package com.workingminds.util;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumbersFinder {

    public static int[] find(int min, int max, int[] arr){
        Set<Integer> collect = Arrays.stream(arr).filter(s -> s >= min && s <= max).sorted().boxed().collect(Collectors.toSet());
        return IntStream.rangeClosed(min, max).filter(s -> !collect.contains(s) ).toArray();
    }

}
