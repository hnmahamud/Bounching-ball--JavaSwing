import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PaintPanel extends JPanel implements MouseListener, MouseMotionListener, KeyListener, ActionListener {

    private Timer timer;
    public static final int timeLapse = 10;
    private int x = 400;
    private int y = 300;
    private int dx = 5;
    private int dy = 5;
    
    private int x1 = 400;
    private int y1 = 300;
    private int dx1 = 5;
    private int dy1 = 5;

    public PaintPanel() {
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
        g.fillOval(x, y, 30, 30);
        g.setColor(Color.BLUE);
        g.fillOval(x1, y1, 30, 30);
    }

    public void actionPerformed(ActionEvent e) {
        x += dx;
        y += dy;
        
        x1 += dx1;
        y1 += dy1;
        
        if (x < 0 || x > 800 - 30) {
            dx = -dx;
        } else if (y < 0 || y > 600 - 30) {
            dy = -dy;
        }else if (x1 < 0 || x1 > 800 - 30) {
            dx1 = -dx1;
        } else if (y1 < 0 || y1 > 600 - 30) {
            dy1 = -dy1;
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
