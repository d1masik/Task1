package main.java.ua.testing.model.entities;

public enum Styles {
    ROCK("произходять звуки рока"),
    POP("попса."),
    JAZZ("sound of саксофон"),
    RAP("рэпчик под биточек"),
    CLASSIC("красивая классика"),
    METAL("тяжолый метал играет"),
    PUNK("Я ПАНК МНЕ П...рекрасно");
    public String sound;

    Styles(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
