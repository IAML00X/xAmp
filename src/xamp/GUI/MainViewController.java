/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xamp.GUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.MediaPlayer;
import xamp.XAmp;

/**
 * FXML Controller class
 *
 * @author MissJ
 */
public class MainViewController implements Initializable {

    @FXML
    private Button addPlaylist;
    @FXML
    private Button editPlaylist;
    @FXML
    private Button deletePlaylist;
    @FXML
    private Button addNewSong;
    @FXML
    private Button editSong;
    @FXML
    private Button deleteSong;
    @FXML
    private Button closePrg;
    @FXML
    private TextField searchFilter;
    @FXML
    private ImageView fastBcwButton;
    @FXML
    private ImageView searchButton;
    @FXML
    private ImageView fastFrwButton;
    @FXML
    public ImageView playButton;
    @FXML
    private Slider volumeSlider;

    private MediaPlayer mp;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    public void initialize(MouseEvent event) {
        XAmp.playSong();
    }

    /*
    * setting the value for the volumeSlider. 
    * the value is 1 so therefor we have to *100
     */
}
