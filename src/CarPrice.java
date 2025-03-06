import java.util.Scanner;

public class CarPrice {

    public int carPriceData(){

        Scanner sc=new Scanner(System.in);

        try{
            do{
                if (sc.hasNextInt()) {
                    int value = sc.nextInt();
                    System.out.println("You entered a valid integer: " + value);
                    return value;
                } else {
                    String invalidInput = sc.next();
                    System.out.println("Invalid input! You entered a non-integer: " + invalidInput);
                }


            }while(true);
        }
        finally {
            //sc.close();
        }

    }
}
