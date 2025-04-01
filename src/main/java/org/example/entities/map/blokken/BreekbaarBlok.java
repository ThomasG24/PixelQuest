package org.example.entities.map.blokken;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import org.example.entities.Avatar;

public class BreekbaarBlok extends Blok {
    public BreekbaarBlok(Coordinate2D initialLocation, Size size, String resource) {
        super(initialLocation, size, resource);
    }

    @Override
    public void interactie(Avatar avatar) {
        System.out.println("BreekbaarBlok interactie");

        avatar.setSpeed(0);

        avatar.setAnchorLocation(new Coordinate2D(avatar.getVorigeX(), avatar.getVorigeY()));

        this.remove();
    }
}
