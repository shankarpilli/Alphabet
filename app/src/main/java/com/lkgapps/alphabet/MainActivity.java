package com.lkgapps.alphabet;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    private LinearLayout linearLayout;
    private TextView tv_letter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = findViewById(R.id.ll_layout);
        tv_letter = findViewById(R.id.tv_letter);
        tv_letter.setTypeface(Utility.setTypeDeathStar(this));

        DrawingView mDrawingView = new DrawingView(this);
        LinearLayout mDrawingPad = findViewById(R.id.view_drawing_pad);
        mDrawingPad.addView(mDrawingView);
    }
}
