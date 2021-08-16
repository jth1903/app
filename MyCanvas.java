import java.awt.*;
import java.awt.Dimension;
import javax.swing.JPanel;

class MyCanvas extends JPanel {

    public MyCanvas() {
        // set the canvas size
        setPreferredSize(new Dimension(900, 600));
        // set the canvas background color
        setBackground(Color.white);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Paintbrush myBrush = new Paintbrush(g);

        myBrush.drawSky();
        myBrush.drawGrass();
        myBrush.drawMountains();
        myBrush.drawTree();
    }

}