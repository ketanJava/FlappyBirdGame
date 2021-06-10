package flappyBird;

import javax.swing.*;
import java.awt.*;

//Renderer class to inherit the paint properties of JPanel class and perform the paint job.
public class Renderer extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        FlappyBird.flappyBird.repaint(g);
    }
}
