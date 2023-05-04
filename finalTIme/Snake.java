import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class Snake extends JPanel implements ActionListener, KeyListener {

    JTextField tf1;
    int x, y;
    Timer timer;
    int a, b = 50;
    int xVel = 1;
    int yVel = 1;

    public Snake() {

        setBackground(Color.CYAN);
        setFocusable(true);
        addKeyListener(this);
        Timer timer = new Timer(50, this);
        timer.start();
       // ImageIcon image = new ImageIcon("Snake2.jpg");
        //setIconImage(image.getImage()); // Not applicable to JPanel

        JPanel p1 = new JPanel(null);
        this.setBackground(Color.YELLOW);
        this.setBounds(100, 600, 100, 100);
        this.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3));

        Font font = new Font("Arial", Font.BOLD, 13);

        JLabel l1 = new JLabel("Score: ");
        l1.setBounds(3, -37, 100, 100);
        this.add(l1);

        Integer a = 5;
        tf1 = new JTextField(String.valueOf(a), 3);
        tf1.setBounds(45, 30, 30, 17);
        tf1.setFont(font);

        tf1.setBorder(null);
        tf1.setOpaque(false);
        tf1.setBackground(new Color(0, 0, 0, 0));

        this.add(tf1);
        Random rand = new Random();
        x = rand.nextInt(0,100);
        y = rand.nextInt(0,100);

        this.setFont(font);

        }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(x, y, 20, 20);
        g.setColor(Color.BLACK);
        g.fillOval(a, b, 20, 20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        a = a + xVel;
        b = b + yVel;
        repaint();
    }

    public void up() {
        yVel = -1;
        xVel = 0;
    }

    public void down() {
        yVel = 1;
        xVel = 0;
    }

    public void left() {
        yVel = 0;
        xVel = -1;
    }

    public void right() {
        yVel = 0;
        xVel = 1;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_W) {
            up();
        }
        if (code == KeyEvent.VK_S) {
            down();
        }
        if (code == KeyEvent.VK_A) {
            left();
        }
        if (code == KeyEvent.VK_D) {
            right();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Snake");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Snake());
        frame.setSize(300,300);
         ImageIcon image = new ImageIcon("Snake2.jpg");
        frame.setIconImage(image.getImage()); // Not applicable to JPanel

        // frame.pack();
        frame.setVisible(true);
        //Snake s = new Snake();
    }
}

