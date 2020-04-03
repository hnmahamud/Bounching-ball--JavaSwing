import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class PaintPanel extends JPanel implements MouseListener, MouseMotionListener, KeyListener, ActionListener {

    private Timer timer;
    public static final int timeLapse = 10;
    private int[] x = new int [10];
    private int[] y = new int [10];
    private int[] dx = new int [10];
    private int[] dy = new int [10];
    
    private Random random = new Random();

    public PaintPanel() {
        for (int i = 0; i < 10; i++) {
            x[i] = random.nextInt(800);
            y[i] = random.nextInt(600);
            dx[i] = 5;
            dy[i] = 5;
        }
        this.setFocusable(true);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.requestFocus();
        this.addKeyListener(this);
        timer = new Timer(timeLapse, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        
        for (int i = 0; i < 10; i++) {
            g.fillOval(x[i], y[i], 30, 30);
        }
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            x[i] += dx[i];
            y[i] += dy[i];
            if (x[i] < 0 || x[i] > 800 - 30) {
                dx[i] = -dx[i];
            } else if (y[i] < 0 || y[i] > 600 - 30) {
                dy[i] = -dy[i];
            }    
        }
        
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
