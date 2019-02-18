package com.ukraine.saturn.saturntv.magazine;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.ukraine.saturn.saturntv.magazine.function.MainGetGoods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * The third active screen. Product name and standard description list.
 * FloatingActionButton go to the Internet.
 * The screen is broken into layouts.
 * To button at the bottom did not overlap the description of the goods.
 * Uses an intermediate class - mainGetGoods. Get product data.
 */

public class GoodsActivity extends AppCompatActivity {

    String[] arr_category;
    private int id_arr;
    private int id_choice_category;

    ListView list_view_specification;
    TextView name_goods;
    ImageView image;
    FloatingActionButton fab;

    private String url;
    String[] arr_naming;
    String[] arr_descriptions;

    final String ATTRIBUTE_NAMING_TEXT = "naming";
    final String ATTRIBUTE_DESCRIPTIONS_TEXT = "descriptions";

    //   private boolean isImageScaled = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        image = findViewById(R.id.imageGoods);
        list_view_specification = findViewById(R.id.goods_item);
        name_goods = findViewById(R.id.text_name);
        fab = findViewById(R.id.floatingActionButton);

        Intent intent = getIntent();
        id_arr = intent.getIntExtra("id_item_goods", id_arr);
        arr_category = intent.getStringArrayExtra("arr_category");
        id_choice_category = intent.getIntExtra("id_context_menu", id_choice_category);

        MainGetGoods mainGetGoods = new MainGetGoods(arr_category, id_arr, id_choice_category);

        arr_naming = mainGetGoods.getArr_naming();
        arr_descriptions = mainGetGoods.getArr_descriptions();
        name_goods.setText(arr_category[id_arr]);
        image.setImageResource(mainGetGoods.getImage());
        url = mainGetGoods.get_Url_Goods();
        invisible_FloatingActionButton(url);

        ArrayList<Map<String, Object>> data = new ArrayList<>(
                arr_naming.length);
        Map<String, Object> m;
        for (int i = 0; i < arr_naming.length; i++) {
            m = new HashMap<>();
            m.put(ATTRIBUTE_NAMING_TEXT, arr_naming[i]);
            m.put(ATTRIBUTE_DESCRIPTIONS_TEXT, arr_descriptions[i]);
            data.add(m);
        }
        String[] from = {ATTRIBUTE_NAMING_TEXT, ATTRIBUTE_DESCRIPTIONS_TEXT};
        int[] to = {R.id.tvNaming, R.id.tvDescriptions};

        SimpleAdapter sAdapter = new SimpleAdapter(this, data, R.layout.list_item_goods,
                from, to);
        list_view_specification.setAdapter(sAdapter);

    }

    /**
     * If there is no product link, the button does not show
     */
    private void invisible_FloatingActionButton(String url) {
        if (url.equals("")) {

            fab.hide();
        } else {
            fab.show();
        }
    }

    public void onClickGoSite_FloatingActionButton(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
        fab.hide();
    }
}
