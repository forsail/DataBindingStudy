package com.example.jsbridge.databindingstudy;

import android.view.View;
import android.widget.Toast;

/**
 * Created by lihong on 2017/5/16.
 */

public class Presenter {
    public void onNameClick(View view, ObservableUser2 user) {
        Toast.makeText(view.getContext().getApplicationContext(), user.name.get(), Toast.LENGTH_SHORT).show();
    }
}
