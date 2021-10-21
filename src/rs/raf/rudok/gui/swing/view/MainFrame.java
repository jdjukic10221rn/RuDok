package rs.raf.rudok.gui.swing.view;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private static MainFrame instance = null;

    private MainFrame(){

    }

    private void initialise(){
        setTitle("RuDok");



    }

    public static MainFrame getInstance(){
        if(instance == null) {
            instance = new MainFrame();
            instance.initialise();
        }
        return instance;
    }
}
