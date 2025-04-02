package com.github.hanyaeger.tutorial.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.userinput.KeyListener;
import javafx.scene.input.KeyCode;

import java.util.Set;

public class Hanny extends DynamicSpriteEntity implements KeyListener {


    public Hanny(Coordinate2D location){
        super("sprites/hanny.png", location);


    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> pressedKeys) {
        int Movement_Speed = 8;

            if(pressedKeys.contains(KeyCode.A) || pressedKeys.contains(KeyCode.LEFT)){
                if(pressedKeys.contains(KeyCode.W) || pressedKeys.contains(KeyCode.UP))
                {
                    setMotion(Movement_Speed, 225d);
                }else if(pressedKeys.contains(KeyCode.S) || pressedKeys.contains(KeyCode.DOWN))
                {
                    setMotion(Movement_Speed, 315);

                }else{setMotion(Movement_Speed, 270d);}
            } else if(pressedKeys.contains(KeyCode.D) || pressedKeys.contains(KeyCode.RIGHT))
            {
                if(pressedKeys.contains(KeyCode.W) || pressedKeys.contains(KeyCode.UP))
                {
                    setMotion(Movement_Speed, 135);
                }else if(pressedKeys.contains(KeyCode.S) || pressedKeys.contains(KeyCode.DOWN)){
                setMotion(Movement_Speed, 45);
            }
            else{
                setMotion(Movement_Speed,90d);
            }} else if(pressedKeys.contains(KeyCode.W) || pressedKeys.contains(KeyCode.UP))
            {
                setMotion(Movement_Speed,180d);
            } else if(pressedKeys.contains(KeyCode.S) || pressedKeys.contains(KeyCode.DOWN)){
                setMotion(Movement_Speed,0d);
            }
           else if(pressedKeys.isEmpty()){
                setSpeed(0);
            }


    }
}
