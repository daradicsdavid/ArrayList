package elte.exercises;

import java.util.List;

public abstract class AbstractExercise<INPUT, RESULT> {

    private final List<INPUT> initial;
    private final RESULT expected;

    public AbstractExercise(List<INPUT> initial, RESULT expected) {
        this.initial = initial;
        this.expected = expected;
    }

    public void run() {
        RESULT result = calculateSolution(initial);
        if (!expected.equals(result)) {
            System.out.println("The result did not match the expected result.");
            System.out.println("Result:" + result);
            System.out.println("Expected result:" + expected);

            throw new BadResultException();
        }
        System.out.println("Exercise passed.");
    }

    protected abstract RESULT calculateSolution(List<INPUT> initial);

}
