package com.lkgapps.alphabet;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = findViewById(R.id.ll_layout);

        DrawingView mDrawingView = new DrawingView(this);
        LinearLayout mDrawingPad = findViewById(R.id.view_drawing_pad);
        mDrawingPad.addView(mDrawingView);
    }
}
