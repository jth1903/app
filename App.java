import javax.swing.JFrame;

class App{

public static void main(String[] args){
        // create a window and set the title in the toolbar
        JFrame window  = new JFrame("Art");
        // When we close the window, stop the app
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create the canvas to draw on
        MyCanvas canvas = new MyCanvas();
        // add the canvas to the window
        window.add(canvas);

        // fit the window size around the components(just our canvas)
        window.pack();
        // don't allow the user to resize the window
        window.setResizable(false);
        // open the window in the center of the screen
        window.setLocationRelativeTo(null);
        // display the window
        window.setVisible(true);
        

    }

}
