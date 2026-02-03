import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener {

    private JTextField txtNombre, txtAPaterno, txtAMaterno;
    private JComboBox<String> comboDepartamento, comboAntiguedad;
    private JTextArea txtResultado;
    private JMenuItem miCalculo, miSalir, miNuevo;
    private JMenuItem miAcercad;

    public Principal() {

        setLayout(null);
        setTitle("Glow Me - Panel Principal");


        setIconImage(new ImageIcon("maquillajep.png").getImage());
        
        Color rosaSuave = new Color(255, 204, 230);
        Color rosaPastel = new Color(255, 153, 204);
        Color lilaSuave = new Color(230, 210, 255);
        Color doradoSuave = new Color(255, 234, 190);
        Color textoOscuro = new Color(80, 45, 60);

        getContentPane().setBackground(rosaSuave);

        
        JLabel lb1 = new JLabel("Nombre");
        lb1.setBounds(20, 50, 100, 25);
        lb1.setForeground(textoOscuro);
        add(lb1);

        txtNombre = new JTextField();
        txtNombre.setBounds(120, 50, 150, 25);
        txtNombre.setBackground(Color.WHITE);
        txtNombre.setBorder(BorderFactory.createLineBorder(rosaPastel, 2));
        add(txtNombre);

        JLabel lb2 = new JLabel("Apellido P");
        lb2.setBounds(20, 90, 100, 25);
        lb2.setForeground(textoOscuro);
        add(lb2);

        txtAPaterno = new JTextField();
        txtAPaterno.setBounds(120, 90, 150, 25);
        txtAPaterno.setBackground(Color.WHITE);
        txtAPaterno.setBorder(BorderFactory.createLineBorder(rosaPastel, 2));
        add(txtAPaterno);

        JLabel lb3 = new JLabel("Apellido M");
        lb3.setBounds(20, 130, 100, 25);
        lb3.setForeground(textoOscuro);
        add(lb3);

        txtAMaterno = new JTextField();
        txtAMaterno.setBounds(120, 130, 150, 25);
        txtAMaterno.setBackground(Color.WHITE);
        txtAMaterno.setBorder(BorderFactory.createLineBorder(rosaPastel, 2));
        add(txtAMaterno);

        
        comboDepartamento = new JComboBox<>();
        comboDepartamento.setBounds(300, 50, 170, 25);
        comboDepartamento.setBackground(lilaSuave);
        comboDepartamento.setForeground(textoOscuro);
        comboDepartamento.setBorder(BorderFactory.createLineBorder(doradoSuave, 2));

        comboDepartamento.addItem("Ventas");
        comboDepartamento.addItem("Cajas");
        comboDepartamento.addItem("Marketing");
        add(comboDepartamento);

        comboAntiguedad = new JComboBox<>();
        comboAntiguedad.setBounds(300, 90, 170, 25);
        comboAntiguedad.setBackground(lilaSuave);
        comboAntiguedad.setForeground(textoOscuro);
        comboAntiguedad.setBorder(BorderFactory.createLineBorder(doradoSuave, 2));

        comboAntiguedad.addItem("1 año");
        comboAntiguedad.addItem("2 años");
        comboAntiguedad.addItem("3 años");
        comboAntiguedad.addItem("4 años");
        comboAntiguedad.addItem("5 años");
        add(comboAntiguedad);

        
        txtResultado = new JTextArea();
        txtResultado.setBounds(20, 200, 450, 100);
        txtResultado.setEditable(false);
        txtResultado.setBackground(Color.WHITE);
        txtResultado.setForeground(textoOscuro);
        txtResultado.setBorder(BorderFactory.createLineBorder(rosaPastel, 3));
        add(txtResultado);

        
        JMenuBar bar = new JMenuBar();
        bar.setBackground(rosaPastel);
        bar.setBorder(BorderFactory.createLineBorder(doradoSuave, 2));

        JMenu menuAcercad = new JMenu("Acerca de mi");
        menuAcercad.setForeground(textoOscuro);

        miAcercad = new JMenuItem("Acerca de mi");
        miAcercad.setBackground(lilaSuave);
        miAcercad.setForeground(textoOscuro);
        miAcercad.addActionListener(this);
        menuAcercad.add(miAcercad);

        JMenu menuOpciones = new JMenu("Opciones");
        menuOpciones.setForeground(textoOscuro);

        miSalir = new JMenuItem("Salir");
        miSalir.setBackground(lilaSuave);
        miSalir.setForeground(textoOscuro);
        miSalir.addActionListener(this);
        menuOpciones.add(miSalir);

        miNuevo = new JMenuItem("Nuevo");
        miNuevo.setBackground(lilaSuave);
        miNuevo.setForeground(textoOscuro);
        miNuevo.addActionListener(this);
        menuOpciones.add(miNuevo);

        JMenu menuCalcular = new JMenu("Calcular");
        menuCalcular.setForeground(textoOscuro);

        miCalculo = new JMenuItem("Vacaciones");
        miCalculo.setBackground(lilaSuave);
        miCalculo.setForeground(textoOscuro);
        miCalculo.addActionListener(this);
        menuCalcular.add(miCalculo);

        bar.add(menuOpciones);
        bar.add(menuCalcular);
        bar.add(menuAcercad);
        setJMenuBar(bar);

        
        JPanel footer = new JPanel();
        footer.setBackground(rosaPastel);
        footer.setBounds(0, 340, 500, 30);
        footer.setLayout(new GridLayout(1, 1));

        JLabel labelFooter = new JLabel("© 2025 Glow Me Cosmetics", SwingConstants.CENTER);
        labelFooter.setForeground(textoOscuro);
        labelFooter.setFont(new Font("Serif", Font.BOLD, 13));

        footer.add(labelFooter);
        add(footer);

       
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == miAcercad) {
            new Acercad().setVisible(true);
        }

        if (e.getSource() == miSalir) {
            this.dispose();
            Bienvenida inicio = new Bienvenida();
            inicio.setVisible(true);
        }

        if (e.getSource() == miNuevo) {
            this.dispose();
            Principal inicio = new Principal();
            inicio.setVisible(true);
        }

        if (e.getSource() == miCalculo) {

            String nombre = txtNombre.getText();
            String paterno = txtAPaterno.getText();
            String materno = txtAMaterno.getText();

            String departamento = comboDepartamento.getSelectedItem().toString();
            String anti = comboAntiguedad.getSelectedItem().toString();

            int dias = switch (anti) {
                case "1 año" -> 6;
                case "2 años" -> 8;
                case "3 años" -> 10;
                case "4 años" -> 12;
                default -> 14;
            };

            txtResultado.setText(
                    "Hola " + nombre + " " + paterno + " " + materno +
                    "\nDel departamento de " + departamento +
                    "\nTienes " + dias + " días de vacaciones."
            );
        }
    }
}
