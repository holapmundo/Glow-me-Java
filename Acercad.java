import javax.swing.*;
import java.awt.*;

public class Acercad extends JFrame {

    private JLabel labelFooter;

    Color rosaSuave = new Color(255, 204, 230);
    Color rosaPastel = new Color(255, 153, 204);
    Color lilaSuave = new Color(225, 210, 255);
    Color textoOscuro = new Color(80, 45, 60);
    Color doradoSuave = new Color(255, 233, 200);

    public Acercad() {
        setTitle("Acerca de Glow Me");
        setLayout(null);
        getContentPane().setBackground(rosaSuave);
 
          setIconImage(new ImageIcon("maquillajep.png").getImage());
        
        JTextArea texto = new JTextArea();
        texto.setEditable(false);
        texto.setBackground(Color.WHITE);
        texto.setForeground(textoOscuro);
        texto.setFont(new Font("Serif", Font.PLAIN, 14));
        texto.setBorder(BorderFactory.createLineBorder(rosaPastel, 2));
        texto.setText(
            "ACERCA DE GLOW ME\n\n" +
            "Este sistema fue creado por Maria Alejandra Granada.\n\n" +
            "Glow Me es una aplicación diseñada para ofrecer una\n" +
            "experiencia elegante, intuitiva y funcional para que\n" +
            "puedas elegir tus productos.\n\n" +
            "Gracias por utilizar este software.\n" +
            "Todos los derechos reservados. 💗✨"
        );

        JScrollPane scroll = new JScrollPane(texto);
        scroll.setBounds(20, 20, 350, 200);
        add(scroll);

       
        JButton cerrar = new JButton("Cerrar");
        cerrar.setBounds(140, 230, 100, 30);
        cerrar.setBackground(lilaSuave);
        cerrar.setForeground(textoOscuro);
        cerrar.setBorder(BorderFactory.createLineBorder(doradoSuave, 2));
        cerrar.addActionListener(e -> dispose());
        add(cerrar);

        
        JPanel footer = new JPanel();
        footer.setBackground(rosaPastel);
        footer.setBounds(0, 253, 400, 30);
        footer.setLayout(new GridLayout(1, 1));

        labelFooter = new JLabel("© 2025 Glow Me Cosmetics", SwingConstants.CENTER);
        labelFooter.setForeground(textoOscuro);
        labelFooter.setFont(new Font("Serif", Font.BOLD, 13));

        footer.add(labelFooter);
        add(footer);

        
        setSize(400, 320);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
