package main.java.ua.testing.model;

import main.java.ua.testing.controller.service.MusicService;
import main.java.ua.testing.model.entities.Music;
import main.java.ua.testing.model.entities.SoundTrack;
import main.java.ua.testing.model.entities.Styles;

import java.util.ArrayList;
import java.util.List;

public class Disc {
    public MusicService burnDisc(){
        List<Music> playlist = new ArrayList<>();
        playlist.add(new Music("Asking Alexandria - Where Did It Go",193, Styles.METAL));
        playlist.add(new SoundTrack("Bring Me The Horizon - Ludens", 280, Styles.ROCK, "Death Stranding"));
        playlist.add(new Music("Sum 41 - Still Waiting",158 ,Styles.PUNK ));
        playlist.add(new SoundTrack("Ed Sheeran - I See Fire", 300, Styles.POP," The Hobbit - The Desolation Of Smaug"));
        playlist.add(new Music("Louis Armstrong  - What a Wonderful World", 132, Styles.JAZZ));
        playlist.add(new Music("Нервы - Самый Дорогой Человек", 202, Styles.ROCK));
        playlist.add(new Music("Eminem - Rap God ",370,Styles.RAP));
        playlist.add(new SoundTrack("Disney - Let it go",218,Styles.POP,"Frozen"));
        playlist.add(new Music("Кис-Кис - Личка",210, Styles.PUNK));
        playlist.add(new Music("Antonio Vivaldi - Four Seasons(Summer - III)",318,Styles.CLASSIC));
        return new MusicService(playlist);
    }

}
