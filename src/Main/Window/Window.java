package Main.Window;

import Main.Engine.EngineConfig;

import javax.swing.*;

public class Window {
    public void CreateWindow(String title, int width, int heigth, boolean isFullscreen) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle(title);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(width, heigth);
        jFrame.setVisible(true);
        if (isFullscreen = true) {
            jFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            jFrame.setUndecorated(true);
            jFrame.setVisible(true);
        }
    }
}
