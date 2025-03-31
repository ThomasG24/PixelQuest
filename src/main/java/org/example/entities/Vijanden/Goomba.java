package org.example.entities.Vijanden;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import org.example.entities.Avatar;

public class Goomba extends Vijand{
    public Goomba(String resource, Coordinate2D initialLocation, Size size) {
        super(resource, initialLocation, size);
    }

    @Override
    public void interactie(Avatar avatar) {
        System.out.println("Goomba interactie");

        avatar.setTotaalAantalLevens(avatar.getTotaalAantalLevens() - 1);
        avatar.setAnchorLocation(new Coordinate2D(0, avatar.getSceneHeight() - 100));
    }
}
