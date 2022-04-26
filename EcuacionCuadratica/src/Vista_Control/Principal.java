package Vista_Control;

import Modelo.Excepciones.A_Igual_A_Cero_Exception;
import Modelo.Excepciones.Discriminante_Exception;
import Modelo.EcuacionCuadratica;
import Modelo.Serializador;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner Input = new Scanner(System.in);
        int Opc;
        System.out.println("PROGRAMA ECUACION CUADRATICA");
        System.out.println("***Menu***");
        System.out.println("1. Guardar Ecuacion");
        System.out.println("2. Abrir Ecuacion Guardada");
        System.out.print("Digite su opcion: ");
        Opc = Input.nextInt();
        EcuacionCuadratica ecuacion = null;
        Serializador serializador = new Serializador();
        switch (Opc) {
            case 1:
                ecuacion = new EcuacionCuadratica();
                System.out.print("Ingrese el valor de A: ");
                ecuacion.setA(Input.nextDouble());
                System.out.print("Ingrese el  valor de B: ");
                ecuacion.setB(Input.nextDouble());
                System.out.print("Ingrese el valor de C: ");
                ecuacion.setC(Input.nextDouble());
                boolean Error;
                do {
                    Error = false;
                    try {
                        ecuacion.Resolver();
                    } catch (A_Igual_A_Cero_Exception ex) {
                        Error = true;
                        System.out.println(ex.getMessage() + ", Por favor, Modifque el valor de A");
                        System.out.println("Ingrese el nuevo valor de A: ");
                        ecuacion.setA(Input.nextDouble());
                    } catch (Discriminante_Exception ex) {
                        Error = true;
                        System.out.println(ex.getMessage() + ", Por favor, Modifque los coeficientes de la ecuacion");
                        System.out.print("Ingrese el nuevo valor de A: ");
                        ecuacion.setA(Input.nextDouble());
                        System.out.print("Ingrese el nuevo valor de B: ");
                        ecuacion.setB(Input.nextDouble());
                        System.out.print("Ingrese el nuevo valor de C: ");
                        ecuacion.setC(Input.nextDouble());
                    }
                    Error = false;
                } while (Error);
                System.out.println("Raiz 1= " + ecuacion.getX1());
                System.out.println("Raiz 2= " + ecuacion.getX2());
                System.out.print("Digite el nombre del archivo: ");
                String NombreArchivo = Input.next();
                serializador.GuardarObjeto(ecuacion, NombreArchivo);
                break;
            case 2:
                ecuacion = null;
                System.out.print("Digite el nombre del archivo: ");
                NombreArchivo = Input.next();
                ecuacion = serializador.LeerObjeto(NombreArchivo);
                System.out.println("Datos de la ecuacion recuperada: ");
                System.out.println(ecuacion.getA() + "x^2 + " + ecuacion.getB() + "x + " + ecuacion.getC() + "= 0");
                break;
        }
    }
}
