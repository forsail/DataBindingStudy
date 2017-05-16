package com.example.jsbridge.databindingstudy;

import android.view.View;
import android.widget.Toast;

/**
 * Created by lihong on 2017/5/16.
 */

public class MyHandlers {
    public void onClickMobile(View view) {
        Toast.makeText(view.getContext().getApplicationContext(), "test", Toast.LENGTH_SHORT).show();
    }
}
