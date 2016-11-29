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
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
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
    private ImageView playButton;
<<<<<<< HEAD
=======
  
  
  
>>>>>>> origin/master

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
<<<<<<< HEAD
    }
=======
    }    
    
>>>>>>> origin/master

    @FXML
    public void initialize(MouseEvent event) 
    {
<<<<<<< HEAD
        XAmp.playSong();
=======
       
>>>>>>> origin/master
    }

}
