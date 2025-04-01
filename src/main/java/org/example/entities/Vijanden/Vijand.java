package org.example.entities.Vijanden;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import org.example.entities.Avatar;

public abstract class Vijand extends DynamicSpriteEntity implements Collider {
    public Vijand(String resource, Coordinate2D initialLocation, Size size) {
        super(resource, initialLocation, size);
    }

    public abstract void interactie(Avatar avatar);

    @Override
    public void setCurrentFrameIndex(int index) {
        super.setCurrentFrameIndex(index);
    }
}
