import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;

public class HeartApplet extends Applet {

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        setSize(300, 300);

        // Define a cor do coração
        g2d.setColor(Color.RED);

        // Cria o coração usando uma combinação de elipses e um polígono
        GeneralPath heart = new GeneralPath();
        
        // Adiciona elipses para criar o coração
        Ellipse2D.Double leftCircle = new Ellipse2D.Double(50, 50, 100, 100);
        Ellipse2D.Double rightCircle = new Ellipse2D.Double(150, 50, 100, 100);
        Rectangle2D.Double bottomRect = new Rectangle2D.Double(50, 100, 200, 200);
        
        // Desenha o coração
        heart.append(leftCircle.getPathIterator(null), false);
        heart.append(rightCircle.getPathIterator(null), false);
        heart.append(bottomRect.getPathIterator(null), false);
        
        g2d.fill(heart);
    }
}
