package com.lkgapps.alphabet;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by Shankar on 10/11/2017.
 */

public class Utility {


    public static Typeface setTypeCAMBRIAB(Context context) {
        return Typeface.createFromAsset(context.getAssets(), "CAMBRIAB.TTF");
    }

    public static Typeface setTypeDeathStar(Context context) {
        return Typeface.createFromAsset(context.getAssets(), "Death Star.otf");
    }
}
