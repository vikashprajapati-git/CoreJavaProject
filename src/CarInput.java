
import java.util.Scanner;
import java.util.*;
public class CarInput {

    List<CarDetails> carDetails=new ArrayList<>();
    CarType carType=new CarType();
    CarInsurance carInsurance=new CarInsurance();
    CarPrice carprice=new CarPrice();
    Scanner sc=new Scanner(System.in);

    public List<CarDetails> carInputData(){
        int flag=0;

        do{
            System.out.println("Enter Car Details: ");
            System.out.println("Enter Car Model:  ");
            String carModelVal= sc.nextLine();
           // carDetails[flag].setCarModel(sc.nextLine());
            System.out.println("Choose Car Type: 1-> Hatchback 2-> Sedan 3-> SUV");
            String carTypeValue=carType.type();
           // carDetails[flag].setCarType(carType.type());
            System.out.println("Enter Car Price: ");
            double carPriceValue=carprice.carPriceData();
           // carDetails[flag].setCarPrice(sc.nextDouble());
            System.out.println("Enter Insurance Type: 1->Basic 2->Premium");
            String carInsuranceType=carInsurance.insuranceType();
           // carDetails[flag].setInsuranceType(carInsurance.insuranceType());
            carDetails.add(new CarDetails(carModelVal,carTypeValue,carPriceValue,carInsuranceType));
            System.out.println("Do you want to enter more details, press y/n: ");
            char ans=sc.nextLine().charAt(0);
            if(ans=='y' || ans=='Y'){
                flag++;
            }
            else if(ans=='n' || ans=='N'){
                break;
            }
        }while(flag>0);

        return carDetails;
    }
}
