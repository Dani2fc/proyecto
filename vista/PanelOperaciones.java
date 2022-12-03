package vista;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel {
    // ----------------------
    // Atributos
    // ----------------------
    public JButton btCifrar;
    public JButton btDescifrar;
    public JButton btBorrar;

    // ----------------------
    // Metodos
    // ----------------------

    // Constructor
    public PanelOperaciones() {
        // Definicion del contenedor del panel
        setLayout(null);
        setBackground(Color.pink);

        // Creación y adicion de los botones
        btCifrar = new JButton("Cifrar");
        btCifrar.setFont(new Font("Arial", BOLD, 12));
        btCifrar.setBounds(10, 20, 90, 20);
        add(btCifrar);
        btCifrar.setActionCommand("cifrar");

        btDescifrar = new JButton("Descifrar");
        btDescifrar.setFont(new Font("Arial", BOLD, 12));
        btDescifrar.setBounds(120, 20, 110, 20);
        add(btDescifrar);
        btDescifrar.setActionCommand("descifrar");

        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(250, 20, 90, 20);
        this.add(btBorrar);
        btBorrar.setActionCommand("borrar");

        // Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.gray);
        setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL) {
        btCifrar.addActionListener(pAL);
        btDescifrar.addActionListener(pAL);
        btBorrar.addActionListener(pAL);

    }

}