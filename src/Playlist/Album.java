package Playlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
public class Album {
    private String name, artist;
    private ArrayList<Song> songs;

    public Album(String nameAlbum, String nameArtist){
        this.name = nameAlbum;
        this.artist = nameArtist;
        songs = new ArrayList<Song>();
    }
    public boolean addSong(String title,double duration){
        Song now = findSong(title);
        if(now == null){
            songs.add(new Song(title,duration));
            return true;
        }else{
            return false;
        }

    }
    private Song findSong(String title){
        for(Song plate: songs){
            if(Objects.equals(plate.getTitle(), title)){
                return plate;
            }
        }
        return null;
    }
    public boolean addToPlayList(String trackName, LinkedList<Song> now){
        Song now2 = findSong(trackName);
        if(now2 != null){
            return now.add(now2);

        }else{
            return false;
        }

    }
    public void printIt(){
        for(Song plate: songs){
            System.out.println(songs.indexOf(plate)+": "+plate.toString());
        }
        System.out.println(" ");
    }
    public boolean addToPlayList(int num,LinkedList<Song> now){
        try{
            Song now2 = songs.get(num);
            return now.add(now2);
        }catch(IndexOutOfBoundsException e){
            return false;
        }

    }
}