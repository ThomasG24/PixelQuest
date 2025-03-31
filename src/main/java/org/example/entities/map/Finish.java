package org.example.entities.map;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class Finish extends DynamicSpriteEntity implements Collider {
    public Finish(Coordinate2D initialLocation, Size size, String resource) {
        super(resource, initialLocation, size);
    }
}
