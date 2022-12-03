package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel {
    // Atributos
    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JLabel lTexto;
    private JLabel lN;
    private static JTextField tfTexto;
    private static JTextField tfN;

    // Métodos

    /* Método Constructor */

    public PanelEntradaDatos() {
        // Definicion del contenedor del panel
        setLayout(null);
        setBackground(Color.pink);

        // Creación y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/cifrado.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10, 20, 170, 158);
        this.add(lbImagen);

        // Crear y agregar etiquetas, campos de texto
        lTexto = new JLabel("Mensaje =");
        lTexto.setBounds(250, 40, 150, 20);
        this.add(lTexto);

        tfTexto = new JTextField();
        tfTexto.setBounds(320, 40, 100, 20);
        this.add(tfTexto);

        lN = new JLabel("Entero mágico =");
        lN.setBounds(220, 70, 150, 20);
        this.add(lN);

        tfN = new JTextField();
        tfN.setBounds(320, 70, 100, 20);
        this.add(tfN);

        // Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de entrada");
        borde.setTitleColor(Color.gray);
        setBorder(borde);
    }

    // Metodos de acceso a la información de las cajas de texto
    public static String getTexto(){
        return tfTexto.getText();
    }

    public static int getN() {
        return Integer.parseInt(tfN.getText());
    }

    // Metodo para borrar cajas de texto
    public void borrar() {
        tfTexto.setText("");
        tfN.setText("");
    }
    
}
