import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by duncan on 2/11/17.
 */
public class VisualSynth extends JComponent implements ActionListener {

    private final int[] windowSize;

    public VisualSynth() {
        this.windowSize = new int[]{100, 100};
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
