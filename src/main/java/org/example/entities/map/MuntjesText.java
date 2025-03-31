package org.example.entities.map;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class MuntjesText extends TextEntity {
    public MuntjesText(Coordinate2D initialLocation) {
        super(initialLocation);

        setFont(Font.font("Roboto", FontWeight.NORMAL, 30));
        setFill(Color.DARKBLUE);
    }

    public void setMuntjesText(int muntjes){
        setText("Muntjes: " + muntjes);
    }
}
