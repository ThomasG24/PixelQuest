package org.example;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;

public class PixelQuest extends YaegerGame {
    private int totaalAantalMuntjes;

    public static void main( String[] args ) {
        launch(args);
    }

    @Override
    public void setupGame() {
        setGameTitle("PixelQuest");
        setSize(new Size(800, 600));
    }

    @Override
    public void setupScenes() {
        addScene(0, new BeginScherm(this));
        addScene(1, new SpelScherm(this));
        addScene(2, new Eindscherm(this));
    }

    public int getTotaalAantalMuntjes() {
        return totaalAantalMuntjes;
    }

    public void setTotaalAantalMuntjes(int totaalAantalMuntjes) {
        this.totaalAantalMuntjes = totaalAantalMuntjes;
    }
}
