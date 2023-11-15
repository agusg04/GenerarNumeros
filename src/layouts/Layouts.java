/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package layouts;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author agtsa
 */
public class Layouts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame ventana = new JFrame("Generador de numeros aleatorios");
        ventana.setSize(500, 500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un JPanel con FlowLayout para alinear elementos horizontalmente
        JPanel mainPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        ventana.add(mainPanel);

        JLabel label = new JLabel("Generador Numeros:");
        mainPanel.add(label);

        JPanel botonesPanel = new JPanel();
        botonesPanel.setLayout(new BoxLayout(botonesPanel, BoxLayout.Y_AXIS));
        mainPanel.add(botonesPanel);

        ButtonGroup buttonGroup = new ButtonGroup();

        JRadioButton radio1 = new JRadioButton("entre 0 y 100");
        JRadioButton radio2 = new JRadioButton("entre 100 y 200");
        JRadioButton radio3 = new JRadioButton("entre 200 y 500");

        buttonGroup.add(radio1);
        buttonGroup.add(radio2);
        buttonGroup.add(radio3);

        botonesPanel.add(radio1);
        botonesPanel.add(Box.createVerticalStrut(5));
        botonesPanel.add(radio2);
        botonesPanel.add(Box.createVerticalStrut(5));
        botonesPanel.add(radio3);
        botonesPanel.add(Box.createVerticalStrut(5));

        JButton button = new JButton("Generar");
        botonesPanel.add(button);
        botonesPanel.add(Box.createVerticalStrut(10));

        JTextField numeroAlea = new JTextField();
        botonesPanel.add(numeroAlea);
        botonesPanel.add(Box.createVerticalStrut(10));

        button.addActionListener((ActionEvent e) -> {
            if (radio1.isSelected()) {
                int numAleatorio = new Random().nextInt(101);
                numeroAlea.setText(String.valueOf(numAleatorio));
            } else if (radio2.isSelected()) {
                int numAleatorio = new Random().nextInt(101) + 100;
                numeroAlea.setText(String.valueOf(numAleatorio));
            } else if (radio3.isSelected()) {
                int numAleatorio = new Random().nextInt(301) + 200;
                numeroAlea.setText(String.valueOf(numAleatorio));
            }
        });

        ventana.setVisible(true);

    }

}
