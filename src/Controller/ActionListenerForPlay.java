package Controller;

import View.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerForPlay extends Thread implements ActionListener {

    static Playing playing;
    private MainFrame mainFrame;

    public ActionListenerForPlay (MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       playing = new Playing();
       playing.start();
       mainFrame.setEnaubleStop();

    }
}
