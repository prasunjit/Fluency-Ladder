package edu.nwmissouri.fluencyladder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView ball1, ball2, ball3, ball4, ball5, ball6, ball7, ball8, ball9;
    ImageView ball10, ball11, ball12, ball13, ball14, ball15, ball16, ball17, ball18;
    Button step2BT;
    int countOfBallsBox1 = 0;
    int countOfBallsBox2 = 0;
    TextView box1BallsTV;
    TextView box2BallsTV;
    boolean ball1clicked = true;
    boolean ball2clicked = true;
    boolean ball3clicked = true;
    boolean ball4clicked = true;
    boolean ball5clicked = true;
    boolean ball6clicked = true;
    boolean ball7clicked = true;
    boolean ball8clicked = true;
    boolean ball9clicked = true;
    boolean ball10clicked = true;
    boolean ball11clicked = true;
    boolean ball12clicked = true;
    boolean ball13clicked = true;
    boolean ball14clicked = true;
    boolean ball15clicked = true;
    boolean ball16clicked = true;
    boolean ball17clicked = true;
    boolean ball18clicked = true;
    Button replayBT;
    Button submitBtn;
    EditText edittextET;
    ImageView checkImage, cancelImage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittextET = (EditText) findViewById(R.id.edittextET);
        submitBtn = (Button) findViewById(R.id.submitBtn);
        replayBT = (Button) findViewById(R.id.replayBTN);
        step2BT = (Button) findViewById(R.id.step2BT);
        step2BT.setVisibility(View.INVISIBLE);
        Random randomNumber = new Random();
        final int randomNumber1 = randomNumber.nextInt(9 - 1) + 1;
        final int randomNumber2 = randomNumber.nextInt(9 - 1) + 1;
        checkImage = (ImageView) findViewById(R.id.checkImage);
        cancelImage = (ImageView) findViewById(R.id.cancelImage);
        checkImage.setVisibility(View.INVISIBLE);
        cancelImage.setVisibility(View.INVISIBLE);
        ball1 = (ImageView) findViewById(R.id.ball1IV);
        ball2 = (ImageView) findViewById(R.id.ball2IV);
        ball3 = (ImageView) findViewById(R.id.ball3IV);
        ball4 = (ImageView) findViewById(R.id.ball4IV);
        ball5 = (ImageView) findViewById(R.id.ball5IV);
        ball6 = (ImageView) findViewById(R.id.ball6IV);
        ball7 = (ImageView) findViewById(R.id.ball7IV);
        ball8 = (ImageView) findViewById(R.id.ball8IV);
        ball9 = (ImageView) findViewById(R.id.ball9IV);
        ball10 = (ImageView) findViewById(R.id.ball10IV);
        ball11 = (ImageView) findViewById(R.id.ball11IV);
        ball12 = (ImageView) findViewById(R.id.ball12IV);
        ball13 = (ImageView) findViewById(R.id.ball13IV);
        ball14 = (ImageView) findViewById(R.id.ball14IV);
        ball15 = (ImageView) findViewById(R.id.ball15IV);
        ball16 = (ImageView) findViewById(R.id.ball16IV);
        ball17 = (ImageView) findViewById(R.id.ball17IV);
        ball18 = (ImageView) findViewById(R.id.ball18IV);


        ImageView[] images1 = {ball1, ball2, ball3, ball4, ball5, ball6, ball7, ball8, ball9};
        ImageView[] images2 = {ball10, ball11, ball12, ball13, ball14, ball15, ball16, ball17, ball18};
        for (int i = 0; i < randomNumber1; i++) {
            images1[i].setVisibility(View.INVISIBLE);
        }

        for (int i = 0; i < randomNumber2; i++) {
            images2[i].setVisibility(View.INVISIBLE);
        }
        ball1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ball1clicked) {
                    ball1.setImageResource(R.drawable.imageball2);
                    countOfBallsBox1 = countOfBallsBox1 + 1;
                    box1BallsTV = (TextView) findViewById(R.id.Box1BallsTV);
                    box1BallsTV.setText(String.valueOf(countOfBallsBox1));
                }
                ball1clicked = false;
                if (countOfBallsBox1 + countOfBallsBox2 == (9 - randomNumber2 + 9 - randomNumber1)) {

                }
            }
        });
        ball2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("hello", "ball2");
                if (ball2clicked) {
                    ball2.setImageResource(R.drawable.imageball2);
                    countOfBallsBox1 = countOfBallsBox1 + 1;
                    String temp = String.valueOf(countOfBallsBox1);
                    box1BallsTV = (TextView) findViewById(R.id.Box1BallsTV);
                    box1BallsTV.setText(String.valueOf(countOfBallsBox1));
                    step2BT.setVisibility(View.VISIBLE);
                }
                ball2clicked = false;
                if (countOfBallsBox1 + countOfBallsBox2 == (9 - randomNumber2 + 9 - randomNumber1)) {

                }
            }
        });
        ball3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("hello", "ball3");
                if (ball3clicked) {
                    ball3.setImageResource(R.drawable.imageball2);
                    countOfBallsBox1 = countOfBallsBox1 + 1;
                    String temp = String.valueOf(countOfBallsBox1);
                    box1BallsTV = (TextView) findViewById(R.id.Box1BallsTV);
                    box1BallsTV.setText(String.valueOf(countOfBallsBox1));
                }
                ball3clicked = false;
                if (countOfBallsBox1 + countOfBallsBox2 == (9 - randomNumber2 + 9 - randomNumber1)) {
//
                }
            }
        });
        ball4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("hello", "ball4");
                if (ball4clicked) {
                    ball4.setImageResource(R.drawable.imageball2);
                    countOfBallsBox1 = countOfBallsBox1 + 1;
                    String temp = String.valueOf(countOfBallsBox1);
                    box1BallsTV = (TextView) findViewById(R.id.Box1BallsTV);
                    box1BallsTV.setText(String.valueOf(countOfBallsBox1));
                }
                ball4clicked = false;
                if (countOfBallsBox1 + countOfBallsBox2 == (9 - randomNumber2 + 9 - randomNumber1)) {
//
                }
            }
        });
        ball5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("hello", "ball5");
                if (ball5clicked) {
                    ball5.setImageResource(R.drawable.imageball2);
                    countOfBallsBox1 = countOfBallsBox1 + 1;
                    String temp = String.valueOf(countOfBallsBox1);
                    box1BallsTV = (TextView) findViewById(R.id.Box1BallsTV);
                    box1BallsTV.setText(String.valueOf(countOfBallsBox1));
                }
                ball5clicked = false;
                if (countOfBallsBox1 + countOfBallsBox2 == (9 - randomNumber2 + 9 - randomNumber1)) {
//
                }
            }
        });
        ball6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("hello", "ball6");
                if (ball6clicked) {
                    ball6.setImageResource(R.drawable.imageball2);
                    countOfBallsBox1 = countOfBallsBox1 + 1;
                    String temp = String.valueOf(countOfBallsBox1);
                    box1BallsTV = (TextView) findViewById(R.id.Box1BallsTV);
                    box1BallsTV.setText(String.valueOf(countOfBallsBox1));
                }
                ball6clicked = false;
                if (countOfBallsBox1 + countOfBallsBox2 == (9 - randomNumber2 + 9 - randomNumber1)) {
//
                }
            }
        });
        ball7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("hello", "ball7");

                if (ball7clicked) {
                    ball7.setImageResource(R.drawable.imageball2);
                    countOfBallsBox1 = countOfBallsBox1 + 1;
                    String temp = String.valueOf(countOfBallsBox1);
                    box1BallsTV = (TextView) findViewById(R.id.Box1BallsTV);
                    box1BallsTV.setText(String.valueOf(countOfBallsBox1));
                }
                ball7clicked = false;
                if (countOfBallsBox1 + countOfBallsBox2 == (9 - randomNumber2 + 9 - randomNumber1)) {
//
                }
            }
        });
        ball8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("hello", "ball8");
                if (ball8clicked) {
                    ball8.setImageResource(R.drawable.imageball2);
                    countOfBallsBox1 = countOfBallsBox1 + 1;
                    String temp = String.valueOf(countOfBallsBox1);
                    box1BallsTV = (TextView) findViewById(R.id.Box1BallsTV);
                    box1BallsTV.setText(String.valueOf(countOfBallsBox1));
                }
                ball8clicked = false;
                if (countOfBallsBox1 + countOfBallsBox2 == (9 - randomNumber2 + 9 - randomNumber1)) {

                }
            }
        });
        ball9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (ball9clicked) {
                    ball9.setImageResource(R.drawable.imageball2);
                    countOfBallsBox1 = countOfBallsBox1 + 1;
                    box1BallsTV = (TextView) findViewById(R.id.Box1BallsTV);
                    box1BallsTV.setText(String.valueOf(countOfBallsBox1));
                }
                Log.d("hello", "bal9");
                ball9clicked = false;
                if (countOfBallsBox1 + countOfBallsBox2 == (9 - randomNumber2 + 9 - randomNumber1)) {

                }

            }
        });
        ball10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ball10clicked) {
                    Log.d("hello", "ball10");
                    ball10.setImageResource(R.drawable.imageball2);
                    countOfBallsBox2 = countOfBallsBox2 + 1;
                    box2BallsTV = (TextView) findViewById(R.id.Box2BallsTV);
                    box2BallsTV.setText(String.valueOf(countOfBallsBox2));
                }
                ball10clicked = false;
                if (countOfBallsBox1 + countOfBallsBox2 == (9 - randomNumber2 + 9 - randomNumber1)) {
//
                }
            }
        });
        ball11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ball11clicked) {
                    Log.d("hello", "ball1");
                    ball11.setImageResource(R.drawable.imageball2);
                    countOfBallsBox2 = countOfBallsBox2 + 1;
                    box2BallsTV = (TextView) findViewById(R.id.Box2BallsTV);
                    box2BallsTV.setText(String.valueOf(countOfBallsBox2));
                }
                ball11clicked = false;
                if (countOfBallsBox1 + countOfBallsBox2 == (9 - randomNumber2 + 9 - randomNumber1)) {
//
                }
            }
        });
        ball12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ball12clicked) {
                    Log.d("hello", "ball2");
                    ball12.setImageResource(R.drawable.imageball2);
                    countOfBallsBox2 = countOfBallsBox2 + 1;
                    box2BallsTV = (TextView) findViewById(R.id.Box2BallsTV);
                    box2BallsTV.setText(String.valueOf(countOfBallsBox2));
                }
                ball12clicked = false;
                if (countOfBallsBox1 + countOfBallsBox2 == (9 - randomNumber2 + 9 - randomNumber1)) {
//
                }
            }
        });
        ball13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ball13clicked) {
                    Log.d("hello", "ball13");
                    ball13.setImageResource(R.drawable.imageball2);
                    countOfBallsBox2 = countOfBallsBox2 + 1;
                    box2BallsTV = (TextView) findViewById(R.id.Box2BallsTV);
                    box2BallsTV.setText(String.valueOf(countOfBallsBox2));
                }
                ball13clicked = false;
                if (countOfBallsBox1 + countOfBallsBox2 == (9 - randomNumber2 + 9 - randomNumber1)) {
//
                }
            }
        });
        ball14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ball14clicked) {
                    Log.d("hello", "ball4");
                    ball14.setImageResource(R.drawable.imageball2);
                    countOfBallsBox2 = countOfBallsBox2 + 1;
                    box2BallsTV = (TextView) findViewById(R.id.Box2BallsTV);
                    box2BallsTV.setText(String.valueOf(countOfBallsBox2));
                }
                ball14clicked = false;
                if (countOfBallsBox1 + countOfBallsBox2 == (9 - randomNumber2 + 9 - randomNumber1)) {
//
                }
            }
        });
        ball15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ball15clicked) {
                    Log.d("hello", "ball5");
                    ball15.setImageResource(R.drawable.imageball2);
                    countOfBallsBox2 = countOfBallsBox2 + 1;
                    box2BallsTV = (TextView) findViewById(R.id.Box2BallsTV);
                    box2BallsTV.setText(String.valueOf(countOfBallsBox2));
                }
                ball15clicked = false;
                if (countOfBallsBox1 + countOfBallsBox2 == (9 - randomNumber2 + 9 - randomNumber1)) {
//
                }
            }
        });
        ball16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("hello", "ball6");
                ball16.setImageResource(R.drawable.imageball2);
                if (ball16clicked) {
                    ball16.setImageResource(R.drawable.imageball2);
                    countOfBallsBox2 = countOfBallsBox2 + 1;
                    box2BallsTV = (TextView) findViewById(R.id.Box2BallsTV);
                    box2BallsTV.setText(String.valueOf(countOfBallsBox2));
                }
                ball16clicked = false;
                if (countOfBallsBox1 + countOfBallsBox2 == (9 - randomNumber2 + 9 - randomNumber1)) {
//
                }
            }
        });
        ball17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ball17.setImageResource(R.drawable.imageball2);
                if (ball17clicked) {
                    Log.d("hello", "ball7");
                    ball17.setImageResource(R.drawable.imageball2);
                    countOfBallsBox2 = countOfBallsBox2 + 1;
                    box2BallsTV = (TextView) findViewById(R.id.Box2BallsTV);
                    box2BallsTV.setText(String.valueOf(countOfBallsBox2));
                }
                ball17clicked = false;
                if (countOfBallsBox1 + countOfBallsBox2 == (9 - randomNumber2 + 9 - randomNumber1)) {
//
                }
            }
        });
        ball18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("hello", "ball8");
                ball18.setImageResource(R.drawable.imageball2);
                if (ball18clicked) {
                    ball18.setImageResource(R.drawable.imageball2);
                    countOfBallsBox2 = countOfBallsBox2 + 1;
                    box2BallsTV = (TextView) findViewById(R.id.Box2BallsTV);
                    box2BallsTV.setText(String.valueOf(countOfBallsBox2));
                }
                ball18clicked = false;
                if (countOfBallsBox1 + countOfBallsBox2 == (9 - randomNumber2 + 9 - randomNumber1)) {
//
                }
            }

        });

    }

    public void gotoLevelUnlocked(View view) {
        Intent intent1 = new Intent(this, LevelUnlocked.class);
        startActivity(intent1);
    }

    public void replay(View view) {
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }

    public void submitOnClick(View view) {
        cancelImage.setVisibility(View.INVISIBLE);
        String Str1;
        Str1 = edittextET.getText().toString();
        String Str2 = String.valueOf(countOfBallsBox1 + countOfBallsBox2);
        if (Str1.equals(Str2)) {
            submitBtn.setVisibility(View.INVISIBLE);
            step2BT.setVisibility(View.VISIBLE);
            replayBT.setVisibility(View.VISIBLE);
            checkImage.setVisibility(View.VISIBLE);
        } else {
            cancelImage.setVisibility(View.VISIBLE);
            replayBT.setVisibility(View.VISIBLE);

        }
    }
}

