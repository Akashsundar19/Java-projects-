import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose 1 to convert kgs into lbs ");
        System.out.println("Choose 2 to convert lbs into kgs");
        System.out.print("Choose an option : ");
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.print("Enter weight in kgs : ");
            double weight = sc.nextDouble();
            double newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs = %.2f ", newWeight);
        }else if(choice == 2){
            System.out.print("Enter weight in lbs : ");
            double weight = sc.nextDouble();
            double newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs = %.2f ", newWeight);

        }else{

            System.out.println("Invalid Choice");
        }



    }
}