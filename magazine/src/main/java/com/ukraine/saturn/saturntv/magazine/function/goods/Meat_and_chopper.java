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
public class Meat_and_chopper {

    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;


    public Meat_and_chopper(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();

    }

    private void result() {

        if (Arrays.equals(arr_category, NAME_ARR_MEAT_ALL)) {
            arr_naming = new String[]{
                    "Мощность, Вт:", "Материал корпуса:", "Перфорированные диски, шт:",
                    "Переключатель реверсивного движения:", "Моделирующая насадка для фарша:",
                    "Насадка для кеббе и сосисок:", "Терки для овощей:",
                    "Насадка для томатного сока:", "Дополнительные свойства:",
                    "Защита от перегрева:"};
            switch (arr_category[id_arr]) {
                case "ST-FP1098":
                    arr_descriptions = new String[]{
                            "1600", "нерж. Сталь", "3", "Да", "Да", "Да", "Да", "Да",
                            "насадка для дерунов", "Да"};
                    image = R.mipmap.meat_st_fp1098;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektromyasorubki/saturn_st_fp1098/";
                    break;
                case "ST-FP0094":
                    arr_descriptions = new String[]{
                            "1600", "пластик", "3", "Да", "-", "-", "Да", "Да",
                            "-", "Да"};
                    image = R.mipmap.meat_st_fp0094;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektromyasorubki/saturn_st_fp0094/";
                    break;
                case "ST-FP7093-T NEW":
                    arr_descriptions = new String[]{
                            "1200", "пластик", "3", "Да", "Да", "Да", "-", "Да",
                            "-", "Да"};
                    image = R.mipmap.meat_st_fp7093_t_new;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektromyasorubki/saturn_st_fp7093_t_new/";
                    break;
                case "ST-FP0098 D":
                    arr_descriptions = new String[]{
                            "1400", "пластик", "3", "Да", "Да", "Да", "-", "Да",
                            "-", "Да"};
                    image = R.mipmap.meat_st_fp0098_d;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektromyasorubki/saturn_st_fp0098_d/";
                    break;
                case "ST-FP0090":
                    arr_descriptions = new String[]{
                            "1600", "пластик", "2", "Да", "Да", "Да", "-", "-",
                            "-", "Да"};
                    image = R.mipmap.meat_st_fp0090;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektromyasorubki/saturn_st_fp0090/";
                    break;
                case "ST-FP0091 D":
                    arr_descriptions = new String[]{
                            "1600", "пластик", "3", "Да", "Да", "Да", "-", "-",
                            "-", "Да"};
                    image = R.mipmap.meat_st_fp0091_d;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektromyasorubki/saturn_st_fp0091_d/";
                    break;
                case "ST-FP7093":
                    arr_descriptions = new String[]{
                            "1200", "пластик", "3", "Да", "Да", "Да", "-", "-",
                            "-", "Да"};
                    image = R.mipmap.meat_st_fp7093;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektromyasorubki/saturn_st_fp7093/";
                    break;
                case "ST-FP0089 D":
                    arr_descriptions = new String[]{
                            "1400", "пластик", "3", "Да", "Да", "Да", "-", "-",
                            "-", "Да"};
                    image = R.mipmap.meat_st_fp0089_d;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektromyasorubki/saturn_st_fp0089_d/";
                    break;
                case "ST-FP8096":
                    arr_descriptions = new String[]{
                            "1200", "пластик", "3", "Да", "Да", "Да", "-", "-",
                            "-", "Да"};
                    image = R.mipmap.meat_st_fp8096;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektromyasorubki/saturn_st_fp8096/";
                    break;
                case "ST-FP8090":
                    arr_descriptions = new String[]{
                            "1200", "пластик", "3", "Да", "Да", "Да", "-", "-",
                            "-", "Да"};
                    image = R.mipmap.meat_st_fp8090;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektromyasorubki/saturn_st_fp8090/";
                    break;
                case "ST-FP8090-T":
                    arr_descriptions = new String[]{
                            "1200", "пластик", "3", "Да", "Да", "Да", "-", "Да",
                            "-", "Да"};
                    image = R.mipmap.meat_st_fp8090_t;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektromyasorubki/saturn_st_fp8090_t/";
                    break;
                case "ST-FP1098 Black":
                    arr_descriptions = new String[]{
                            "1600", "нерж. Сталь", "3", "Да", "Да", "Да", "Да", "Да",
                            "насадка для дерунов", "Да"};
                    image = R.mipmap.meat_st_fp1098_black;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektromyasorubki/saturn_st_fp1098_black/";
                    break;
                case "ST-FP0095 White":
                    arr_descriptions = new String[]{
                            "1600", "нерж. Сталь", "3", "Да", "Да", "Да", "Да", "Да",
                            "насадка для дерунов", "Да"};
                    image = R.mipmap.meat_st_fp0095_white;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektromyasorubki/saturn_st_fp0095_white/";
                    break;
                case "ST-FP0095 Black":
                    arr_descriptions = new String[]{
                            "1600", "нерж. Сталь", "3", "Да", "Да", "Да", "Да", "Да",
                            "насадка для дерунов", "Да"};
                    image = R.mipmap.meat_st_fp0095_black;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektromyasorubki/saturn_st_fp0095_black/";
                    break;
                case "ST-FP0095 WGreen":
                    arr_descriptions = new String[]{
                            "1600", "нерж. Сталь", "3", "Да", "Да", "Да", "Да", "Да",
                            "насадка для дерунов", "Да"};
                    image = R.mipmap.meat_st_fp0095_wgreen;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektromyasorubki/saturn_st_fp0095_wgreen/";
                    break;
                default:
                    break;
            }
        } else {
            //NAME_ARR_CHOPPER_ALL
            arr_naming = new String[]{"Данных нет"};
            arr_descriptions = new String[]{"Данных нет"};
            image = R.mipmap.ic_launcher_background;
            url_goods = "";

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
