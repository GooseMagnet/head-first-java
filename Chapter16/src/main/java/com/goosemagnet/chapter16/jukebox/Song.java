package com.goosemagnet.chapter16.jukebox;

public class Song implements Comparable<Song> {
    String title;
    String artist;
    String rating;
    String bpm;

    Song(String t, String a, String r, String b) {
        title = t;
        artist = a;
        rating = r;
        bpm = b;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getRating() {
        return rating;
    }

    public String getBpm() {
        return bpm;
    }

    public String toString() {
        return title + ": " + artist;
    }

    @Override
    public int compareTo(Song s) {
        return title.compareTo(s.getTitle());
    }

    @Override
    public boolean equals(Object song) {
        Song s = (Song) song;
        return getTitle().equals(s.getTitle());
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }
}