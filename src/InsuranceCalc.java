import java.util.List;
import java.util.Objects;

public class InsuranceCalc {

    CarInput carInput;
    double insurancePrice=0;

    public double insurance(String carType, double carPrice, String insuranceType){

            if(Objects.equals(carType, "SUV") && Objects.equals(insuranceType, "Basic")){
                insurancePrice=carPrice*0.1;
            } else if (Objects.equals(carType, "SUV") && Objects.equals(insuranceType, "Premium")) {
                insurancePrice=carPrice*0.1;
                insurancePrice=insurancePrice+(0.2*insurancePrice);
            } else if (Objects.equals(carType, "Sedan") && Objects.equals(insuranceType, "Basic")) {
                insurancePrice=carPrice*0.08;
            }else if (Objects.equals(carType, "Sedan") && Objects.equals(insuranceType, "Premium")) {
                insurancePrice=carPrice*0.08;
                insurancePrice=insurancePrice+(0.2*insurancePrice);
            } else if (Objects.equals(carType, "Hatchback") && Objects.equals(insuranceType, "Basic")) {
                insurancePrice=carPrice*0.05;
            }else if (Objects.equals(carType, "Hatchback") && Objects.equals(insuranceType, "Premium")) {
                insurancePrice=carPrice*0.05;
                insurancePrice=insurancePrice+(0.2*insurancePrice);
            }


        return insurancePrice;
    }
}
