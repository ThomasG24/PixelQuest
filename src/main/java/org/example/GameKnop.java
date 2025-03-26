package org.example;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import javafx.scene.input.MouseButton;

public class GameKnop extends DynamicSpriteEntity implements MouseButtonPressedListener {
    private int level;
    private PixelQuest pixelQuest;

    protected GameKnop(String resource, Coordinate2D initialLocation, int level, PixelQuest pixelQuest) {
        super(resource, initialLocation, new Size(100,100));
        this.level = level;
        this.pixelQuest = pixelQuest;
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        pixelQuest.setActiveScene(1);
    }
}
