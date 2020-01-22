package com.workingminds.util;

import com.workingminds.util.MissingNumbersFinder;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class MissingNumbersFinderTest {

    @Test
    public void findInArrayWithNumbersBetweenMinMax() {

        int[] array = { 4, 9, 2, 5, 4, 2, 3, 4 };
        int [] result = { 1, 6, 7, 8, 10 };
        int min = 1;
        int max = 10;

        int[] missingNumbers = MissingNumbersFinder.find(min, max, array);
        assertArrayEquals( result,missingNumbers );
    }
    @Test //Expected All numbers between min and max
    public void findInArrayWithNumbersOutOfRange() {

        int[] array = { -1, 0 , 7, 10 };
        int [] result = { 1,2,3,4,5 };
        int min = 1;
        int max = 5;

        int[] missingNumbers = MissingNumbersFinder.find(min, max, array);
        assertArrayEquals( result,missingNumbers );
    }

    @Test// Expected All numbers between min and max
    public void findInEmptyArray() {

        int[] array = { };
        int [] result = { 1,2,3,4,5 };
        int min = 1;
        int max = 5;

        int[] missingNumbers = MissingNumbersFinder.find(min, max, array);
        assertArrayEquals( result,missingNumbers );
    }
    @Test
    public void findInArrayWithNegativeMin() {

        int[] array = { -1, -3, 0 , 4 };
        int [] result = {-5,-4,-2,1,2,3,5 };
        int min = -5;
        int max = 5;

        int[] missingNumbers = MissingNumbersFinder.find(min, max, array);
        assertArrayEquals( result,missingNumbers );
    }

}
