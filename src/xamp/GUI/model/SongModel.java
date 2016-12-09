/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xamp.GUI.model;

import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import xamp.BE.Song;

/**
 *
 * @author IAMLUX
 */
public class SongModel {

    /**
     * The observable list, used for data binding the view to the model.
     */
    private final ObservableList<Song> items;

    public SongModel() {
        items = FXCollections.observableArrayList();
    }

    /**
     * Gets the observable list of words.
     *
     * @return
     */
    public ObservableList<Song> getSongs() {
        return items;
    }

    public void setSongs(List<Song> songs) {
        items.clear();
        items.addAll(songs);
    }

    public void addSong(Song song) {
        items.add(song);
    }

}
