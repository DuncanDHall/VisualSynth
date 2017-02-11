import javax.swing.*;
import java.awt.*;
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
    public Dimension getPreferredSize() {
        return new Dimension(windowSize[0], windowSize[1]);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // draw
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // update
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Visual FM Synthesizer");
        VisualSynth vs = new VisualSynth();
        window.add(vs);
        window.pack();
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        Timer t = new Timer(100, vs);
        t.start();
    }

}
