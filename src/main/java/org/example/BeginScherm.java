package org.example;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
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
                new Coordinate2D(getWidth() / 2, (getHeight() / 3) + 25),
                "PixelQuest"
        );
        titelText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        titelText.setFill(Color.LIGHTGREEN);
        titelText.setStrokeColor(Color.BLACK);
        titelText.setStrokeWidth(1);
        titelText.setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 55));
        addEntity(titelText);

        GameKnop playKnop = new GameKnop("Knoppen/PlayKnop.png", new Coordinate2D(getWidth() / 2, (getHeight() / 5) * 4),1, pixelQuest, new Size(150,150));
        playKnop.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(playKnop);
   }
}
