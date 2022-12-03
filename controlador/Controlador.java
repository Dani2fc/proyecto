package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.event.PrintEvent;
import javax.swing.JOptionPane;
import modelo.CifradoCesar;
import javax.swing.text.PlainDocument;

import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    //Atributos
    private VentanaPrincipal venPrin;
    private CifradoCesar metodoCifrado;
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, CifradoCesar pModel)
    {
        this.venPrin = pVenPrin;
        this.metodoCifrado = pModel;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);        
    }

    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();
        
        if(comando.equals("cifrar"))
        {
            venPrin.miPanelResultado.mostrarResultado(metodoCifrado.cifrar(vista.PanelEntradaDatos.getTexto(), vista.PanelEntradaDatos.getN()));
        }

        if(comando.equals("descifrar"))
        {
            venPrin.miPanelResultado.mostrarResultado(metodoCifrado.descifrar(vista.PanelEntradaDatos.getTexto(), vista.PanelEntradaDatos.getN()));
        }

        if(comando.equals("borrar"))
        {
            this.venPrin.miPanelEntradaDatos.borrar();
            this.venPrin.miPanelResultado.borrar();
        }
        
    }

}
