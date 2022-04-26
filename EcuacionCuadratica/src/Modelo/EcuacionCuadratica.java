package Modelo;

import Modelo.Excepciones.A_Igual_A_Cero_Exception;
import Modelo.Excepciones.Discriminante_Exception;
import java.io.Serializable;

public class EcuacionCuadratica implements Serializable {

    private double A;
    private double B;
    private double C;
    private double X1; //private transient double x1 para que no quede almacenado
    private double X2;

    public EcuacionCuadratica() {
        this.A = 0;
        this.B = 0;
        this.C = 0;
    }
    
    public EcuacionCuadratica(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public double getB() {
        return B;
    }

    public void setB(double B) {
        this.B = B;
    }

    public double getC() {
        return C;
    }

    public void setC(double C) {
        this.C = C;
    }

    public double getX1() {
        return X1;
    }

    public void setX1(double X1) {
        this.X1 = X1;
    }

    public double getX2() {
        return X2;
    }

    public void setX2(double X2) {
        this.X2 = X2;
    }

    public void Resolver() throws A_Igual_A_Cero_Exception, Discriminante_Exception {
        if (A == 0) {
            throw new A_Igual_A_Cero_Exception();
        }
        double Discriminante = (B * B) - (4 * A * C);
        if (Discriminante < 0) {
            throw new Discriminante_Exception();
        }
        X1 = (-B + Math.sqrt(Discriminante)) / (2 * A);
        X2 = (-B - Math.sqrt(Discriminante)) / (2 * A);
    }
}
