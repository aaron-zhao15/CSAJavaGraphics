package GraphicsUnit1;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import javax.swing.JFrame;

public class GraphicsRunner extends JFrame {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public GraphicsRunner(int i) {
        super("Graphics Runner");

        setSize(WIDTH, HEIGHT);

        if (i == 0) {
            getContentPane().add(new ShapePanel());
        } else if (i == 1) {
            getContentPane().add(new SmileyFace());
        } else if (i == 2) {
            getContentPane().add(new Robot());
        } else if (i == 3) {
            getContentPane().add(new BigHouse());
        }

        //add other classes to run them 
        //BigHouse, Robot, or ShapePanel 
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        GraphicsRunner runShape = new GraphicsRunner(0);
        GraphicsRunner runSmiley = new GraphicsRunner(1);
        GraphicsRunner runRobot = new GraphicsRunner(2);
        GraphicsRunner runHouse = new GraphicsRunner(3);
    }
}
