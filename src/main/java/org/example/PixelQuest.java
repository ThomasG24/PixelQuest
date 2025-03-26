package org.example;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;

public class PixelQuest extends YaegerGame {
    private int gekozenLevel;

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
    }

    public int getGekozenLevel() {
        return gekozenLevel;
    }

    public void setGekozenLevel(int gekozenLevel) {
        this.gekozenLevel = gekozenLevel;
    }
}
