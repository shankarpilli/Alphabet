package com.lkgapps.alphabet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Shankar on 10/11/2017.
 */

public class DashboardActivity extends Activity implements View.OnClickListener {
    private ImageView img_telugu;
    private ImageView img_english;
    private ImageView img_hindi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme_NoActionBar);
        setContentView(R.layout.activity_dash_baord);
        initUI();
    }

    /*THis method is used for initialization*/
    private void initUI() {
        img_telugu = findViewById(R.id.img_telugu);
        img_english = findViewById(R.id.img_english);
        img_hindi = findViewById(R.id.img_hindi);
        img_telugu.setOnClickListener(this);
        img_english.setOnClickListener(this);
        img_hindi.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.img_telugu:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.img_english:
                Intent intentEN = new Intent(this, MainActivity.class);
                startActivity(intentEN);
                break;
            case R.id.img_hindi:
                Intent intentHi = new Intent(this, MainActivity.class);
                startActivity(intentHi);
                break;
        }
    }
}
