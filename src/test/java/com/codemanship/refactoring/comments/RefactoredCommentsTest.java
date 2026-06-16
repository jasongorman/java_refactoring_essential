package com.codemanship.refactoring.comments;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RefactoredCommentsTest {

    @Test
    void t1() {
        int a = 7;
        int b = 12;

        // Expected: sum of squares from 7 to 12
        int expected = 0;
        for (int i = a; i <= b; i++) {
            expected += i * i;
        }

        int actual = RefactoredComments.sumOfSquares(a, b);

        assertEquals(expected, actual);
    }
}