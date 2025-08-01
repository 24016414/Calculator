import java.util.*;

public class weightconverter {
    public static void main(String[] args){
        Scanner sim = new Scanner(System.in);

        double weight, convertedWeight, finalWeight;
        int choice;
        
        System.out.println("what do you want to convert your weight to ? chose (1 or 2) :");
        System.out.println("1. pounds to kilograms");
        System.out.println("2. kilograms to pounds");
        choice = sim.nextInt();      

        if(choice == 1){

            System.out.println("enter the mass you want to convert from pounds to kilograms : ");
            weight = sim.nextDouble();
            convertedWeight = weight / 2.20462;
            finalWeight = Math.round(convertedWeight);
            System.out.println("The mass in kilograms is :"+ convertedWeight +" kgs");

        }
        else if(choice == 2){
            System.out.println("enter the mass you want to convert from kilograms to pounds : ");
            weight = sim.nextDouble();
            convertedWeight = weight * 2.20462;
            finalWeight = Math.round(convertedWeight);
            System.out.println("The mass in kilograms is :"+ finalWeight +" lbs");
        }
        else{
            System.out.println("invalid choice, please select either 1 or 2");

        }
        sim.close();
    }
    
}
