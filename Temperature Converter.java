import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose 1 to convert Fahrenheit into Celsius ");
        System.out.println("Choose 2 to convert Celsius into Fahrenheit");
        System.out.print("Choose an option : ");
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.print("Enter Temperature in Fahrenheit : ");
            double temp = sc.nextDouble();
            double newTemp = (temp - 32)*5/9;
            System.out.printf("The new temperature in Celsius = %.2f ", newTemp);
        }else if(choice == 2){
            System.out.print("Enter Temperature in celsius : ");
            double temp= sc.nextDouble();
            double newTemp = (temp * 5/9)+32;
            System.out.printf("The new Temperature in Fahrenheit = %.2f ", newTemp);

        }else{

            System.out.println("Invalid Choice");
        }



    }
}