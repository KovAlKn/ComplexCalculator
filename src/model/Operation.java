package model;

import model.mathOperations.Operationable;

public class Operation {
    private Operationable operation;

    public Operation(Operationable operation) {
        this.operation = operation;
    }

    public Operation() {}

    public void setOperation(Operationable operation) {
        this.operation = operation;
    }
    public ComplexNumber executeOperation(ComplexNumber a, ComplexNumber b){
        return  operation.execute(a, b);
    }
}
