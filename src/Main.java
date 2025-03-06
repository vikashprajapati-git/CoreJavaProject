import java.util.List;

public class Main {
    public static void main(String[] args) {

        CarInput carInput = new CarInput();
        List<CarDetails> carDetails= carInput.carInputData();
        InsuranceCalc insuranceCalc = new InsuranceCalc();


        for(CarDetails cd:carDetails){
            double insurancePrice=0;
            System.out.println(" The total insurance of below cars are: ");
            System.out.println("Car Model: "+cd.getCarModel());
            System.out.println("Car price: "+cd.getCarPrice());
            insurancePrice=insuranceCalc.insurance(cd.getCarType(), cd.getCarPrice(), cd.getInsuranceType());
            System.out.println("Total Insurance to be paid: "+ insurancePrice);
        }

    }
}