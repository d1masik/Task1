package main.java.ua.testing.model.entities;


import main.java.ua.testing.view.TextConstant;
import main.java.ua.testing.view.View;

public class Music {
    public String name;
    public int duration;
    public Styles style;

    public Music(String name, int duration, Styles style) {
        this.name = name;
        this.duration = duration;
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public Styles getStyle() {
        return style;
    }


    public String getInfo() {
        return View.bundle.getString(TextConstant.TRACK_NAME) + " " + getName() + " "
                + View.bundle.getString(TextConstant.TRACK_STYLE) + " " + getStyle() + " "
                + View.bundle.getString(TextConstant.TRACK_DURATION) + " " + getDuration() + " ";
    }

}
