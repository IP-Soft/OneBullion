package com.example.paolo.onebullion;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by Paolo on 05/06/2016.
 */
public class GamePanel extends SurfaceView implements SurfaceHolder.Callback {
    public static final int WIDTH = 979;
    public static final int HEIGHT = 392;

    private Context context;
    private MainThread thread;
    private Background bg;

    public GamePanel(Context context){
        super(context);
        getHolder().addCallback(this);
        setFocusable(true);

        this.context = context;
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height){}

    @Override
    public void surfaceDestroyed(SurfaceHolder holder){
        boolean retry = true;
        int count = 0;
        while(retry && count < 1000){
            count++;
            try {
                thread.setRunning(false);
                thread.join();

                retry = false;
                thread = null;
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder){
        bg = new Background(BitmapFactory.decodeResource(getResources(), R.drawable.background));

        thread = new MainThread(getHolder(), this);
        thread.setRunning(true);
        thread.start();
    }

    @Override
    public void draw(Canvas canvas){
        super.draw(canvas);

        final float scaleFactorX = getWidth() / (WIDTH * 1.f);
        final float scaleFactorY = getHeight() / (HEIGHT * 1.f);

        if(canvas != null) {
            final int savedState = canvas.save();
            canvas.scale(scaleFactorX, scaleFactorY);

            bg.draw(canvas);

            canvas.restoreToCount(savedState);
        }
    }
    public void update(){
        // qua la aggiorniamo
    }
}