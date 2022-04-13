
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kingo
 */
public class musicPlayer {
    static musicPlayer player = new musicPlayer();
    static Clip clip;
    private musicPlayer(){
    
    }
    public static musicPlayer getInstance(){
        return player;
    }
    public static void loadMusic(String filePath){
        try{
            File musicPath = new File(filePath);
            if(musicPath.exists()){
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                clip = AudioSystem.getClip();
                clip.open(audioInput);
                System.out.println("Initialized");
            }
        }catch(Exception err){
            System.out.println(err.toString());
        }
    }
}
