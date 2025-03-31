package org.example.entities;


import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.UpdateExposer;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Newtonian;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.api.userinput.KeyListener;
import javafx.scene.input.KeyCode;
import org.example.PixelQuest;
import org.example.entities.Vijanden.Vijand;
import org.example.entities.map.Finish;
import org.example.entities.map.LevensText;
import org.example.entities.map.Muntje;
import org.example.entities.map.MuntjesText;
import org.example.entities.map.blokken.Blok;

import java.util.List;
import java.util.Set;

<<<<<<< Updated upstream
public class Avatar extends DynamicSpriteEntity implements KeyListener, Newtonian, SceneBorderTouchingWatcher, Collided, UpdateExposer {
    private PixelQuest pixelQuest;

    private double vorigeX;
    private double vorigeY;

    private int totaalAantallevens = 3;
    private LevensText levensText;

    private int totaalAantalMuntjes = 0;
    private MuntjesText muntjesText;

    public Avatar(Coordinate2D initialLocation, Size size, LevensText levensText, MuntjesText muntjesText, PixelQuest pixelQuest) {
        super("Avatar/Avatar.png", initialLocation, size);
        this.levensText = levensText;
        this.muntjesText = muntjesText;

        levensText.setLevensText(totaalAantallevens);
        muntjesText.setMuntjesText(totaalAantalMuntjes);

        this.pixelQuest = pixelQuest;
=======
public class Avatar extends DynamicSpriteEntity implements KeyListener, Newtonian, SceneBorderTouchingWatcher, Collided {
    private int springCount = 0;
    private boolean snelVallen = false;


    public Avatar(Coordinate2D initialLocation, Size size) {
        super("Avatar/Avatar.png", initialLocation, size);
        setGravityConstant(0.5);
>>>>>>> Stashed changes
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> pressedKeys) {

        if (pressedKeys.contains(KeyCode.LEFT)) {
            setMotion(3, 270d);
        }else if (pressedKeys.contains(KeyCode.RIGHT)) {
                setMotion(3, 90d);
            }else {
                setMotion(0, 0);
        }

        if (pressedKeys.contains(KeyCode.UP) && springCount < 1) {
            springCount = 1;
            setMotion(5, 180d);
        }
//        }else if (pressedKeys.contains(KeyCode.UP) && pressedKeys.contains(KeyCode.RIGHT)) {
//                    setMotion(5, 135d);
//                    if (pressedKeys.contains(KeyCode.UP)) {
//                        setMotion(5, 180d);
//                    }
//                }
//            }





//        if (pressedKeys.contains(KeyCode.UP) && springCount < 2) {
//            springCount++;
//            //springen = false;
//            if (pressedKeys.contains(KeyCode.LEFT)) {
//                setMotion(5, 225d);
//            }else if (pressedKeys.contains(KeyCode.RIGHT)) {
//                setMotion(5, 135d);
//            }else {
//                setMotion(5, 180d);
//            }
//        }

        if (pressedKeys.contains(KeyCode.DOWN) && springCount == 2) {
           snelVallen = true;
           setMotion(10, 0d);
            }
        }

    @Override
    public void notifyBoundaryTouching(SceneBorder border) {

        switch (border) {
            case TOP:
                setAnchorLocationY(1);
                break;
            case BOTTOM:
                springCount = 0;
                snelVallen = false;
                setAnchorLocationY(getSceneHeight() - getHeight() - 1);
                setSpeed(0);
                break;
            case LEFT:
                setAnchorLocationX(1);
                break;
            case RIGHT:
                setAnchorLocationX(getSceneWidth() - getWidth() - 1);
            default:
                break;
        }
    }

    @Override
    public void onCollision(List<Collider> colliderObject) {
        for(Collider collider : colliderObject){
            if(collider instanceof Blok){
                ((Blok) collider).interactie(this);
                levensText.setLevensText(totaalAantallevens);
            }
            if(collider instanceof Muntje){
                ((Muntje) collider).interactie(this);
                muntjesText.setMuntjesText(totaalAantalMuntjes);
            }
            if(collider instanceof Vijand){
                ((Vijand) collider).interactie(this);
                levensText.setLevensText(totaalAantallevens);
            }
            if(collider instanceof Finish){
                pixelQuest.setActiveScene(2);
            }
        }

        if(totaalAantallevens <= 0){
            pixelQuest.setActiveScene(2);
        }
    }

    public double getVorigeX() {
        return vorigeX;
    }

    public double getVorigeY() {
        return vorigeY;
    }

    public void setTotaalAantalLevens(int levens){
        this.totaalAantallevens = levens;
    }

    public int getTotaalAantalLevens() {
        return totaalAantallevens;
    }

    public void setTotaalAantalMuntjes(int muntjes){
        this.totaalAantalMuntjes = muntjes;
    }

    public int getTotaalAantalMuntjes(){
        return totaalAantalMuntjes;
    }

    @Override
    public void explicitUpdate(long l) {
        vorigeX = getAnchorLocation().getX();
        vorigeY = getAnchorLocation().getY();
    }
}
