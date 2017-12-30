package Controller;

import View.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Controller.ActionListenerForPlay.playing;

public class ActionListenerForStop implements ActionListener {

    private MainFrame mainFrame;

    public ActionListenerForStop (MainFrame mainFrame){
        this.mainFrame = mainFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        playing.stop();
        mainFrame.disableAll();
    }
}
