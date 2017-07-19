package com.ibas.bottommenu.Utils;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.ibas.bottommenu.Activity.Main;
import com.ibas.bottommenu.R;

/**
 * Created by Ibas on 19/07/2017.
 */

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splash.this, Main.class));
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
                finish();
            }
        }, 2000);
    }
}
