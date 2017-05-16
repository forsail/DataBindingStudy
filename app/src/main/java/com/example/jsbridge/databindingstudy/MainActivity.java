package com.example.jsbridge.databindingstudy;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.jsbridge.databindingstudy.databinding.ActivityMainBinding;

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
    }

    private void initUI() {
        binding.tvName.setBackgroundColor(Color.BLUE);
        binding.tvMobile.setText("asher2");
    }
}
