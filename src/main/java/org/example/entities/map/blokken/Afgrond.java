package org.example.entities.map.blokken;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import org.example.entities.Avatar;

public class Afgrond extends Blok{
    public Afgrond(Coordinate2D initialLocation, Size size, String resource) {
        super(initialLocation, size, resource);
    }

    @Override
    public void interactie(Avatar avatar) {
        avatar.setTotaalAantalLevens(0);
    }
}
