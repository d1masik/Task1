package main.java.ua.testing.model.entities;


import main.java.ua.testing.view.TextConstant;
import main.java.ua.testing.view.View;

public class SoundTrack extends Music {
    public final String product;

    public SoundTrack(String name, int duration, Styles style, String product) {
        super(name, duration, style);
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                View.bundle.getString(TextConstant.SOUNDTRACK_PRODUCT) + " " + getProduct();
    }
}
