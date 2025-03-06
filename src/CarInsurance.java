import java.util.Scanner;

public class CarInsurance {

    public String insuranceType(){

        Scanner sc=new Scanner(System.in);
        String[] insuranceTypeValue={"Basic","Premium"};


        do{
            int input=sc.nextInt();
            sc.nextLine();
            if(input==1 || input==2){
                System.out.println("Selected Car Type is :"+insuranceTypeValue[input-1]);
                return insuranceTypeValue[input-1];
            }
            else
                System.out.println("Pls enter valid input");
        }while(true);


    }
}

