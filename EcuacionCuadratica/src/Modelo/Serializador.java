//metodos para tomar un objeto y llevarlos a un archivo
package Modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Serializador {

    private FileInputStream ArchivoEntrada = null;
    private FileOutputStream ArchivoSalida = null;
    private ObjectInputStream SerializadorEntrada = null;
    private ObjectOutputStream SerializadorSalida = null;

    public void GuardarObjeto(EcuacionCuadratica ecuacion, String NombreArchivo) {
        try {
            ArchivoSalida = new FileOutputStream(NombreArchivo);
            SerializadorSalida = new ObjectOutputStream(ArchivoSalida);
            SerializadorSalida.writeObject(ecuacion);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Serializador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Serializador.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                SerializadorSalida.close();
                ArchivoSalida.close();
            } catch (IOException ex) {
                Logger.getLogger(Serializador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public EcuacionCuadratica LeerObjeto(String NombreArchivo) {
        EcuacionCuadratica ecuacion = null;
        try {
            ArchivoEntrada = new FileInputStream(NombreArchivo);
            SerializadorEntrada = new ObjectInputStream(ArchivoEntrada);
            ecuacion = (EcuacionCuadratica) SerializadorEntrada.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Serializador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Serializador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Serializador.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                SerializadorSalida.close();
            } catch (IOException ex) {
                Logger.getLogger(Serializador.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                return ecuacion;
            }
        }
    }
}
