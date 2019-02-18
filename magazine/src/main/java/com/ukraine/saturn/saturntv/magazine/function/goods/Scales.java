package com.ukraine.saturn.saturntv.magazine.function.goods;

import com.ukraine.saturn.saturntv.magazine.R;

/**
 * when calling a class in MainGetGoods,
 * start processing the result through the constructor
 * !!!!Attention!!!!.
 * Some classes goods have two kinds of goods.
 * Made to reduce the program code.
 */
public class Scales {
    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;

    public Scales(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();
    }

    private void result() {

        arr_naming = new String[]{
                "Материал корпуса:", "Максимальный вес, кг:", "Размер платформы, мм:", "ЖК дисплей:",
                "Управление:", "Градация, г:", "Функция автоотключения:", "Тип питания:",
                "Память измерения веса:", "Дополнительные возможности:"};

        switch (arr_category[id_arr]) {
            case "ST-PS1241":
                arr_descriptions = new String[]{
                        "закаленное стекло", "150", "300x300", "Да", "электронное",
                        "100", "Да", "2 батарейки CR2032", "-", "-"};
                image = R.mipmap.scales_st_ps1241;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/napolnye_vesy/saturn_st_ps1241/";
                break;
            case "ST-PS0283":
                arr_descriptions = new String[]{
                        "закаленное стекло", "180", "-", "Да", "сенсорное",
                        "100", "-", "2 батарейки AAA", "Да",
                        "Анализатор жидкости, жировой, мышечной, костной массы"};
                image = R.mipmap.scales_st_ps0283;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/napolnye_vesy/saturn_st_ps0283/";
                break;
            case "ST-PS1242":
                arr_descriptions = new String[]{
                        "закаленное стекло", "150", "300x300", "Да", "электронное",
                        "100", "Да", "2 батарейки CR2032", "-", "-"};
                image = R.mipmap.scales_st_ps1242;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/napolnye_vesy/saturn_st_ps1242/";
                break;
            case "ST-PS1244":
                arr_descriptions = new String[]{
                        "закаленное стекло", "180", "300x300", "Да", "электронное",
                        "100", "Да", "2 батарейки CR2032", "-", "-"};
                image = R.mipmap.scales_st_ps1244;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/napolnye_vesy/saturn_st_ps1244/";
                break;
            case "ST-PS0285":
                arr_descriptions = new String[]{"бамбук", "180", "300x300", "Да", "электронное",
                        "100", "Да", "2 батарейки AAA", "-", "-"};
                image = R.mipmap.scales_st_ps0285;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/napolnye_vesy/saturn_st_ps0285/";
                break;
            case "ST-PS1243":
                arr_descriptions = new String[]{
                        "закаленное стекло", "180", "300x300", "Да", "электронное",
                        "100", "Да", "2 батарейки CR2032", "-", "-"};
                image = R.mipmap.scales_st_ps1243;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/napolnye_vesy/saturn_st_ps1243/";
                break;
            case "ST-PS0299":
                arr_descriptions = new String[]{
                        "закаленное стекло", "180", "300x300", "Да", "Сенсорное",
                        "100", "Да", "-", "Да", "-"};
                image = R.mipmap.scales_st_ps0299;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/napolnye_vesy/saturn_st_ps0299/";
                break;
            case "ST-PS1246":
                arr_descriptions = new String[]{
                        "закаленное стекло", "150", "300x300", "Да", "Сенсорное",
                        "100", "Да", "батарейка CR2032", "-", "-"};
                image = R.mipmap.scales_st_ps1246;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/napolnye_vesy/saturn_st_ps1246/";
                break;
            case "ST-PS0296":
                arr_descriptions = new String[]{
                        "закаленное стекло", "150", "300x300", "Да", "Сенсорное",
                        "100", "Да", "батарейка CR2032", "-", "-"};
                image = R.mipmap.scales_st_ps0296;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/napolnye_vesy/saturn_st_ps0296/";
                break;
            case "ST-PS0293":
                arr_descriptions = new String[]{"закаленное стекло", "180", "-", "Да", "-",
                        "100", "Да", "батарейка CR2032", "-", "-"};
                image = R.mipmap.scales_st_ps0293;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/napolnye_vesy/saturn_st_ps0293/";
                break;
            case "ST-PS1251":
                arr_descriptions = new String[]{"закаленное стекло", "150", "300x300", "Да", "-",
                        "100", "Да", "2 батарейки CR2032", "-", "-"};
                image = R.mipmap.scales_st_ps1251;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/napolnye_vesy/saturn_st_ps1251/";
                break;
            case "ST-PS1247 White":
                arr_descriptions = new String[]{
                        "закаленное стекло", "180", "300x300", "Да", "электронное",
                        "100", "Да", "батарейка CR2032", "-", "-"};
                image = R.mipmap.scales_st_ps1247_white;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/napolnye_vesy/saturn_st_ps1247_white/";
                break;
            case "ST-PS1247 Red":
                arr_descriptions = new String[]{
                        "закаленное стекло", "180", "300x300", "Да", "электронное",
                        "100", "Да", "батарейка CR2032", "-", "-"};
                image = R.mipmap.scales_st_ps1247_red;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/napolnye_vesy/saturn_st_ps1247_red/";
                break;
            case "ST-PS1249":
                arr_descriptions = new String[]{
                        "закаленное стекло", "180", "300x300", "Да", "электронное",
                        "100", "Да", "батарейка CR2032", "-", "-"};
                image = R.mipmap.scales_st_ps1249;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/napolnye_vesy/saturn_st_ps1249/";
                break;
            case "ST-PS1247":
                arr_descriptions = new String[]{
                        "закаленное стекло", "180", "300x300", "Да", "электронное",
                        "100", "Да", "батарейка CR2032", "-", "-"};
                image = R.mipmap.scales_st_ps1247;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/napolnye_vesy/saturn_st_ps1247/";
                break;
            case "ST-PS1247 Black":
                arr_descriptions = new String[]{
                        "закаленное стекло", "180", "300x300", "Да", "электронное",
                        "100", "Да", "батарейка CR2032", "-", "-"};
                image = R.mipmap.scales_st_ps1247_black;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/napolnye_vesy/saturn_st_ps1247_black/";
                break;
            case "ST-PS0282 Flower":
                arr_descriptions = new String[]{
                        "закаленное стекло", "180", "300x300", "Да", "электронное",
                        "100", "Да", "батарейка CR2032", "-", "-"};
                image = R.mipmap.scales_st_ps0282_flower;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/napolnye_vesy/saturn_st_ps0282_flower/";
                break;
            case "ST-PS0282 Zebra":
                arr_descriptions = new String[]{
                        "закаленное стекло", "180", "300x300", "Да", "электронное",
                        "100", "Да", "батарейка CR2032", "-", "-"};
                image = R.mipmap.scales_st_ps0282_zebra;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/napolnye_vesy/saturn_st_ps0282_zebra/";
                break;
            case "ST-PS0282GR":
                arr_descriptions = new String[]{
                        "закаленное стекло", "180", "300x300", "Да", "электронное",
                        "100", "Да", "батарейка CR2032", "-", "-"};
                image = R.mipmap.scales_st_ps0282gr;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/napolnye_vesy/saturn_st_ps0282gr/";
                break;
            case "ST-PS0282HR":
                arr_descriptions = new String[]{
                        "закаленное стекло", "180", "300x300", "Да", "электронное",
                        "100", "Да", "батарейка CR2032", "-", "-"};
                image = R.mipmap.scales_st_ps0282hr;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/napolnye_vesy/saturn_st_ps0282hr/";
                break;
            case "ST-PS0282LR":
                arr_descriptions = new String[]{
                        "закаленное стекло", "180", "300x300", "Да", "электронное",
                        "100", "Да", "батарейка CR2032", "-", "-"};
                image = R.mipmap.scales_st_ps0282lr;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/napolnye_vesy/saturn_st_ps0282lr/";
                break;
            case "ST-PS0294 Pink":
                arr_descriptions = new String[]{
                        "закаленное стекло", "180", "300x300", "Да", "-",
                        "100", "Да", "батарейка CR2032", "-", "-"};
                image = R.mipmap.scales_st_ps0294_pink;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/napolnye_vesy/saturn_st_ps0294_pink/";
                break;
            case "ST-PS0294 Black":
                arr_descriptions = new String[]{
                        "закаленное стекло", "180", "300x300", "Да", "-",
                        "100", "Да", "батарейка CR2032", "-", "-"};
                image = R.mipmap.scales_st_ps0294_black;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/napolnye_vesy/saturn_st_ps0294_black/";
                break;
            case "ST-PS0292":
                arr_descriptions = new String[]{
                        "закаленное стекло", "180", "300x300", "Да", "-",
                        "100", "Да", "батарейка CR2032", "-", "-"};
                image = R.mipmap.scales_st_ps0292;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/napolnye_vesy/saturn_st_ps0292/";
                break;
            case "ST-PS0245":
                arr_descriptions = new String[]{"закаленное стекло", "180", "-", "Да", "-",
                        "100", "Да", "батарейка CR2032", "-", "-"};
                image = R.mipmap.scales_st_ps0245;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/napolnye_vesy/saturn_st_ps0245/";
                break;
            default:
                break;
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
