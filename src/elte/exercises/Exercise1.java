package elte.exercises;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;


/*
 * Return the sum of the list
 * */
public class Exercise1 extends AbstractExercise<Integer, Integer> {

    public Exercise1() {
        super(Arrays.asList(1, 2, 3, 4), 10);
    }

    @Override
    protected Integer calculateSolution(List<Integer> initial) {
        Integer result = 0;
        for (Integer number : initial) {
            result += number;
        }
        return result+1;
    }
}
