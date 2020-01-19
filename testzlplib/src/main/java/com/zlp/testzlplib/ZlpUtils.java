package com.zlp.testzlplib;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by zlp on 2020/1/19 0019.
 */
public class ZlpUtils {

    public static void toSubActivity(Activity activity){
        Intent intent = new Intent(activity,SubActivity.class);
        activity.startActivity(intent);
    }
}
