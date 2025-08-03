import java.util.*;

public class CompoundInterest{
  public static void main(String[]args){
    Scanner sim = new Scanner(System.in);

    // This program calculates the total amount of money you will have after investing a certain amount
    // at a given interest rate for a specified number of years, compounded annually.

    double amount, Pamount , interest ,years, annually = 12;
    char currency = '$';

    System.out.println("Enter the amount that you want to invest : ");
    Pamount = sim.nextDouble();

    System.out.println("Enter the interest rate : ");
    interest = sim.nextDouble();

    System.out.println("Enter the number of years you want to invest it for :");
    years = sim.nextDouble();

    amount = Pamount*Math.pow((1+(interest/annually)),(annually*years));

    amount = Math.round(amount);

    System.out.println("your total amount you'll get is : "+currency + amount);


    sim.close();
  }
}