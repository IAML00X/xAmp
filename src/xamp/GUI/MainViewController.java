/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xamp.GUI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import xamp.BE.Song;
import xamp.BLL.SongManager;
import xamp.GUI.model.SongModel;

/**
 * FXML Controller class
 *
 * @author MissJ
 */
public class MainViewController implements Initializable {

    private SongManager sm;

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
    @FXML
    private Slider volumeSlider;

    private MediaPlayer mp;
    @FXML
    private ImageView searchBtn;

    private SongModel songmodel;
    @FXML
    private TableView<Song> songTbl;
    @FXML
    private TableColumn<Song, String> colSong;
    @FXML
    private TableColumn<Song, String> colArtist;
    @FXML
    private TableColumn<Song, String> colAlbum;
    @FXML
    private TableColumn<Song, String> colLength;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        songmodel = new SongModel();
        songTbl.setItems(songmodel.getSongs());
        colSong.setCellValueFactory(
                new PropertyValueFactory("name"));
        colArtist.setCellValueFactory(
                new PropertyValueFactory("artist"));
    }

    /*
    * setting the value for the volumeSlider. 
    * the value is 1 so therefor we have to *100
     */
    @FXML
    public void handleEnterPressed(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            System.out.println("Heya!");
        }
    }

    @FXML
    public void srcBtnClicked(MouseEvent event) {
        System.out.println("OHAI!");
    }

    @FXML
    public void handleOnButtonActionSong(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddSongView.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        AddSongViewController controller = fxmlLoader.getController();
        controller.setModel(songmodel);
        Stage stage = new Stage();
        stage.setTitle("");
        stage.setScene(new Scene(root1));
        stage.show();

    }

    @FXML
    public void handleOnButtonActionPlaylist(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddPlaylistView.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("");
        stage.setScene(new Scene(root1));
        stage.show();

    }

    @FXML
    private void initialize(MouseEvent event) {
    }

    @FXML
    public void closeApp(ActionEvent event) {
        Platform.exit();
    }

}
