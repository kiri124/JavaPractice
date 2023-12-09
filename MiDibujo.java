import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class MiDibujo extends JFrame {
    public MiDibujo() {
        super("Ejemplo Java 2D");
        // Configuración del dibujo aquí
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.draw(new Ellipse2D.Double(50, 50, 100, 100));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MiDibujo());
    }
}
