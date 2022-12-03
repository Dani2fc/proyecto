package ejecutable;

import controlador.Controlador;
import vista.VentanaPrincipal;
import modelo.CifradoCesar;

public class Test {
    public static void main(String[] args)
    {
        CifradoCesar miModelo = new CifradoCesar();
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Controlador miControlador = new Controlador(miVentana, miModelo);
    }    
}
