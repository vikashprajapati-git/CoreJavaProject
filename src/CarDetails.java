public class CarDetails {
    private String carModel;
    private String carType;
    private double carPrice;
    private String insuranceType;

    public CarDetails(String carModel, String carType, double carPrice, String insuranceType) {
        this.carModel = carModel;
        this.carType = carType;
        this.carPrice = carPrice;
        this.insuranceType = insuranceType;
    }

    public CarDetails() {
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

}
