package org.example.entities.map;

import com.github.hanyaeger.api.scenes.TileMap;
import org.example.entities.map.blokken.Afgrond;
import org.example.entities.map.blokken.BreekbaarBlok;
import org.example.entities.map.blokken.Muur;

public class Level extends TileMap {
    @Override
    public void setupEntities() {
        addEntity(1, Muur.class, "Blokken/Muur.png");
        addEntity(2, Afgrond.class, "Blokken/Afgrond.png");
        addEntity(3, BreekbaarBlok.class, "Blokken/BreekbaarBlok.png");
        addEntity(4, Muntje.class, "Elementen/Muntje.png");
        addEntity(5, Finish.class, "Elementen/Finish.png");
    }

    @Override
    public int[][] defineMap() {
        int[][] level;

        level = new int[][]{
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5},
                {3,3,0,0,0,0,0,0,0,0,4,0,0,1,1,1},
                {0,0,0,0,0,0,1,1,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,1,1,0,0,3,3,0,0,4,0,0,0},
                {4,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0},
                {3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,1,0,0,1,1,0,0,1,0,0,0,1,1},
                {0,0,1,1,0,0,0,0,0,0,1,1,0,0,0,4},
                {1,1,1,1,2,2,2,2,2,2,1,1,1,1,1,1}
        };

        return level;
    }
}
