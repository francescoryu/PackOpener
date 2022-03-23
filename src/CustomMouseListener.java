import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;


public class CustomMouseListener extends JFrame implements java.awt.event.MouseListener {
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
        e.getComponent().setBackground(Color.decode("#aa8aeb"));
        e.getComponent().setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        e.getComponent().setBackground(Color.decode("#9164ed"));
    }
}