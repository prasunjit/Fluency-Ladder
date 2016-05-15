package edu.nwmissouri.fluencyladder;

import android.view.DragEvent;
import android.view.View;

/**
 * Created by s525074 on 4/20/2016.
 */
public interface ImageDragListener extends View.OnDragListener {

    @Override
    boolean onDrag(View v, DragEvent event);

    void onViewUpdate();
    void onDragUpdateLeft();
    void onDragUpdateRight();
}
