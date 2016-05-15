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

public class SecondActivity extends AppCompatActivity {
    TextView numberOnBox;
    TextView boxOneBalls;
    ImageView ball10, ball11, ball12, ball13, ball14, ball15, ball16, ball17, ball18;
    int countOfBallsBox2 = 0;
    TextView box2BallsTV;
    TextView addedBallsTV;
    boolean ball10clicked = true;
    boolean ball11clicked = true;
    boolean ball12clicked = true;
    boolean ball13clicked = true;
    boolean ball14clicked = true;
    boolean ball15clicked = true;
    boolean ball16clicked = true;
    boolean ball17clicked = true;
    boolean ball18clicked = true;
    Button step3BT;
    Button replayBT;
    Button submitBtn;
    EditText edittextET;
    ImageView checkImage, cancelImage;
    final Random randomNumber = new Random();
    final int randomNumber1 = randomNumber.nextInt(9 - 1) + 1;
    final int randomNumber2 = randomNumber.nextInt(9 - 1) + 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        numberOnBox = (TextView) findViewById(R.id.numberOnBoxTV);
        boxOneBalls = (TextView) findViewById(R.id.Box1BallsTV);
        edittextET = (EditText) findViewById(R.id.edittextET);
        submitBtn = (Button) findViewById(R.id.submitBtn);
        replayBT = (Button) findViewById(R.id.replayBTN);
        step3BT = (Button) findViewById(R.id.step3BT);
        step3BT.setVisibility(View.INVISIBLE);
        checkImage = (ImageView) findViewById(R.id.checkImage);
        cancelImage = (ImageView) findViewById(R.id.cancelImage);
        checkImage.setVisibility(View.INVISIBLE);
        cancelImage.setVisibility(View.INVISIBLE);
        numberOnBox.setText(String.valueOf(randomNumber1));
        boxOneBalls.setText(String.valueOf(randomNumber1));
        ball10 = (ImageView) findViewById(R.id.ball10IV);
        ball11 = (ImageView) findViewById(R.id.ball11IV);
        ball12 = (ImageView) findViewById(R.id.ball12IV);
        ball13 = (ImageView) findViewById(R.id.ball13IV);
        ball14 = (ImageView) findViewById(R.id.ball14IV);
        ball15 = (ImageView) findViewById(R.id.ball15IV);
        ball16 = (ImageView) findViewById(R.id.ball16IV);
        ball17 = (ImageView) findViewById(R.id.ball17IV);
        ball18 = (ImageView) findViewById(R.id.ball18IV);
        ImageView[] images2 = {ball10, ball11, ball12, ball13, ball14, ball15, ball16, ball17, ball18};

        for (int i = 0; i < randomNumber2; i++) {
            images2[i].setVisibility(View.INVISIBLE);
        }
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
                if (randomNumber1 + countOfBallsBox2 == randomNumber1 + 9 - randomNumber2) {
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
                if (randomNumber1 + countOfBallsBox2 == randomNumber1 + 9 - randomNumber2) {
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
                if (randomNumber1 + countOfBallsBox2 == randomNumber1 + 9 - randomNumber2) {
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
                if (randomNumber1 + countOfBallsBox2 == randomNumber1 + 9 - randomNumber2) {
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
                if (randomNumber1 + countOfBallsBox2 == randomNumber1 + 9 - randomNumber2) {
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
                if (randomNumber1 + countOfBallsBox2 == randomNumber1 + 9 - randomNumber2) {
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
                if (randomNumber1 + countOfBallsBox2 == randomNumber1 + 9 - randomNumber2) {
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
                if (randomNumber1 + countOfBallsBox2 == randomNumber1 + 9 - randomNumber2) {
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
                if (randomNumber1 + countOfBallsBox2 == randomNumber1 + 9 - randomNumber2) {
//
                }
            }

        });
    }

    public void thirdLevelUnlock(View view) {
        Intent intent2 = new Intent(this, ThirdLevelUnlocked.class);
        startActivity(intent2);
    }

    public void replay(View view) {
        Intent intent3 = new Intent(this, SecondActivity.class);
        startActivity(intent3);
    }

    public void submitOnClick(View view) {
        cancelImage.setVisibility(View.INVISIBLE);
        String Str1;
        Str1 = edittextET.getText().toString();
        String Str2 = String.valueOf(randomNumber1 + countOfBallsBox2);
        if (Str1.equals(Str2)) {
            submitBtn.setVisibility(View.INVISIBLE);
            step3BT.setVisibility(View.VISIBLE);
            replayBT.setVisibility(View.VISIBLE);
            checkImage.setVisibility(View.VISIBLE);
        } else {
            cancelImage.setVisibility(View.VISIBLE);
            replayBT.setVisibility(View.VISIBLE);

        }
    }
}
