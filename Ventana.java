import javax.swing.*;
import java.awt.event.*;

public class Ventana {
    public static void main(String args[]) {

        // Crear una ventana principal
        JFrame frame = new JFrame("Mi primer aplicación");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Crear u botón
        JButton button = new JButton("Presioname!");

        // Añadimos acción al botón.
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame, "Hola, me presionaste!!!");
            }
        });

        // Añadir el botónn a la ventana.
        frame.getContentPane().add(button);

        frame.setVisible(true);
    }
}
