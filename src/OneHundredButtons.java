import javax.swing.JFrame;
/*
 * Dawn Myers
 * ITDEV 140 Mequon 2016
 */

/**
 *
 * @author Dawn
 */
public class OneHundredButtons {

    /**
     * @param args the command line arguments
     * Write a program that shows a square frame filled with 100 buttons labeled 1 to 100. 
     * Nothing needs to happen when you press any of the buttons.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new OneHundredButtonsFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
