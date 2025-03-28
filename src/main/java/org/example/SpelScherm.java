package org.example;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;

public class SpelScherm extends DynamicScene {
    private PixelQuest pixelQuest;

    public SpelScherm(PixelQuest pixelQuest) {
        this.pixelQuest = pixelQuest;
    }

    @Override
    public void setupScene() {
        setBackgroundImage("Achtergronden/achtergrondBeginscherm.png");

    }

    @Override
    public void setupEntities() {
        GameKnop gameKnopLevelEen = new GameKnop("Knoppen/TestKnop.png", new Coordinate2D(0, 0),0, pixelQuest);
        addEntity(gameKnopLevelEen);
    }
}
