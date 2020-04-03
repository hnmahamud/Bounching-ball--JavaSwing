import javax.swing.JFrame;
import java.awt.*;

public class PaintFrame extends JFrame {
    public static final int width = 800;
    public static final int height = 600;
    private PaintPanel paintPanel = new PaintPanel();

    public PaintFrame() {
        Container contentPane = this.getContentPane();
        contentPane.add(paintPanel);
        this.setTitle("Ball Bounce");
        this.setSize(width, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
