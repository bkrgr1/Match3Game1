
import javax.swing.*;

/**
 * Das Spiel
 */
public class Game extends JFrame {

    static Game game = null;
    boolean isRunning;

    final static int GAME_INIT = 1;
    final static int GAME_MENU = 2;
    final static int GAME_RUN = 3;
    final static int GAME_AFTER = 4;
    final static int GAME_SHUTDOWN = 5;
    final static int GAME_BEFORE = 6;

    int game_state = GAME_INIT;

    /**
     * Constructor
     * JFrame direkt als Vollbild oeffnen:
     */
    public Game() {
        this.setTitle("Match3 Game-1");
        this.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

    }

    private void performGame() {

        while (game_state != GAME_SHUTDOWN) {
            switch (game_state) {
                case GAME_INIT:
                    init();
                    break;
                case GAME_MENU:
                    showMenu();
                    break;
                case GAME_BEFORE:
                    showBefore();
                    break;
                case GAME_RUN:
                    runLevel();
                    break;
                case GAME_AFTER:
                    showAfter();
                    break;
                case GAME_SHUTDOWN:
                    shutdown();
                    break;
                default:
                    init();
                    break;
            }
        }

    }

    /**
     * Game initialisieren
     */
    private void init() {

        game_state = GAME_MENU;
    }

    /**
     * Game-Menü anzeigen
     */
    private void showMenu() {
        this.setVisible(true);

        game_state = GAME_BEFORE;
    }

    private void showBefore() {

        game_state = GAME_RUN;
    }

    /**
     * Ein Level ausführen
     */
    private void runLevel() {

        GameLevel level1 = new Level1(game);
        game.add(level1);
        game.pack();
        level1.run();

        game_state = GAME_AFTER;
    }

    /**
     * Menü nach einem Level anzeigen
     */
    private void showAfter() {

        game_state = GAME_MENU;
    }

    /**
     * Alle Resourcen wieder freigeben
     */
    private void shutdown() {

    }

    /**
     * Die Main-Methode
     * 
     * @param args
     */
    public static void main(String[] args) {
        game = new Game();
        game.performGame();
    }
}