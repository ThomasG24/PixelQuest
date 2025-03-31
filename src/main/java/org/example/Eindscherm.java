package org.example;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Eindscherm extends StaticScene {
    private PixelQuest pixelQuest;


    public Eindscherm(PixelQuest pixelQuest) {
        this.pixelQuest = pixelQuest;
    }

    @Override
    public void setupScene() {
        setBackgroundAudio("Audio/MuziekBeginscherm.mp3");
        setBackgroundImage("Achtergronden/achtergrondBeginscherm.png");
    }

    @Override
    public void setupEntities() {
        var eindschermText = new TextEntity(
                new Coordinate2D(getWidth() / 2, (getHeight() / 3) + 25),
                "Game Over!"
        );
        eindschermText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        eindschermText.setFill(Color.BLUE);
        eindschermText.setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 50));
        addEntity(eindschermText);

        var behaaldeMuntjesText = new TextEntity(new Coordinate2D(getWidth() / 2,(getHeight() / 3) + 65), "Totaal behaalde muntjes: ");
        behaaldeMuntjesText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        behaaldeMuntjesText.setFill(Color.BLUE);
        behaaldeMuntjesText.setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 20));
        addEntity(behaaldeMuntjesText);

        GameKnop playKnop = new GameKnop("Knoppen/MenuKnop.png", new Coordinate2D(getWidth() / 2, (getHeight() / 5) * 4), 0, pixelQuest, new Size(150, 150));
        playKnop.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(playKnop);
    }
}
