package com.ukraine.saturn.saturntv.magazine;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.ukraine.saturn.saturntv.magazine.function.ChoiceContextMenu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**  List of supply category of the goods. Second active screen
 * A standard adapter is used -  SimpleAdapter. Pictures are reduced for fast scrolling.*/
public class ListCategoryActivity extends AppCompatActivity {

    private int id_choice_category;
    ListView listView;

    final String ATTRIBUTE_TITLES_TEXT = "naming";
    final String ATTRIBUTE_IMAGE = "image";
    private String [] arr_titles;
    int[] arr_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_list);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        listView = findViewById(R.id.list_item);

        Intent intent = getIntent();
        id_choice_category = intent.getIntExtra("id_context_menu", id_choice_category);

        ChoiceContextMenu choiceContextMenu = new ChoiceContextMenu();
        arr_titles = choiceContextMenu.get_Arr_category_choice_list(id_choice_category);
        arr_image = choiceContextMenu.get_Image_arr_goods_list();

        ArrayList<Map<String, Object>> data = new ArrayList<>(
                arr_titles.length);
        Map<String, Object> m;
        for (int i = 0; i < arr_titles.length; i++) {
            m = new HashMap<>();
            m.put(ATTRIBUTE_TITLES_TEXT, arr_titles[i]);
            m.put(ATTRIBUTE_IMAGE, arr_image[i]);
            data.add(m);
        }
        String[] from = {ATTRIBUTE_TITLES_TEXT, ATTRIBUTE_IMAGE};
        int[] to = {R.id.tx_list_arr_titles, R.id.img_list_image};

        SimpleAdapter sAdapter = new SimpleAdapter(this, data, R.layout.list_item_category,
                from, to);
        listView.setAdapter(sAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(ListCategoryActivity.this, GoodsActivity.class);
                intent.putExtra("id_item_goods", position);
                intent.putExtra("arr_category", arr_titles);
                intent.putExtra("id_context_menu", id_choice_category);
                startActivity(intent);

            }
        });
    }
}
