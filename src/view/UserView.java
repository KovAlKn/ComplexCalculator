package view;

import model.ComplexNumber;
import util.DoubleNumValidator;
import util.Operations;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UserView {
    private final List<String> validOperations;
    public UserView() {
        this.validOperations = Arrays.stream(Operations.values())
                .map(Operations::operation)
                .collect(Collectors.toList());
    }

    public void run(){
        while (true) {

            System.out.println("Ввод первого числа");
            ComplexNumber a = createComplexNumber();
            System.out.println("Первое число: "+a);
            String operation = getOperation();
            System.out.println("Ввод второго числа");
            ComplexNumber b = createComplexNumber();
            System.out.println("Второе чило:" + b);
//            if(operation.equals("/")){
//
//            }
            Calculator calculator = new Calculator(a,b,operation);
            calculator.calculation();
            System.out.println("Результат вычислений: "+calculator.getResult());

            String action=prompt();
            if (!action.equalsIgnoreCase("y")) {
                System.exit(0);
            }
        }
    }
    private ComplexNumber createComplexNumber(){
        DoubleNumValidator validator = new DoubleNumValidator();
        Double realPart= validator.validate("Действительная часть: ");
        Double imagPart=  validator.validate("Мнимая часть без i: ");
        return new ComplexNumber(realPart, imagPart);

    }

    private String getOperation(){
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите математическую операцию (*, +, /, -) : ");
        String opearation = in.nextLine();
        while (true) {
            if (isInvalidOperator(opearation)) {
                System.err.println("Указана не верная математиеская операция." + "Укажите математическую операцию (*, +, /, -) : ");
                opearation = in.nextLine();
            } else return opearation;
        }
    }
    private boolean isInvalidOperator(String opearation) {
        return !validOperations.contains(opearation);
    }
    private String prompt() {
        Scanner in = new Scanner(System.in);
        System.err.println("Продолжить вычисления?... (y/n)");
        return in.nextLine();
    }
}
