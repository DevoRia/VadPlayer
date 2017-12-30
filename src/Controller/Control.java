package Controller;

import View.MainFrame;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.AudioDevice;
import javazoom.jl.player.JavaSoundAudioDevice;
import javazoom.jl.player.advanced.AdvancedPlayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Control {

    private InputStream inputStream;
    AudioDevice device;
    public AdvancedPlayer ap;

    public Control (MainFrame mainFrame, String file){
        try {
            inputStream = new FileInputStream(file);
            device = new JavaSoundAudioDevice();
            ap = new AdvancedPlayer(inputStream,device);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }

    }
}
