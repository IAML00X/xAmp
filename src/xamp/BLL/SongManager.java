/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xamp.BLL;

import java.io.File;
import java.nio.file.Paths;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 *
 * @author IAMLUX
 */
public class SongManager {
    
    MediaPlayer player;

    public void playSong() {

        String musicFileName = "test.mp3";
        Media sound = new Media(new File(musicFileName).toURI().toString());
        Media song = new Media(Paths.get(musicFileName).toUri().toString());
        player = new MediaPlayer(sound);

        player.play();
    }
    
    public void pauseSong() {
        player.pause();
        
    }
    
    public MediaPlayer getMediaPlayer() {
        return player;
    }
}
