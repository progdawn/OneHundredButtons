import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.GridLayout;
/*
 * Dawn Myers
 * ITDEV 140 Mequon 2016
 */

/**
 *
 * @author Dawn
 */
public class OneHundredButtonsFrame extends JFrame{
    
    private static final int NUM_BUTTONS = 100;
    private static final int NUM_ROWS = 10;
    private static final int NUM_COLS = 10;
    private GridLayout buttonsGrid;
    
    public OneHundredButtonsFrame()
    {
        Container pane = getContentPane();
        pane.setLayout(new GridLayout(NUM_ROWS, NUM_COLS));
        setTitle("One Hundred Buttons!");
        
        for(int i = 0; i < NUM_BUTTONS; i++)
        {
            JButton button = new JButton(Integer.toString(i+1));
            pane.add(button);
        }
        
        pack();
        setVisible(true);
    }
}
