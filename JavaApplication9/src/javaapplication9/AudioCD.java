/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication9;

/**
 *
 * @author Virus
 */
public class AudioCD extends CD {

    String artist;
    int trackList;

    String getArtist() {
        return artist;
    }

    void setArtist(String _artist) {
        artist = _artist;

    }

    int getTrackList() {
        return trackList;
    }

    void setTrackList(int _trackList) {
        trackList = _trackList;

    }

    @Override
    public String toString() {
        String n2 = System.getProperty("line.separator");
        return getClass().getSimpleName() + "title: " + title + n2 + "price: " + price
                + "artist: " + artist + n2 + "trackList" + trackList;

    }
}
