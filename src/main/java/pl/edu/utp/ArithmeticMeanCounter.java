package pl.edu.utp;

// structural programming
//arytmetyczna srednia, obliczanie tej sredniej za pomoca porogramowania strukturalnego

public class ArithmeticMeanCounter {

    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = 40;

        double mean = calculateArithmeticMean(a, b, c);
        double geoMean = calculateGeometricMean(a, b, c);
        System.out.println(mean);
        System.out.println(geoMean);
    }

    public static double calculateArithmeticMean(double... factors) {
        double sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum / factors.length;
    }

	// srednia geometryczna
    public static double calculateGeometricMean(double... factors) {
        double result = 1;
        for (double factor : factors) {
            result *= factor;
        }
        return Math.pow(result, (double) 1 / factors.length);
    }

}
