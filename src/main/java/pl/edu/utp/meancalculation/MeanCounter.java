package pl.edu.utp.meancalculation;

// object oriented approach
public class MeanCounter {

    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = 40;

        // najpierw deklaruje referencja (typ + nazwa obiektu)
        MeanAlgorithm meanAlgorithm = new ArithmeticMeanAlgorithm();
        meanAlgorithm.add(a);
        meanAlgorithm.add(b);
        meanAlgorithm.add(c);

        MeanAlgorithm geoMeanAlgorithm = new GeometricMeanAlgorithm();
        geoMeanAlgorithm.add(a);
        geoMeanAlgorithm.add(b);
        geoMeanAlgorithm.add(c);

        displayMeans(meanAlgorithm, geoMeanAlgorithm);
    }

    public static void displayMean(MeanAlgorithm algorithm) {

        System.out.println(algorithm.calculateMean());
        System.out.println("WITAM V2!");
    }

    public static void displayMeans(MeanAlgorithm... algorithms) {
        for (MeanAlgorithm algorithm : algorithms) {
            displayMean(algorithm);
        }
    }

}
