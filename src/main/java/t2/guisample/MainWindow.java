package t2.guisample;

import t2.ObservableModel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by vovan_000 on 15.05.2016.
 */
public class MainWindow {
    private static void createAndShowGUI() {
        ObservableModel observableModel = new ObservableModel();

        CustomSlider customSlider = new CustomSlider();
        CustomSlider customSlider2 = new CustomSlider();

        CustomCheckBox customCheckBox = new CustomCheckBox();
        customCheckBox.setText("Is muted ?");

        observableModel.bind("sound", customSlider);
        observableModel.bind("sound", customSlider2);
        observableModel.bind("sound", customCheckBox);


        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();
        jPanel.add(customSlider2);


        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(customCheckBox);
        verticalBox.add(customSlider);
        verticalBox.add(jPanel);

        frame.getContentPane().add(verticalBox);

        //Display the window.
        frame.setSize(640, 480);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
