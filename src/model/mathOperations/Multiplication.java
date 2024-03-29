package model.mathOperations;

import model.ComplexNumber;

public class Multiplication implements Operationable {
    @Override
    public ComplexNumber execute(ComplexNumber f, ComplexNumber s) {
        double real = f.getRealPart()*s.getRealPart()-f.getImaginaryPart()* s.getImaginaryPart();
        double imag = (f.getImaginaryPart()*s.getRealPart())+(f.getRealPart()*s.getImaginaryPart());
        System.out.printf("Выполняется: ( %s ) x ( %s )\n", f, s);
        return new ComplexNumber(real,imag);
    }
}
