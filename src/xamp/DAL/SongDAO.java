/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xamp.DAL;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import xamp.BE.Song;

/**
 *
 * @author IAMLUX
 */
public class SongDAO {

    public ArrayList<Song> readObjectData(String fileName) throws FileNotFoundException {
        ArrayList<Song> songList = new ArrayList<Song>();

        FileInputStream fis = new FileInputStream(fileName);
        BufferedInputStream bis = new BufferedInputStream(fis);
        try (ObjectInputStream ois = new ObjectInputStream(bis)) {

            songList = (ArrayList<Song>) ois.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            // Handle exception
        }

        return songList;
    }
}
