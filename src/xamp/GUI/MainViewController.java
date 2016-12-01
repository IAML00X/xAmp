/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xamp.GUI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
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
    private Label fastBcwButton;
    @FXML
    private Label searchButton;
    @FXML
    private Label fastFrwButton;
    @FXML
    public Label playButton;
   
 
    
 

    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {

    }

    @FXML
    public void initialize(MouseEvent event) 
    {
        XAmp.playSong();
    }

    @FXML
    public void handleOnButtonAction(ActionEvent event) throws IOException
    {
        
       FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddSongView.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setTitle("Add Song Window");
       stage.setScene(new Scene(root1));
       stage.show();
 
          
        
    }
    
  
    

}
