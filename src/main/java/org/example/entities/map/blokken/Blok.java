package org.example.entities.map.blokken;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import org.example.entities.Avatar;

public abstract class Blok extends DynamicSpriteEntity implements Collider {
    public Blok(Coordinate2D initialLocation, Size size, String resource) {
        super(resource, initialLocation, size);
    }

    public abstract void interactie(Avatar avatar);
}