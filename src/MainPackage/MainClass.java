package MainPackage;

import javax.swing.*;

public class MainClass {

    public MainClass() {
        JFrame frame = new JFrame();
        GamePanel gamePanel = new GamePanel();

    	System.out.println("test3");
        frame.add(gamePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Snacke Game");
        frame.setLocationRelativeTo(null);

    	System.out.println("test3");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MainClass();
    }
}
