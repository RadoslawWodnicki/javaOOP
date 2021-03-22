package pl.edu.utp.meancalculation;

public class ArithmeticMeanAlgorithm implements MeanAlgorithm {

	// fields - pola, wewnetrzny stan naszego algorytmu. nikt nie powinien ich edytowac
    private double currentSum;
    private double noOfFactors;

    // constructor
    public ArithmeticMeanAlgorithm() {
        currentSum = 0;
        noOfFactors = 0;
    }

    // methods
    public void add(double a) {
        currentSum += a; // currentSum = currentSum + a;
        noOfFactors++; // noOfFactors = noOfFactors + 1;
    }

    @Override
    public double calculateMean() {
        return currentSum / noOfFactors;
    }

}
