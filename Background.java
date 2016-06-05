package com.example.paolo.onebullion;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/**
 * Created by Paolo on 05/06/2016.
 */
public class Background {
    private Bitmap bg;
    private int x = 0;
    private int y = 0;


    public Background(Bitmap res){
        bg = res;
    }

    public void update(){
        // poi vediamo che metterci
    }

    public void draw(Canvas canvas){
        canvas.drawBitmap(bg, x, y, null);
    }
}
