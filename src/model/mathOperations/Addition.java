package model.mathOperations;

import model.ComplexNumber;

public class Addition implements Operationable {
    @Override
    public ComplexNumber execute(ComplexNumber f, ComplexNumber s) {
        double real = f.getRealPart()+s.getRealPart();
        double imag = f.getImaginaryPart()+s.getImaginaryPart();
        System.out.printf("Выполняется: ( %s ) + ( %s )\n", f, s);
        return new ComplexNumber(real,imag);
    }
}
