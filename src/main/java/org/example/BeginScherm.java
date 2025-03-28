package org.example;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class BeginScherm extends StaticScene {
    private PixelQuest pixelQuest;

   public BeginScherm(PixelQuest pixelQuest) {
       this.pixelQuest = pixelQuest;
   }

    @Override
    public void setupScene() {
        setBackgroundAudio("Audio/MuziekBeginscherm.mp3");
        setBackgroundImage("Achtergronden/achtergrondBeginscherm.png");
    }

    @Override
    public void setupEntities() {
        var titelText = new TextEntity(
                new Coordinate2D(getWidth() / 2, getHeight() / 2),
                "PixelQuest"
        );
        titelText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        titelText.setFill(Color.BLUE);
        titelText.setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 80));
        addEntity(titelText);

        GameKnop gameKnopLevelEen = new GameKnop("Knoppen/TestKnop.png", new Coordinate2D(0, 0),1, pixelQuest);
        addEntity(gameKnopLevelEen);
   }
}
