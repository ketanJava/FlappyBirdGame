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
public void addColumn(boolean start){
        int space = 300;
        int width = 100;
        int height = 50+ rand.nextInt(300);
        if(start){
            columns.add(new Rectangle(WIDTH + width + columns.size()*300,HEIGHT- height - 120, width, height));
            columns.add(new Rectangle(WIDTH+width+(columns.size() -1)*300, 0, width, HEIGHT-height-space));
        }
        else {
            columns.add(new Rectangle(columns.get(columns.size() -1).x + 600, HEIGHT - height - 120, width, height));
            columns.add(new Rectangle(columns.get(columns.size() -1).x,0, width, HEIGHT - height - space));
        }
    }
    public void paintColumn(Graphics g, Rectangle column){
        g.setColor(Color.green.darker());
        g.fillRect(column.x, column.y, column.width, column.height);
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