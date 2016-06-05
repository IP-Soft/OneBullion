package com.example.paolo.onebullion;

import android.graphics.Bitmap;

/**
 * Created by Paolo on 05/06/2016.
 */
public class Player extends GameObject {

    private Bitmap sprite;


    public Player(Bitmap res, int w, int h){
        sprite = res;
        height = h;
        width = w;

        x = GamePanel.WIDTH / 2;
        y = GamePanel.HEIGHT / 2;

    }
}
