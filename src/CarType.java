import java.util.Scanner;

public class CarType {
    Scanner sc=new Scanner(System.in);

    public String type(){

    String[] carTypeValue={"Hatchback","Sedan","SUV"};


    do{
        int input=sc.nextInt();
        sc.nextLine();
        try{
            if(input>=1 && input<=3){
                System.out.println("Selected Car Type is :"+carTypeValue[input-1]);
                return carTypeValue[input-1];
            }
            else
                System.out.println("Pls enter valid input");

        }
        catch (Exception e){
            System.out.println(e);
        }
        input=0;

    }while(true);
    }
}
