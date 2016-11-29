/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xamp.BE;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author IAMLUX
 */
public class Playlist {

    private List<Song> songList;
    private String playlistName;
    private int count;

    public Playlist() {
        songList = new ArrayList<Song>();
    }

    public void setPlaylistName() {
        this.playlistName = playlistName;
    }

    public String getPlaylistName() {
        return playlistName;
    }

}
