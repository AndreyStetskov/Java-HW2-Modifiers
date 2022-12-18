public class SuperannuationFund {

    final double COEFF_OF_PENSION = 0.02;
    int averagePension = 1500;
    String nameOfSF;
    boolean isNational;
    double pension;
    final String dateCreated;
    int timeWorked;
    double minWage;
    double maxWage;


    public SuperannuationFund(String nameOfSF, boolean isNational, String dateCreated, int timeWorked, double minWage, double maxWage) {
        this.nameOfSF = nameOfSF;
        this.isNational = isNational;
        this.dateCreated = dateCreated;
        this.timeWorked = timeWorked;
        this.minWage = minWage;
        this.maxWage = maxWage;
    }

    public double pensionCalculation () {
        if (isNational == true) {
            pension = HalfValueUtils.HalfValue(minWage, maxWage) * COEFF_OF_PENSION * timeWorked;
            System.out.println(pension);
        } else {
            pension = HalfValueUtils.HalfValueOFThree(minWage, maxWage, averagePension) * COEFF_OF_PENSION * timeWorked;
            System.out.println(pension);
        }
        return pension;
    }

}
