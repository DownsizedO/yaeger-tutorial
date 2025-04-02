package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.Waterworld;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class TitleScene extends StaticScene {

    private Waterworld waterworld;

    public TitleScene(Waterworld waterworld){
        this.waterworld = waterworld;
    }

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/ocean.mp3");
        setBackgroundImage("backgrounds/background1.jpg");
    }

    @Override
    public void setupEntities()
    {
        var waterworldText = new TextEntity(
                new Coordinate2D(getWidth() / 2, getHeight()),
                "WaterWorld"

        );
        waterworldText.setAnchorPoint(AnchorPoint.BOTTOM_CENTER);
        waterworldText.setFill(Color.BLUE);
        waterworldText.setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 80));
        addEntity((waterworldText));


        var startbutton = new com.github.hanyaeger.tutorial.scenes.StartButton(
                new Coordinate2D(getWidth()/2, getHeight() - 500), "start", waterworld
        );
        startbutton.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        startbutton.setFill(Color.BLUE);
        startbutton.setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 100));
        addEntity((startbutton));
    }


}
