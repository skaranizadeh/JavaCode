package dev.moj;

public class Album {

    private String name;
    private String artist;
    private java.util.ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new java.util.ArrayList<>();
    }

    public boolean addSong(String songTitle, double duration) {
        if (findSong(songTitle) == null) {
            return songs.add(new Song(songTitle, duration));
        }
        return false;
    }

    private Song findSong(String songTitle) {
        for (Song song : songs) {
            if (song.getTitle().equals(songTitle)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, java.util.LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if ((index >= 0 ) && (index < songs.size()))  {
                return playList.add(songs.get(index));
        }
        return false;
    }

    public boolean addToPlayList(String songTitle, java.util.LinkedList<Song> playList) {
        if (findSong(songTitle) != null) {
            return playList.add(findSong(songTitle));
        }
        return false;
    }

}
