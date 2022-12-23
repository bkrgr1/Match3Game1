import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameLevel extends JPanel implements Runnable, MouseListener {

    Game game;

    public final long NANOSECONDS_PER_SECOND = 1000000000;
    public final int FPS_TARGET = 60;
    public final int UPDATE_TARGET = 20;

    public final long UPDATE_INTERVAL = NANOSECONDS_PER_SECOND / UPDATE_TARGET;
    public final long DRAW_INTERVAL = NANOSECONDS_PER_SECOND / FPS_TARGET;

    public GameLevel(Game game) {
        this.game = game;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }
}