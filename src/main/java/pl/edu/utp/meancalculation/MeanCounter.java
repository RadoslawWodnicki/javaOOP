package pl.edu.utp.meancalculation;
package pl.edu.utp.meancalculation;

// object oriented approach
public class MeanCounter {

    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = 40;

        calculateMean(new ArithmeticMeanAlgorithm(), a, b, c);
        calculateMean(new GeometricMeanAlgorithm(), a, b, c);
    }

    public static void calculateMean(MeanAlgorithm algorithm, double... factors) {
        for (double factor : factors) {
            algorithm.add(factor);
        }
        System.out.println(algorithm.calculateMean());
    }

}
