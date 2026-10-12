package ie.atu.oop.week1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExceptionWarmup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;

        while (!isValid) {
            System.out.println("Enter a page count: ");
            String text = scanner.nextLine();

            try{
                int pageCount = Integer.parseInt(text);
                System.out.println("You entered: " + pageCount);
                isValid = true;

            } catch (NumberFormatException e){
                System.out.println("Please enter a whole number ");
            }
        }
    }
}
