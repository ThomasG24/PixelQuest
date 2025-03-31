package org.example;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import javafx.scene.input.MouseButton;

public class GameKnop extends DynamicSpriteEntity implements MouseButtonPressedListener {
    private PixelQuest pixelQuest;
    private int setScene;

    public GameKnop(String resource, Coordinate2D initialLocation, int setScene, PixelQuest pixelQuest, Size size) {
        super(resource, initialLocation, size);
        this.pixelQuest = pixelQuest;
        this.setScene = setScene;
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        pixelQuest.setActiveScene(setScene);
    }
}
