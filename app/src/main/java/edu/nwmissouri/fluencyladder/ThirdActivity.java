package edu.nwmissouri.fluencyladder;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class ThirdActivity extends AppCompatActivity implements ImageDragListener {

    LinearLayout linearLayoutLeftParent,linearLayoutRightParent;
    TextView leftBoxTV, rightBoxTV, resultTV, messageTV;
    Random randomNumber = new Random();
    int randomNumberLeft=randomNumber.nextInt((3-2)+ 1) + 2;
    int randomNumberRight=randomNumber.nextInt(2-1)+1;
    int countRight, countLeft;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        linearLayoutLeftParent = (LinearLayout) findViewById(R.id.linearLayout_left);
        linearLayoutRightParent = (LinearLayout) findViewById(R.id.linearLayout_right);
        messageTV = (TextView)findViewById(R.id.messageTV);
        messageTV.setVisibility(View.INVISIBLE);
        Log.d("HElla",""+randomNumberLeft);
        Log.d("HElla", "" + randomNumberRight);
        addParentsToView(linearLayoutLeftParent, 4);
        addParentsToView(linearLayoutRightParent, 4);

        addImageBallsLeft(linearLayoutLeftParent, 2);
        addImageBallsRight(linearLayoutRightParent, 1);

        this.onViewUpdate();

    }

    private void addParentsToView(LinearLayout linearLayoutRightParent, int parentCount){

        LinearLayout.LayoutParams parentParams = new LinearLayout.LayoutParams(196,50);

        for (int i = 0; i < parentCount; i++) {

            LinearLayout linearLayout = new LinearLayout(ThirdActivity.this);
            linearLayout.setOrientation(LinearLayout.HORIZONTAL);
            linearLayout.setBackgroundColor(Color.LTGRAY);
            linearLayout.setLayoutParams(parentParams);
            linearLayoutRightParent.addView(linearLayout);
            linearLayoutRightParent.setOnDragListener(this);
            linearLayoutLeftParent.setOnDragListener(this);
            linearLayout.setOnDragListener(this);

        }
    }
    private void addImageBallsLeft(LinearLayout holderViewLeft,int count){
        int childCount = holderViewLeft.getChildCount();
        LinearLayout.LayoutParams imageParams = new LinearLayout.LayoutParams(40,40);
        for (int i = 0; i < childCount; i++) {
           LinearLayout parent = (LinearLayout) holderViewLeft.getChildAt(i);
            for (int j = 0; j <randomNumberLeft; j++) {
                ImageView imageView = new ImageView(ThirdActivity.this);
                imageView.setImageResource(R.drawable.imageball);
                parent.addView(imageView,imageParams);
                imageView.setOnTouchListener(new MyLongClickListener());
            }
        }
    }

    private void addImageBallsRight(LinearLayout holderViewRight,int count){
        int childCount = holderViewRight.getChildCount();
        LinearLayout.LayoutParams imageParams = new LinearLayout.LayoutParams(40,40);
        for (int i = 0; i < childCount; i++) {
            LinearLayout parent = (LinearLayout) holderViewRight.getChildAt(i);
            for (int j = 0; j <randomNumberRight; j++) {
                ImageView imageView = new ImageView(ThirdActivity.this);
                imageView.setImageResource(R.drawable.imageball);
                parent.addView(imageView,imageParams);
                imageView.setOnTouchListener(new MyLongClickListener());
            }
        }
    }
    @Override
    public boolean onDrag(View layoutView, DragEvent event) {
        switch (event.getAction()) {
            case DragEvent.ACTION_DRAG_STARTED:
                return true;
            case DragEvent.ACTION_DRAG_ENTERED:
                return false;
            case DragEvent.ACTION_DROP:
                View view = (View) event.getLocalState();
                ViewGroup owner = (ViewGroup) view.getParent();
                owner.removeView(view);
                LinearLayout container = (LinearLayout) layoutView;
                container.addView(view);
                view.setVisibility(View.VISIBLE);
                onDragUpdateLeft();
                onDragUpdateRight();
                break;
            case DragEvent.ACTION_DRAG_ENDED:
                break;
            default:
                break;
        }
        return true;
    }

    @Override
    public void onViewUpdate() {
        leftBoxTV = (TextView)findViewById(R.id.leftBoxTV);
        rightBoxTV = (TextView)findViewById(R.id.rightBoxTV);
        String numberLeft = String.valueOf(randomNumberLeft * 4);
        String numberRight = String.valueOf(randomNumberRight*4);
        rightBoxTV.setText(numberRight);
        leftBoxTV.setText(numberLeft);
    }

    @Override
    public void onDragUpdateLeft() {
        countLeft  = getTotalChildsInView(linearLayoutLeftParent);
        countRight = getTotalChildsInView(linearLayoutRightParent);
        leftBoxTV = (TextView)findViewById(R.id.leftBoxTV);
        resultTV = (TextView)findViewById(R.id.resultTV);

        String stringLeftBox = leftBoxTV.getText().toString();
       // int numberPresent = Integer.parseInt(stringLeftBox);
        String countLeftBox = String.valueOf(countLeft);
        if(countLeft == 10){
           int result = countLeft+countRight;
            String resultNumber = String.valueOf(result);
            resultTV.setTextColor(Color.WHITE);
           resultTV.setText(resultNumber);
            messageTV.setVisibility(View.VISIBLE);
        }
        leftBoxTV.setText(countLeftBox);
    }

    @Override
    public void onDragUpdateRight() {
        countLeft = getTotalChildsInView(linearLayoutLeftParent);
        countRight  = getTotalChildsInView(linearLayoutRightParent);
        rightBoxTV = (TextView)findViewById(R.id.rightBoxTV);
        String stringRightBox = rightBoxTV.getText().toString();
        String countRightBox = String.valueOf(countRight);
        if(countRight == 10){
            int result = countLeft+countRight;
            String resultNumber = String.valueOf(result);
            resultTV.setTextColor(Color.YELLOW);
            resultTV.setText(resultNumber);
            messageTV.setVisibility(View.VISIBLE);
        }
        rightBoxTV.setText(countRightBox);
    }

    private int getTotalChildsInView(LinearLayout holder){
        int parentCount = holder.getChildCount();
        int imageCount=0;
        for (int i = 0; i < parentCount; i++) {
            imageCount+=((ViewGroup)holder.getChildAt(i)).getChildCount();
        }
        return imageCount;

    }

    public void replay(View view) {
        Intent intent4 = new Intent(this, ThirdActivity.class);
        startActivity(intent4);
    }

}
