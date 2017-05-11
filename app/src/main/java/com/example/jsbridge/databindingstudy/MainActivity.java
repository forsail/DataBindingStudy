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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new ObservableUser2();
        user.name.set("asher");
        binding.setUser(user);
        binding.tvName.setBackgroundColor(Color.BLUE);
        binding.tvMobile.setText("asher2");
        binding.tvMobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.name.set("test");
                Toast.makeText(MainActivity.this, user.name.get(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
