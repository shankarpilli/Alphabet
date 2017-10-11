package com.lkgapps.alphabet;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Shankar Pilli on 20-10-2016.
 */
public class SplashActivity extends Activity {
    private TextView tv_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme_NoActionBar);
        setContentView(R.layout.activity_splash);

        tv_name = findViewById(R.id.tv_name);
        tv_name.setTypeface(Utility.setTypeCAMBRIAB(this));
    }
}
