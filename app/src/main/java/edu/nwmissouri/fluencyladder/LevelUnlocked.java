package edu.nwmissouri.fluencyladder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LevelUnlocked extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_unlocked);
    }

    public void gotoSecondActivity(View view) {
        Intent intent2 = new Intent(this, SecondActivity.class);
        startActivity(intent2);
    }
}
