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
        exitButton.addActionListener(e -> System.exit(0));
        exitButton.setFont(new Font("Serif", Font.PLAIN, 60));
        packsPanel = new JPanel();

        panelTop.add(title);
        panelBottom.add(exitButton);

        ImageIcon icon1 = new ImageIcon("pack1.png");
        ImageIcon icon2 = new ImageIcon("pack2.png");

        packButton1 = new JButton();
        packButton2 = new JButton();

        packButton1.setPreferredSize(new Dimension(300, 470));
        packButton2.setPreferredSize(new Dimension(300, 470));

        packButton1.add(new JLabel(icon1));
        packButton2.add(new JLabel(icon2));

        packsPanel.add(packButton1);
        packsPanel.add(packButton2);

       /* panelTop.setBackground(Color.GRAY);
        panelMiddle.setBackground(Color.RED);
        panelBottom.setBackground(Color.BLUE);*/


        this.add(panelTop, BorderLayout.NORTH);
        panelMiddle.add(packsPanel, BorderLayout.CENTER);
        this.add(panelMiddle, BorderLayout.CENTER);
        this.add(panelBottom, BorderLayout.SOUTH);
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
