package com.example.autoscrollviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;

import java.util.ArrayList;

import pl.pzienowicz.autoscrollviewpager.AutoScrollViewPager;

public class MainActivity extends AppCompatActivity {

    private AutoScrollViewPager autoScrollViewPager;
    private ArrayList<String> images = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        images.add("https://wallpaperaccess.com/full/51607.jpg");
        images.add("https://wallpaperaccess.com/full/51616.jpg");
        images.add("https://wallpaperaccess.com/full/51621.jpg");
        images.add("https://wallpaperaccess.com/full/11810.jpg");
        autoScrollViewPager = findViewById(R.id.view_pager);
        ImagesAdapter imagesAdapter = new ImagesAdapter(getApplicationContext(), images);
        autoScrollViewPager.setAdapter(imagesAdapter);
        autoScrollViewPager.setInterval(1000);
        autoScrollViewPager.setDirection(AutoScrollViewPager.Direction.RIGHT);
        autoScrollViewPager.setCycle(true);
        autoScrollViewPager.setBorderAnimation(true);
        autoScrollViewPager.setSlideBorderMode(AutoScrollViewPager.SlideBorderMode.TO_PARENT);
        autoScrollViewPager.startAutoScroll();
    }
}
