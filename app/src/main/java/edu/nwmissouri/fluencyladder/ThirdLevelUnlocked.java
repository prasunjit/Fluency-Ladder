package edu.nwmissouri.fluencyladder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ThirdLevelUnlocked extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdlevel_unlocked);
    }

    public void gotoThirdActivity(View view) {
        Intent intent2 = new Intent(this, ThirdActivity.class);
        startActivity(intent2);
    }
}
