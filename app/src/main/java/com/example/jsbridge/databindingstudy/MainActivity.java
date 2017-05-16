package com.example.jsbridge.databindingstudy;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.jsbridge.databindingstudy.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ObservableUser2 user;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        bindData(binding);
        initUI();
    }

    private void bindData(ActivityMainBinding binding) {
        user = new ObservableUser2();
        user.name.set("asher");
        binding.setUser(user);
        binding.setHandlers(new MyHandlers());
        binding.setPresenter(new Presenter());
        List<String> list = new ArrayList();
        list.add("asher test");
        list.add("asher test2");
        binding.setMyList(list);
    }

    private void initUI() {
        binding.tvName.setBackgroundColor(Color.BLUE);
    }
}
