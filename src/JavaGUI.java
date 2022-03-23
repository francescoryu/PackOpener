import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class JavaGUI extends JFrame implements KeyListener {

    JPanel panelTop;
    JPanel panelMiddle;
    JPanel panelBottom;
    JLabel title;
    JButton exitButton;
    JButton openPackButton;
    JPanel packsPanel;
    JButton packButton1;
    JButton packButton2;

    public JavaGUI() throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {

        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

        this.addKeyListener(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("FIFA Pack Opener");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(true);

        panelTop = new JPanel();
        panelMiddle = new JPanel();
        panelBottom = new JPanel();
        title = new JLabel();
        title = new JLabel("FIFA Pack Opener");
        title.setFont(new Font("Serif", Font.PLAIN, 40));
        exitButton = new JButton("Exit");
        openPackButton = new JButton("Open Pack");
        exitButton.addActionListener(e -> System.exit(0));
        packsPanel = new JPanel();

        panelTop.add(title);
        panelBottom.add(exitButton);
        panelBottom.add(openPackButton);

        ImageIcon icon1 = new ImageIcon("pack1.png");
        ImageIcon icon2 = new ImageIcon("pack2.png");

        packButton1 = new JButton();
        packButton2 = new JButton();

        packButton1.setPreferredSize(new Dimension(300, 470));
        packButton2.setPreferredSize(new Dimension(300, 470));

        packButton1.add(new JLabel(icon1));
        packButton2.add(new JLabel(icon2));

        panelMiddle.add(packButton1);
        panelMiddle.add(packButton2);

        panelTop.setBackground(Color.GRAY);
        panelMiddle.setBackground(Color.RED);
        panelBottom.setBackground(Color.BLUE);



        //TEST//TTT

        this.add(panelTop, BorderLayout.NORTH);
        this.add(panelMiddle, BorderLayout.CENTER);
        this.setVisible(true);

    }

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        new JavaGUI();
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
