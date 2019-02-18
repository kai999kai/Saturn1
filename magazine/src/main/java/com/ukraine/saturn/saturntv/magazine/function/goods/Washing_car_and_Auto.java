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
public class Washing_car_and_Auto {


    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;


    public Washing_car_and_Auto(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();

    }

    private void result() {

        if (Arrays.equals(arr_category, NAME_ARR_WASHING_CAR_ALL)) {
            arr_naming = new String[]{
                    "Мощность, Вт:", "Максимальная загрузка, кг:", "Режимы стирки/полоскания:",
                    "Таймер стирки:", "Габариты, см:", "Частота, Гц:", "Режимов работы, количество:"};
            switch (arr_category[id_arr]) {
                case "ST-WM1616":
                    arr_descriptions = new String[]{"200", "2,5", "Да", "Да", "37*35*63.5", "50", "2"};
                    image = R.mipmap.washing_car_st_wm1616;
                    url_goods = "http://saturn.ua/ru/catalog/stiralnye_mashiny/stiralnye_mashiny_1/saturn_st_wm1616/";
                    break;
                case "ST-WM1615":
                    arr_descriptions = new String[]{"200", "2,5", "Да", "Да", "37*35*63.5", "50", "-"};
                    image = R.mipmap.washing_car_st_wm1615;
                    url_goods = "http://saturn.ua/ru/catalog/stiralnye_mashiny/stiralnye_mashiny_1/saturn_st_wm1615/";
                    break;
                default:
                    break;
            }
        } else {
            //NAME_ARR_WASHING_AUTO_ALL
            arr_naming = new String[]{
                    "Мощность, Вт:", "Максимальная загрузка, кг:",
                    "Максимальная скорость отжима, об/мин:",
                    "Таймер, ч:", "Класс стирки:", "Быстрая стирка, мин:",
                    "Память при отключении электричества:",
                    "Барабан из нержавеющей стали:", "Блокировочный механизм:",
                    "Регулятор температуры, C:",
                    "Режимов работы, количество:", "Частота, Гц:"};
            switch (arr_category[id_arr]) {
                case "ST-WM0621":
                    arr_descriptions = new String[]{
                            "2100", "6", "1000", "24", "A", "30", "Да", "Да", "Да", "20/40/60/95",
                            "16", "50"};
                    image = R.mipmap.washing_auto_st_wm0621;
                    url_goods = "http://saturn.ua/ru/catalog/stiralnye_mashiny/stiralnye_mashiny_avtomat/saturn_st_wm0621/";
                    break;
                case "ST-WM0622":
                    arr_descriptions = new String[]{
                            "2100", "6", "800", "12", "A", "30", "Да", "Да", "Да", "20/40/60/95",
                            "13", "50"};
                    image = R.mipmap.washing_auto_st_wm0622;
                    url_goods = "http://saturn.ua/ru/catalog/stiralnye_mashiny/stiralnye_mashiny_avtomat/saturn_st_wm0622/";
                    break;
                case "ST-WM0620":
                    arr_descriptions = new String[]{
                            "2100", "6", "1000", "-", "A", "30", "Да", "Да", "Да", "20/40/60/95",
                            "10", "50"};
                    image = R.mipmap.washing_auto_st_wm0620;
                    url_goods = "http://saturn.ua/ru/catalog/stiralnye_mashiny/stiralnye_mashiny_avtomat/saturn_st_wm0620/";
                    break;
                default:
                    break;
            }
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
