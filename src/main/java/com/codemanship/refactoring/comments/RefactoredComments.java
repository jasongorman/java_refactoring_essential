package com.codemanship.refactoring.comments;

public class RefactoredComments {

    static int sumOfSquares(int lowerBound, int upperBound) {
        int sum = 0;

        for (int i = lowerBound; i <= upperBound; i++) {
            sum += i*i;
        }
        return sum;
    }
}
