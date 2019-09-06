package com.holike.titlebar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import galloped.xcode.widget.TitleBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TitleBar titleBar = findViewById(R.id.titleBar);
        titleBar.setTitleTextSize(getResources().getDimensionPixelSize(R.dimen.sp_14));
        titleBar.setTitle("你麻痹");
        titleBar.setTitleTextColor(Color.parseColor("#ff3333"));
        titleBar.inflateMenu(R.menu.menu_more);
        titleBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
//        titleBar.setTitleTextStyle(TitleBar.BOLD);
    }
}
