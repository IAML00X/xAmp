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
public class Song {

    private String path;
    public String name;
    public String artist;
    public String album;

    public Song(String songName, String artistName, String albumName, int trackLength, String path) {
        this.name = songName;
        this.artist = artistName;
        this.album = albumName;
        this.path = path;

    }

    public void setName(String songName) {
        name = songName;
    }

    public String getName() {
        return name;
    }

    public void setArtist(String artistName) {
        artist = artistName;
    }

    public String getArtist() {
        return artist;
    }

    public void setAlbumName(String albumName) {
        album = albumName;
    }

    public String getAlbum() {
        return album;
    }

//    public void setLength(int h, int m, int s) {
//        length = (h * 3600 + m * 60 + s);
//        if (h == 0) {
//            length = (m * 60 + s);
//        }
//    }
//    public int getLength() {
//        return length;
//    }
    public String toString() {
        return "Title: " + getName() + ", Artist: " + getArtist() + ", Album: " + getAlbum();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
