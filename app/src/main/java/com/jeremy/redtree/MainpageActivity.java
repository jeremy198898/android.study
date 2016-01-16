package com.jeremy.redtree;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainpageActivity extends AppCompatActivity
{

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);

        toolbar = (Toolbar) findViewById(R.id.toolbar_main_page_area);

        toolbar.setLogo(R.drawable.navigationbar_back);
        toolbar.setTitle("MainPage");
        setSupportActionBar(toolbar);
    }
}
