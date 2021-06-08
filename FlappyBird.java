import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlappyBird implements ActionListener {
    public static FlappyBird flappyBird;
public final int WIDTH = 1200, HEIGHT = 800;
public Rectangle bird;
public Renderer renderer;
public FlappyBird(){
    JFrame jFrame = new jFrame();
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jFrame.setSize(WIDTH, HEIGHT);
    jFrame.setResizable(false);
    jFrame.setVisible(true);
    renderer = new Renderer();
    Timer timer = new Timer(20, this);
    bird = new Rectangle(WIDTH/2, HEIGHT/2, 20, 2O);
}

public void repaint(Graphics g){
g.setColor(Color.cyan);
g.fillRect(0,0,WIDTH, HEIGHT);

g.setColor(Color.orange.darker());
g.fillRect(0, HEIGHT-150, WIDTH, 150);

g.setColor(Color.green);
g.fillRect(0, HEIGHT-140, WIDTH, 20);

g.setColor(Color.red);
g.fillRect(bird.x, bird.y, bird.width, bird.height);
}
@Override
public void ActionPerformed(ActionEvent e){
    renderer.repaint();
}
    public static void main(String[] args) {
        flappyBird = new FlappyBird();
    }
}