import javax.swing.*;

public class FlappyBird {
    public static FlappyBird flappyBird;
public final int WIDTH = 1200, HEIGHT = 800;
public Renderer renderer;
public FlappyBird(){
    JFrame jFrame = new jFrame();
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jFrame.setSize(WIDTH, HEIGHT);
    jFrame.setResizable(false);
    jFrame.setVisible(true);
    renderer = new Renderer();
    Timer timer = new Timer(20, this);
}

public void repaint(Graphics g){

}
    public static void main(String[] args) {
        flappyBird = new FlappyBird();
    }
}