package com.example.jsbridge.databindingstudy;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by lihong on 2017/5/11.
 */

public class ObservableUser extends BaseObservable {
    private String name;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
}
