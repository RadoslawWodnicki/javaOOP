package pl.edu.utp.meancalculation;

public class GeometricMeanAlgorithm implements MeanAlgorithm {

	// fields - pola, wewnetrzny stan naszego algorytmu. nikt nie powinien ich edytowac
    private double currentSum;
    private double noOfFactors;

    // constructor
    public GeometricMeanAlgorithm() {
        currentSum = 1;
        noOfFactors = 0;
    }

    public void add(double factor) {
        currentSum *= factor;
        noOfFactors++;
    }

    @Override
    public double calculateMean() {

        return Math.pow(currentSum, (double) 1 / noOfFactors);
    }

}
