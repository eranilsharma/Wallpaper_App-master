package com.android.wallpaperapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.android.wallpaperapp.R;
import com.android.wallpaperapp.adapter.CategoryImageAdapter;
import com.android.wallpaperapp.adapter.MainCategoryDataAdapter;
import com.android.wallpaperapp.model.MainCategoryImagesModel;

import java.util.ArrayList;

public class allImageActivity extends AppCompatActivity {

    String Category;
    private final String android_image_urls[] = {
            "https://lh3.googleusercontent.com/qiwFYWAuRGZbxt-b6oxZ7hcjF3tY-DcXhzEFmf-Wc9YJY_8PckGjLqTJZmbQTi872-83xT5CEBFaH0vC9rsJPgdTogh-7kQJaTsvitmjJdyRUcglx3MX5T3quaOBEHLi5d_mNFVo-6Xcj-xVYdLYONCkBSO--k3XngjSe3Xt5n_W1MbqRQ7j7VRvgM2GC6nS4UAP8pHKdNddIrscyE7FZQ0zcPP8MT5uus9X7_zTkSyWEEA1kw9Zk1RS_Q01Q5dKJ3WZAH6mUP6DEgWcD9rqViU2xiJNIZVGu3niw1wXN3pqLvK3Rz_j0-qrZwAxG7nNuv2L5lkmi_6D1oZr6PgjvMx2D01iNGVOosNWcBuPkqrsC64Opr-tOILbWyP7yMEctfggTvcM0BTANlmnRvG7WNmZGn02XhlWFSiA_RpaElpCQZs8TmD1u17tgftAYAkbsvNAXI7yZ9jk7J-FqPh2JJyHL6pcLjtMw3LuC1bWrPCbYYwelvbkBTPyYiFNr136kHtQrc8UkdV2NfOY1TraPqre8IFtgS9iV5RPeFlb6xkyddO6X3Opstu0eemkm6eKwgl42RCNdqsQw4DpVVYuNU1re6m3C0OLTf2S0ttpw_3oQqBt83p-RwQRKi7WohlWJq_mHWh8kZnNE-Q7Tn6RKcrAaYYqZy4=w433-h769-no",
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

    private final String android_image_urls2[] = {
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
        Intent intent = getIntent();
        if (intent != null) {
            Category = intent.getStringExtra("category");
        } else {
            Toast.makeText(allImageActivity.this, "No images Found", Toast.LENGTH_SHORT).show();
        }
        initViews();
    }

    private void initViews() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView_allimages);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(allImageActivity.this, 2);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<MainCategoryImagesModel> mainCategoryModels = prepareData();
        CategoryImageAdapter adapter = new CategoryImageAdapter(allImageActivity.this, mainCategoryModels);
        recyclerView.setAdapter(adapter);

    }

    private ArrayList<MainCategoryImagesModel> prepareData() {

        ArrayList<MainCategoryImagesModel> main_category_model = new ArrayList<>();
        if (Category.equals("Donut")) {
            for (int i = 0; i < android_image_urls.length; i++) {
                MainCategoryImagesModel mainCategoryModel = new MainCategoryImagesModel();
                //mainCategoryModel.setCategory_name(main_category_model_names[i]);
                mainCategoryModel.setCategory_image_url(android_image_urls[i]);
                main_category_model.add(mainCategoryModel);
            }
        } else if (Category.equals("Eclair")) {
            for (int i = 0; i < android_image_urls2.length; i++) {
                MainCategoryImagesModel mainCategoryModel = new MainCategoryImagesModel();
                //mainCategoryModel.setCategory_name(main_category_model_names[i]);
                mainCategoryModel.setCategory_image_url(android_image_urls2[i]);
                main_category_model.add(mainCategoryModel);
            }

        } else if (Category.equals("Froyo")) {
            for (int i = 0; i < android_image_urls2.length; i++) {
                MainCategoryImagesModel mainCategoryModel = new MainCategoryImagesModel();
                //mainCategoryModel.setCategory_name(main_category_model_names[i]);
                mainCategoryModel.setCategory_image_url(android_image_urls2[i]);
                main_category_model.add(mainCategoryModel);
            }

        } else if (Category.equals("Gingerbread")) {
            for (int i = 0; i < android_image_urls2.length; i++) {
                MainCategoryImagesModel mainCategoryModel = new MainCategoryImagesModel();
                //mainCategoryModel.setCategory_name(main_category_model_names[i]);
                mainCategoryModel.setCategory_image_url(android_image_urls2[i]);
                main_category_model.add(mainCategoryModel);
            }

        } else if (Category.equals("Honeycomb")) {
            for (int i = 0; i < android_image_urls2.length; i++) {
                MainCategoryImagesModel mainCategoryModel = new MainCategoryImagesModel();
                //mainCategoryModel.setCategory_name(main_category_model_names[i]);
                mainCategoryModel.setCategory_image_url(android_image_urls2[i]);
                main_category_model.add(mainCategoryModel);
            }

        } else if (Category.equals("Ice Cream Sandwich")) {
            for (int i = 0; i < android_image_urls2.length; i++) {
                MainCategoryImagesModel mainCategoryModel = new MainCategoryImagesModel();
                //mainCategoryModel.setCategory_name(main_category_model_names[i]);
                mainCategoryModel.setCategory_image_url(android_image_urls2[i]);
                main_category_model.add(mainCategoryModel);
            }

        } else if (Category.equals("Jelly Bean")) {
            for (int i = 0; i < android_image_urls2.length; i++) {
                MainCategoryImagesModel mainCategoryModel = new MainCategoryImagesModel();
                //mainCategoryModel.setCategory_name(main_category_model_names[i]);
                mainCategoryModel.setCategory_image_url(android_image_urls2[i]);
                main_category_model.add(mainCategoryModel);
            }

        } else if (Category.equals("KitKat")) {
            for (int i = 0; i < android_image_urls2.length; i++) {
                MainCategoryImagesModel mainCategoryModel = new MainCategoryImagesModel();
                //mainCategoryModel.setCategory_name(main_category_model_names[i]);
                mainCategoryModel.setCategory_image_url(android_image_urls2[i]);
                main_category_model.add(mainCategoryModel);
            }

        } else if (Category.equals("Lollipop")) {
            for (int i = 0; i < android_image_urls2.length; i++) {
                MainCategoryImagesModel mainCategoryModel = new MainCategoryImagesModel();
                //mainCategoryModel.setCategory_name(main_category_model_names[i]);
                mainCategoryModel.setCategory_image_url(android_image_urls2[i]);
                main_category_model.add(mainCategoryModel);
            }

        } else if (Category.equals("Marshmallow")) {
            for (int i = 0; i < android_image_urls2.length; i++) {
                MainCategoryImagesModel mainCategoryModel = new MainCategoryImagesModel();
                //mainCategoryModel.setCategory_name(main_category_model_names[i]);
                mainCategoryModel.setCategory_image_url(android_image_urls2[i]);
                main_category_model.add(mainCategoryModel);
            }

        }
        return main_category_model;
    }

}
