import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class JavaGUI extends JFrame implements KeyListener {

    JLabel title;
    JLabel balance;
    JTextField fifaPointsAmount;

    JPanel panelTop;
    JPanel panelRight;
    JPanel panelBottom;
    JPanel panelLeft;
    JPanel packsPanel;
    JPanel panelCenter;

    JButton exitButton;
    JButton packButton1;
    JButton packButton2;
    JButton buyFifaPoints;

    int fifaPoints;

    public JavaGUI() throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {

        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

        this.addKeyListener(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("FIFA Pack Opener");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(true);

        panelTop = new JPanel();
        panelRight = new JPanel();
        panelBottom = new JPanel();
        panelLeft = new JPanel();
        panelCenter = new JPanel();

        title = new JLabel();
        title = new JLabel("FIFA Pack Opener");
        title.setFont(new Font("Serif", Font.BOLD, 80));

        exitButton = new JButton("Exit");
        exitButton.addActionListener(e -> System.exit(0));
        exitButton.setBackground(Color.decode("#9164ed"));
        exitButton.addMouseListener(new CustomMouseListener());
        exitButton.setFont(new Font("Serif", Font.PLAIN, 60));
        exitButton.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));

        buyFifaPoints = new JButton("Buy Points");

        packsPanel = new JPanel();

        balance = new JLabel();
        balance.setText("Your Balance: " + fifaPoints);
        balance.setFont(new Font("Serif", Font.PLAIN, 30));
        panelCenter.add(balance);

        fifaPointsAmount = new JTextField();
        fifaPointsAmount.setColumns(10);
        fifaPointsAmount.setFont(new Font("Serif", Font.PLAIN, 30));
        panelCenter.add(fifaPointsAmount);

        buyFifaPoints.addMouseListener(new CustomMouseListener());
        buyFifaPoints.setFont(new Font("Serif", Font.PLAIN, 30));
        buyFifaPoints.setBackground(Color.decode("#9164ed"));
        buyFifaPoints.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));

        panelCenter.add(buyFifaPoints);



        panelTop.add(title);
        panelBottom.add(exitButton);

        ImageIcon icon1 = new ImageIcon("pack1.png");
        ImageIcon icon2 = new ImageIcon("pack2.png");

        packButton1 = new JButton();
        packButton2 = new JButton();
        packButton1.setPreferredSize(new Dimension(300, 470));
        packButton2.setPreferredSize(new Dimension(300, 470));
        packButton1.setBackground(Color.decode("#aa8aeb"));
        packButton2.setBackground(Color.decode("#aa8aeb"));
        packButton1.add(new JLabel(icon1));
        packButton2.add(new JLabel(icon2));
        packButton1.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
        packButton2.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
        packButton1.addMouseListener(new CustomMouseListener());
        packButton2.addMouseListener(new CustomMouseListener());

        packsPanel.add(packButton1);
        packsPanel.add(packButton2);

        packsPanel.setBackground(Color.decode("#7134eb"));
        panelTop.setBackground(Color.decode("#7134eb"));
        panelRight.setBackground(Color.decode("#7134eb"));
        panelBottom.setBackground(Color.decode("#7134eb"));
        panelLeft.setBackground(Color.decode("#7134eb"));


        this.add(panelTop, BorderLayout.NORTH);
        panelRight.add(packsPanel, BorderLayout.CENTER);
        this.add(panelRight, BorderLayout.EAST);
        this.add(panelBottom, BorderLayout.SOUTH);
        this.add(panelLeft, BorderLayout.WEST);
        this.add(panelCenter, BorderLayout.CENTER);
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
