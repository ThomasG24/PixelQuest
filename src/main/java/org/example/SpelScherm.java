package org.example;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import org.example.entities.Avatar;
import org.example.entities.Vijanden.Goomba;
import org.example.entities.Vijanden.Vijand;
import org.example.entities.map.Level;
import org.example.entities.map.LevensText;
import org.example.entities.map.MuntjesText;

public class SpelScherm extends DynamicScene implements TileMapContainer {
    private PixelQuest pixelQuest;

    public SpelScherm(PixelQuest pixelQuest) {
        this.pixelQuest = pixelQuest;
    }

    @Override
    public void setupScene() {
        setBackgroundAudio("Audio/MuziekSpelscherm.mp3");
        setBackgroundImage("Achtergronden/SpelschermAchtergrond.png");

    }

    @Override
    public void setupEntities() {
        GameKnop exitKnop = new GameKnop("Knoppen/ExitKnop.png", new Coordinate2D(0, 0),0, pixelQuest, new Size(100, 100));
        addEntity(exitKnop);

        LevensText levensText = new LevensText(new Coordinate2D((getWidth() / 16) * 2, 0));
        addEntity(levensText);

        MuntjesText muntjesText = new MuntjesText(new Coordinate2D((getWidth() / 16 * 5), 0));
        addEntity(muntjesText);

        Avatar avatar = new Avatar(new Coordinate2D(0,getHeight() - 100), new Size(25, 25), levensText,  muntjesText, pixelQuest);
        addEntity(avatar);

        Vijand Goomba = new Goomba("Vijanden/Goomba.png", new Coordinate2D(50, 200), new Size(50, 50));
        addEntity(Goomba);
    }

    @Override
    public void setupTileMaps() {
        addTileMap(new Level());
    }
}
