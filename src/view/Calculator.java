package view;

import model.ComplexNumber;
import model.Operation;
import model.mathOperations.*;


public class Calculator {
    public Operation mathOperation= new Operation();
    private ComplexNumber result=null;
    private ComplexNumber firstNum;
    private ComplexNumber secondNum;
    public String operation;

    public Calculator(ComplexNumber firstNum, ComplexNumber secondNum, String operation) {
        this.firstNum=firstNum;
        this.secondNum=secondNum;
        this.operation=operation;

    }

    public void calculation(){

        if(operation.equals("+")){
            mathOperation.setOperation(new Addition());
        }
        if(operation.equals("-")){
            mathOperation.setOperation(new Subtraction());
        }
        if(operation.equals("*")){
            mathOperation.setOperation(new Multiplication());
        }
        if(operation.equals("/")){
            if(secondNum.getRealPart()==0 && secondNum.getImaginaryPart()==0){
                System.out.println("На ноль делить нельзя!");
            }
            mathOperation.setOperation(new Division());

        }
        result= mathOperation.executeOperation(firstNum,secondNum);

    }

    public ComplexNumber getResult() {
        return result;
    }






}
