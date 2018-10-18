package com.android.wallpaperapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.android.wallpaperapp.R;
import com.android.wallpaperapp.adapter.CategoryImageAdapter;
import com.android.wallpaperapp.model.MainCategoryImagesModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class AllImageActivity extends AppCompatActivity {

   private String[] android_image_urls = {
            "https://api.learn2crack.com/android/images/donut.png",
            "https://api.learn2crack.com/android/images/eclair.png",
            "https://api.learn2crack.com/android/images/froyo.png",
            "https://api.learn2crack.com/android/images/ginger.png",
            "https://api.learn2crack.com/android/images/honey.png",
            "https://api.learn2crack.com/android/images/icecream.png",
            "https://api.learn2crack.com/android/images/jellybean.png",
            "https://api.learn2crack.com/android/images/kitkat.png",
            "https://api.learn2crack.com/android/images/lollipop.png",
            "https://api.learn2crack.com/android/images/marshmallow.png"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_image);
        initViews();
    }
    private void initViews() {
        RecyclerView recyclerView = findViewById(R.id.recyclerView_allimages);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(AllImageActivity.this, 2);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<MainCategoryImagesModel> mainCategoryModels = prepareData();
        CategoryImageAdapter adapter = new CategoryImageAdapter(AllImageActivity.this, mainCategoryModels);
        recyclerView.setAdapter(adapter);

    }

    private ArrayList<MainCategoryImagesModel> prepareData() {

        ArrayList<MainCategoryImagesModel> main_category_model = new ArrayList<>();

        Collections.shuffle(Arrays.asList(android_image_urls));
        for(String str: android_image_urls){
            Log.e("Array List", str);
            MainCategoryImagesModel mainCategoryModel = new MainCategoryImagesModel();
            mainCategoryModel.setCategory_image_url(str);
            main_category_model.add(mainCategoryModel);
        }
        return main_category_model;
    }

}
