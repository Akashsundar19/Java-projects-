import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle : ");
        double principle = sc.nextDouble();
        System.out.print("Enter rate in % : ");
        double rate  = sc.nextDouble()/100;
        System.out.print("Enter no of times compounded per year : ");
        int comp = sc.nextInt();
        System.out.print("Enter no of years : ");
        int years  = sc.nextInt();
        double amount = principle*Math.pow(1+rate/comp,comp*years);
        System.out.println("The amount after " + years + " is : Rs. "+ amount);



    }
}