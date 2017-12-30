package Controller;

import Controller.Control;
import View.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerForSubmit implements ActionListener {

    private MainFrame mainFrame;
    private String way;
    public static Control control;

    public ActionListenerForSubmit(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        way = mainFrame.getWay();
        control = new Control(mainFrame, way);
        mainFrame.setEnablePlay();
    }


}
