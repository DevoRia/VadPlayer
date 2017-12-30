package Controller;

import javazoom.jl.decoder.JavaLayerException;

import static Controller.ActionListenerForSubmit.control;

public class Playing extends Thread implements Runnable {

    @Override
    public void run() {
        try {
            control.ap.play();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}
