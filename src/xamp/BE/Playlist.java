/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xamp.BE;

/**
 *
 * @author IAMLUX
 */
public class Playlist {

    private Song[] songs;
    private String playlistName;
    private int count;

    public Playlist() {
        songs = new Song[10];
        count = 0;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName() {
        this.playlistName = playlistName;
    }

}
