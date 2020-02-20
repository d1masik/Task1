package main.java.ua.testing.controller.service;


import main.java.ua.testing.model.entities.Music;


import java.util.ArrayList;
import java.util.List;

public class MusicService {
    public static List<Music> musicList;
    public int musicListDuration;

    public MusicService(List<Music> musicList) {
        MusicService.musicList = musicList;
    }


    public int trackListDuration() {
        musicListDuration = 0;
        for (Music music : MusicService.musicList) {
            musicListDuration += music.getDuration();
        }
        return musicListDuration;
    }


    public void sortByStyle() {
        Music temp;
        boolean check = false;
        while (!check) {
            check = true;
            for (int i = 0; i < MusicService.musicList.size() - 1; i++) {
                if (MusicService.musicList.get(i).getStyle().compareTo(MusicService.musicList.get(i + 1).getStyle()) > 0) {
                    temp = MusicService.musicList.get(i);
                    MusicService.musicList.set(i, MusicService.musicList.get(i + 1));
                    MusicService.musicList.set(i + 1, temp);
                    check = false;
                }
            }
        }
    }


    public List<String> findByRange(int from, int to) {
        ArrayList<String> rangedList = new ArrayList<>();
        for (Music music : MusicService.musicList) {
            if (music.getDuration() >= from && music.getDuration() <= to) {
                rangedList.add(music.getInfo());
            }
        }
        return rangedList;
    }


    public List<String> playMusic() {
        ArrayList<String> played = new ArrayList<>();
        for (Music music : MusicService.musicList) {
            played.add(music.style.getSound());
        }
        return played;
    }


    public ArrayList<String> trackInfo() {
        ArrayList<String> tracksInfo = new ArrayList<>();
        for (Music music : MusicService.musicList) {
            tracksInfo.add(music.getInfo());
        }
        return tracksInfo;
    }
}

