import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener {

    private JCheckBox check1;
    private JButton botonContinuar, botonCancelar;
    private JLabel label4;

    public Licencia() {
        setLayout(null);
        setTitle("Glow Me - Licencia de Uso");

        setIconImage(new ImageIcon("maquillajep.png").getImage());

        Color rosaSuave = new Color(255, 204, 230);
        Color rosaPastel = new Color(255, 153, 204);
        Color lilaSuave = new Color(230, 210, 255);
        Color doradoSuave = new Color(255, 230, 200);
        Color textoOscuro = new Color(80, 45, 60);

        getContentPane().setBackground(rosaSuave);

        
        JTextArea texto = new JTextArea();
        texto.setBounds(20, 50, 550, 180);
        texto.setEditable(false);
        texto.setFont(new Font("Serif", Font.PLAIN, 16));
        texto.setForeground(textoOscuro);
        texto.setBackground(Color.WHITE);
        texto.setBorder(BorderFactory.createLineBorder(rosaPastel, 3));

        texto.setText(
            "✨ TÉRMINOS Y CONDICIONES ✨\n\n" +
            "A. Prohibida la reventa sin permiso.\n" +
            "B. Glow Me no se hace responsable del mal uso.\n" +
            "C. Solo para uso interno del sistema.\n" +
            "D. Al aceptar, confirma que entiende estos términos.\n"
        );
        add(texto);

       
        check1 = new JCheckBox("Acepto los términos ✨");
        check1.setBounds(20, 250, 300, 30);
        check1.setBackground(rosaSuave);
        check1.setForeground(textoOscuro);
        check1.setFont(new Font("SansSerif", Font.BOLD, 14));
        check1.addChangeListener(this);
        add(check1);

  
        botonContinuar = new JButton("Continuar");
        botonContinuar.setBounds(20, 290, 120, 32);
        botonContinuar.setFont(new Font("SansSerif", Font.BOLD, 14));
        botonContinuar.setBackground(lilaSuave);
        botonContinuar.setForeground(textoOscuro);
        botonContinuar.setBorder(BorderFactory.createLineBorder(doradoSuave, 2));
        botonContinuar.addActionListener(this);
        botonContinuar.setEnabled(false);
        add(botonContinuar);

       
        botonCancelar = new JButton("Cancelar");
        botonCancelar.setBounds(160, 290, 120, 32);
        botonCancelar.setFont(new Font("SansSerif", Font.BOLD, 14));
        botonCancelar.setBackground(rosaPastel);
        botonCancelar.setForeground(textoOscuro);
        botonCancelar.setBorder(BorderFactory.createLineBorder(doradoSuave, 2));
        botonCancelar.addActionListener(this);
        add(botonCancelar);



         label4 = new JLabel("© 2025 Glow Me Cosmetics");
        label4.setBounds(60, 375, 300, 30);
        label4.setFont(new Font("Serif", Font.BOLD, 13));
        label4.setForeground(textoOscuro);
        add(label4);
        setSize(600, 360);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void stateChanged(ChangeEvent e) {
        botonContinuar.setEnabled(check1.isSelected());
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == botonContinuar) {
            this.dispose();
            new Principal().setVisible(true);
        }

        if (e.getSource() == botonCancelar) {
            JOptionPane.showMessageDialog(
                this,
                "Debes aceptar los términos y condiciones",
                "Aviso",
                JOptionPane.WARNING_MESSAGE
            );
        }
    }
}