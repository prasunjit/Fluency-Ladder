package edu.nwmissouri.fluencyladder;

import android.content.ClipData;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by S525074 on 3/13/2016.
 */
public class MyLongClickListener implements View.OnTouchListener {

    /*@Override
    public boolean onLongClick(View view) {
        ClipData data = ClipData.newPlainText("", "");
        View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
        view.startDrag(data, shadowBuilder, view, 0);
        view.setVisibility(View.INVISIBLE);
        return true;
    }
*/
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
            Log.d("hello", "Motion action down");
            ClipData data = ClipData.newPlainText("", "");
            View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
            view.startDrag(data, shadowBuilder, view, 0);
            view.setVisibility(View.INVISIBLE);
            return true;
        }
        else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
            Log.d("hello", "Motion action up");
            view.setVisibility(View.VISIBLE);
            return true;
        } else {
            Log.d("hello", "Motion action do nothing");
            return true;
        }
    }
}

