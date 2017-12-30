package View;

import Controller.ActionListenerForPlay;
import Controller.ActionListenerForStop;
import Controller.ActionListenerForSubmit;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{
    final int WIDTH = 200;
    final int HEIGHT = 250;
    //main
    private GridLayout mainLayout;//main layout
    private FlowLayout flowLayout;
    private JPanel panelForLine;
    private JPanel panelForButtons;
    private JPanel panelForWay;
    private JButton playButton;
    private JButton stopButton;
    private JTextField wayForFile;
    private JButton submitWay;


    public MainFrame () {
        //initialize
        mainLayout = new GridLayout(3, 1);
        flowLayout = new FlowLayout();
        panelForLine = new JPanel();
        panelForButtons = new JPanel();
        panelForWay = new JPanel();
        playButton = new JButton("Play");
        stopButton = new JButton("Stop");
        wayForFile = new JTextField();
        submitWay = new JButton("Open");


        //settings
        panelForLine.setLayout(flowLayout);
        panelForWay.setLayout(flowLayout);
        panelForButtons.setLayout(flowLayout);
        setLayout(mainLayout);

        setSize(WIDTH,HEIGHT);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setLocation(550, 230);

        wayForFile.setColumns(6);

        panelForButtons.add(playButton);
        panelForButtons.add(stopButton);

        panelForWay.add(wayForFile);
        panelForWay.add(submitWay);

        disableAll();

        playButton.addActionListener(new ActionListenerForPlay(this));
        stopButton.addActionListener(new ActionListenerForStop(this));
        submitWay.addActionListener(new ActionListenerForSubmit(this));

        add(panelForLine);
        add(panelForButtons);
        add(panelForWay);



        setVisible(true);

    }

    public void setEnablePlay (){
        stopButton.setEnabled(false);
        playButton.setEnabled(true);
    }

    public void setEnaubleStop () {
        stopButton.setEnabled(true);
        playButton.setEnabled(false);
        submitWay.setEnabled(false);
    }

    public void disableAll () {
        stopButton.setEnabled(false);
        playButton.setEnabled(false);
        submitWay.setEnabled(true);
    }

    public String getWay() {
        return wayForFile.getText();
    }

}
