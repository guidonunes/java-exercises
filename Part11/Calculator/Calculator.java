package Part11.Calculator;

package validating;

public class Calculator {

    public int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("The parameter must be a non-negative number.");
        }

        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }
        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {
        if(setSize < 0 || subsetSize < 0) {
            throw new IllegalArgumentException("Both paramenters must be greater than 0");
        }

        if(subsetSize > setSize) {
            throw new IllegalArgumentException("Subset size must not exceed set size");
        }


        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
