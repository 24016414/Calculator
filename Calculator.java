import java.util.*;

public class Calculator{
    public static void main(String []args){
        Scanner sim = new Scanner(System.in);

        // This program performs basic arithmetic operations on two numbers based on user input.

     double num, nam, answer;
     char operation;

     System.out.println("enter the first number : ");
      num = sim.nextDouble();

     System.out.println("enter the second number : ");
      nam = sim.nextDouble();

     System.out.println("chose a character you want to use for the operation ( + , - , / , * , ^ , % ) ");
      operation =sim.next().charAt(0);
 
     switch(operation){
        case '+' -> {
                    answer = num + nam;
                    System.out.println("the answer is : " + answer);
                    }
        case '*' -> {
                    
                    answer = num * nam;
                    System.out.println("the answer is : " + answer);
                    }
        case '-' -> {
                    
                    answer = num - nam;
                    System.out.println("the answer is : " + answer);
                    }
        case '/' -> {
                    
                    answer = num / nam;
                    System.out.println("the answer is : " + answer);
                    }
        case '%' -> {
                    
                    answer = num % nam;
                    System.out.println("the answer is : " + answer);
                    }
        case '^' -> {
                    
                    answer = Math.pow(num,nam);
                    System.out.println("the answer is : " + answer);
                    }
        default -> {
                    System.out.println("Invalid operation character. please enter a valid operation character...:");
                    }
                    
                }

     sim.close();
    }
}