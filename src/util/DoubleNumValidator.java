package util;

import java.util.Scanner;

public class DoubleNumValidator {
    public double validate(String msg){
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        double result = -1;
        try{
            result = Double.parseDouble(in.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Not number was entered. Please enter a number.");
            validate(msg);
        }
        return result;
    }
}
