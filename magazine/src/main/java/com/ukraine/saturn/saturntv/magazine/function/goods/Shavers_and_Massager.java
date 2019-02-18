package com.ukraine.saturn.saturntv.magazine.function.goods;

import com.ukraine.saturn.saturntv.magazine.R;

import java.util.Arrays;

import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.*;

/**
 * when calling a class in MainGetGoods,
 * start processing the result through the constructor
 * !!!!Attention!!!!.
 * Some classes goods have two kinds of goods.
 * Made to reduce the program code.
 */
public class Shavers_and_Massager {

    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;


    public Shavers_and_Massager(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();

    }

    private void result() {

        if (Arrays.equals(arr_category, NAME_ARR_SHAVERS_ALL)) {
            arr_naming = new String[]{
                    "Мощность, Вт:", "Бритвенные головки:", "Плавающие лезвия:", "Триммер:",
                    "Водонепроницаемый корпус:", "Время зарядки, ч:",
                    "Время непрерывной работы, мин:", ":"};
            switch (arr_category[id_arr]) {
                case "ST-HC7395":
                    arr_descriptions = new String[]{
                            "4", "3", "Да", "Да", "Да", "2", "90", "щеточка, зарядка"};
                    image = R.mipmap.shavers_st_hc7395;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/britvy/saturn_st_hc7395/";
                    break;
                case "ST-HC7396":
                    arr_descriptions = new String[]{
                            "3", "4", "Да", "Да", "Да", "5", "60", "щеточка, зарядка, чехол"};
                    image = R.mipmap.shavers_st_hc7396;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/britvy/saturn_st_hc7396/";
                    break;
                case "ST-HC7391":
                    arr_descriptions = new String[]{
                            "2.5", "3", "Да", "Да", "Да", "8", "45", "щеточка, зарядка"};
                    image = R.mipmap.shavers_st_hc7391;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/britvy/saturn_st_hc7391/";
                    break;
                case "ST-HC7397":
                    arr_descriptions = new String[]{
                            "2.5", "3", "Да", "Да", "Да", "8", "45", "щеточка, зарядка"};
                    image = R.mipmap.shavers_st_hc7397;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/britvy/saturn_st_hc7397/";
                    break;
                case "ST-HC8018_black":
                    arr_descriptions = new String[]{
                            "2.5", "1", "-", "-", "Да", "8", "45", "щеточка, дополнительная бритвенная сеточка"};
                    image = R.mipmap.shavers_st_hc8018_black;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/britvy/saturn_st_hc8018_black/";
                    break;
                case "ST-HC7393":
                    arr_descriptions = new String[]{
                            "3", "2", "-", "Да", "Да", "8", "45", "щеточка, зарядка чехол"};
                    image = R.mipmap.shavers_st_hc7393;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/britvy/saturn_st_hc7393/";
                    break;
                case "ST-HC7393 New":
                    arr_descriptions = new String[]{"3", "2", "-", "Да", "Да", "8", "30", "щеточка"};
                    image = R.mipmap.shavers_st_hc7393_new;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/britvy/saturn_st_hc7393_new/";
                    break;
                case "ST-HC7390":
                    arr_descriptions = new String[]{"2", "2", "-", "Да", "Да", "8", "30", "щеточка"};
                    image = R.mipmap.shavers_st_hc7390;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/britvy/saturn_st_hc7390/";
                    break;
                case "ST-HC7398":
                    arr_descriptions = new String[]{"3", "3", "Да", "Да", "Да", "8", "45", "щеточка"};
                    image = R.mipmap.shavers_st_hc7398;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/britvy/saturn_st_hc7398/";
                    break;
                case "ST-HC7399":
                    arr_descriptions = new String[]{"3", "3", "Да", "Да", "-", "8", "45", "щеточка"};
                    image = R.mipmap.shavers_st_hc7399;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/britvy/saturn_st_hc7399/";
                    break;
                case "ST-HC7390 grey":
                    arr_descriptions = new String[]{"2", "2", "-", "Да", "Да", "8", "30", "щеточка"};
                    image = R.mipmap.shavers_st_hc7390_grey;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/britvy/saturn_st_hc7390_grey/";
                    break;
                default:
                    break;

            }
        } else {
            //NAME_ARR_MASSAGER_ALL
            arr_naming = new String[]{"Мощность, Вт:", "Режимов работы, количество:", "Аксессуары:"};
            arr_descriptions = new String[]{"13", "3", "6 сменных массажных насадок"};
            image = R.mipmap.massager_st_bc1304;
            url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/massazhery/saturn_st_bc1304/";
        }
    }


    public String[] getArr_naming() {
        return arr_naming;
    }

    public String[] getArr_descriptions() {
        return arr_descriptions;
    }

    public int getImage() {
        return image;
    }

    public String getUrl_goods() {
        return url_goods;
    }


}
