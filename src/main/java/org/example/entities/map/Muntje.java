package org.example.entities.map;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import org.example.entities.Avatar;

public class Muntje extends DynamicSpriteEntity implements Collider {
    public Muntje(Coordinate2D initialLocation, Size size, String resource) {
        super(resource, initialLocation, size);
    }

    public void interactie(Avatar avatar) {
        System.out.println("Muntje interactie");

        avatar.setTotaalAantalMuntjes(avatar.getTotaalAantalMuntjes() + 1);

        this.remove();
    }
}
