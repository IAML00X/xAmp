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

    public String name;
    public String artist;
    public String album;
    public int length;

    public Song(String songName, String artistName, String albumName, int trackLength) {
        this.name = songName;
        this.artist = artistName;
        this.album = albumName;
        this.length = trackLength;
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

    public void setLength(int h, int m, int s) {
        length = (h * 3600 + m * 60 + s);
        if (h == 0) {
            length = (m * 60 + s);
        }
    }

    public int getLength() {
        return length;
    }

    public String toString() {
        return "Title: " + getName() + ", Artist: " + getArtist() + ", Album: " + getAlbum() + "Track Length" + getLength();
    }
}
