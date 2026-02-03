import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener {

    private JTextField textfield1;
    private JLabel label1, label2, label3, label4;
    private JButton boton1;

    public Bienvenida() {
        setLayout(null);
        setTitle("Glow Me - Bienvenida");

        setIconImage(new ImageIcon("maquillajep.png").getImage());

        Color rosaSuave = new Color(255, 204, 230);
        Color rosaPastel = new Color(255, 153, 204);
        Color lilaSuave = new Color(225, 210, 255);
        Color textoOscuro = new Color(80, 45, 60);
        Color doradoSuave = new Color(255, 233, 200);

        getContentPane().setBackground(rosaSuave);

        label1 = new JLabel("✨ GLOW ME ✨");
        label1.setBounds(70, 60, 250, 80);
        label1.setFont(new Font("Serif", Font.BOLD, 28));
        label1.setForeground(textoOscuro);
        add(label1);

        
        label2 = new JLabel("Sistema de control de vacaciones");
        label2.setBounds(20, 130, 300, 30);
        label2.setFont(new Font("Georgia", Font.BOLD, 16));
        label2.setForeground(textoOscuro);
        add(label2);

     
        label3 = new JLabel("Ingrese su nombre");
        label3.setBounds(45, 200, 200, 30);
        label3.setFont(new Font("SansSerif", Font.PLAIN, 14));
        label3.setForeground(textoOscuro);
        add(label3);

       
        label4 = new JLabel("© 2025 Glow Me Cosmetics");
        label4.setBounds(60, 375, 300, 30);
        label4.setFont(new Font("Serif", Font.BOLD, 13));
        label4.setForeground(textoOscuro);
        add(label4);

        
        textfield1 = new JTextField();
        textfield1.setBounds(45, 240, 255, 25);
        textfield1.setBorder(BorderFactory.createLineBorder(rosaPastel, 2));
        textfield1.setBackground(Color.WHITE);
        add(textfield1);

        
        boton1 = new JButton("Ingresar");
        boton1.setBounds(125, 280, 100, 32);
        boton1.setBackground(lilaSuave);
        boton1.setForeground(textoOscuro);
        boton1.setFont(new Font("SansSerif", Font.BOLD, 14));
        boton1.setBorder(BorderFactory.createLineBorder(doradoSuave, 2));
        boton1.addActionListener(this);
        add(boton1);

        setBounds(0, 0, 350, 450);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (textfield1.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingresa tu nombre");
            return;
        }

        this.dispose();
        Licencia licencia = new Licencia();
        licencia.setVisible(true);
    }

    public static void main(String[] args) {
        new Bienvenida().setVisible(true);
    }
}