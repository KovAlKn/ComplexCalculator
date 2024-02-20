package model.mathOperations;

import model.ComplexNumber;

public class Division implements Operationable {
    @Override
    public ComplexNumber execute(ComplexNumber f, ComplexNumber s) {
        double a = f.getRealPart();
        double b = f.getImaginaryPart();
        double c = s.getRealPart();
        double d = s.getImaginaryPart();

        double real = (a*c+b*d)/(Math.pow(c,2)+Math.pow(d,2));
        double imag = (b*c-a*d)/(Math.pow(c,2)+Math.pow(d,2));
        return new ComplexNumber(real,imag);
    }
}
