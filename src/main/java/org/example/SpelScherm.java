package org.example;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import org.example.entities.Avatar;
import org.example.entities.map.Level;

public class SpelScherm extends DynamicScene implements TileMapContainer {
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

        Avatar avatar = new Avatar(new Coordinate2D(300,250), new Size(50,20));
        addEntity(avatar);
    }

    @Override
    public void setupTileMaps() {
        addTileMap(new Level());
    }
}
