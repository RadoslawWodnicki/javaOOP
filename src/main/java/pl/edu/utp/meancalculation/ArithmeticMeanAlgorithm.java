package pl.edu.utp.meancalculation;

// class declaration
/*
<access_modifier> <extra_keywords> class_name <extends other_class> <implements other_interface, ...> {
}
 */
public class ArithmeticMeanAlgorithm implements MeanAlgorithm {

    // fields - pola, wewnetrzny stan naszego algorytmu. nikt nie powinien ich edytowac
    /*
    <access_modifier> <extra_keywords> field_type field_name; - declaration
    <access_modifier> <extra_keywords> field_type field_name = value; - declaration and initialization
     */
    private double currentSum;
    private double noOfFactors;

    // constructor
    /*
    <access_modifier> name_matching_class_name(<args list, ...>) {
        constructor_body
    }
     */
    public ArithmeticMeanAlgorithm() {
        currentSum = 0;
        noOfFactors = 0;
    }

    // methods
    /*
    <access_modifier> <extra_keywords> returned_type method_name(<args list, ...>) {
        ...
        method_body
        return <type>; (except void)
    }
    <arg> - <extra_keywords> arg_type arg_name
     */
    @Override
    public void add(double a) {
        currentSum += a; // currentSum = currentSum + a;
        noOfFactors++; // noOfFactors = noOfFactors + 1;
    }

    @Override
    public double calculateMean() {
        return currentSum / noOfFactors;
    }

}
