/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xamp.GUI;

import java.awt.Desktop;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;


/**
 * FXML Controller class
 *
 * @author MissJ
 */
public class AddSongViewController implements Initializable {
    
 
    
    
    private AnchorPane root;
    @FXML
    private javafx.scene.control.Button closeButton;
    @FXML
    private TextField songTitle;
    @FXML
    private TextField songArtist;
    @FXML
    private ChoiceBox<?> chooseGenre;
    @FXML
    private Button saveSong;
    @FXML
    private TextField songTine;

    private Desktop desktop = Desktop.getDesktop();
    @FXML
    private TextField songPath;
    
    
    
   
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    

    public void addSong()
    {
        String path = songPath.getText();
    }
    
    
        @FXML
    private void chooseFile(ActionEvent event)
    { 
        try{
        FileChooser fileChooser = new FileChooser();
        Window stage = null;
        File file = fileChooser.showOpenDialog(stage);
        songPath.setText(file.getPath());
        }
        catch (Exception e)
                {
                    
                }
        
     
 

       
  
     
      
        // here we need a code that can open the documents
    
    }

    public void start(final Stage stage)
    {
        stage.setScene(new Scene(root));
        stage.show();
    }

//   // Dont know if we need 
//    private void printLog(TextArea textArea, List<File> files) 
//    {
//        if (files == null || files.isEmpty()) {
//            return;
//        }
//        for (File file : files) {
//            textArea.appendText(file.getAbsolutePath() + "\n");
//        }
//    }
// // Dont know if we need
//    private void openFile(File file) 
//    {
//        try {
//            this.desktop.open(file);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
 // dont know if we need
    public static void main(String[] args) 
    {
        Application.launch(args);
    }
    
    
    
    //  Here we save the song we choose 
    public void saveSong (ActionEvent event)
    {
     
    }
    
    
    
    
    @FXML
    public void closeButtonAction (ActionEvent event)
    {
       Stage stage = (Stage) closeButton.getScene().getWindow();
       stage.close();
    }


    
}
