package com.ukraine.saturn.saturntv.magazine.function.goods;

import com.ukraine.saturn.saturntv.magazine.R;

/**
 * when calling a class in MainGetGoods,
 * start processing the result through the constructor
 * !!!!Attention!!!!.
 * Some classes goods have two kinds of goods.
 * Made to reduce the program code.
 */
public class Kitchen_scales {
    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;


    public Kitchen_scales(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();
    }

    private void result() {

        arr_naming = new String[]{
                "Объем:", "Материал корпуса:", "Максимальный вес, кг:", "ЖК дисплей:",
                "Градация, г:", "Материал чаши:", "Шкала уровня воды:", "Индикатор перегрузки:",
                "Индикатор низкого уровня заряда батареи:", "Съемная чаша:", "Тип питания:",
                "Сенсорное управление:", "Функция автоотключения:"};

        switch (arr_category[id_arr]) {
            case "ST-KS7800":
                arr_descriptions = new String[]{
                        "1,2", "пластик", "2", "Да", "1", "пластик", "Да", "Да",
                        "Да", "Да", "2 батарейки AAA", "-", "-"};
                image = R.mipmap.kitchen_scales_st_ks7800;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kukhonnye_vesy/saturn_st_ks7800/";
                break;
            case "ST-KS7803 Green":
                arr_descriptions = new String[]{
                        "-", "пластик", "5", "Да", "1", "пластик", "Да", "Да",
                        "Да", "Да", "2 батарейки AAA", "Да", "-"};
                image = R.mipmap.kitchen_scales_st_ks7803_green;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kukhonnye_vesy/saturn_st_ks7803_green/";
                break;
            case "ST-KS7808":
                arr_descriptions = new String[]{
                        "-", "пластик", "5", "Да", "1", "пластик", "Да", "Да",
                        "Да", "Да", "2 батарейки AAA", "Да", "-"};
                image = R.mipmap.kitchen_scales_st_ks7808;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kukhonnye_vesy/saturn_st_ks7808/";
                break;
            case "ST-KS7813":
                arr_descriptions = new String[]{
                        "-", "закаленное стекло", "5", "-", "1", "-", "-", "Да",
                        "Да", "-", "батарейка CR2032", "Да", "Да"};
                image = R.mipmap.kitchen_scales_st_ks7813;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kukhonnye_vesy/saturn_st_ks7813/";
                break;
            case "ST-KS7814":
                arr_descriptions = new String[]{
                        "-", "закаленное стекло", "5", "-", "1", "-", "-", "Да",
                        "Да", "-", "батарейка CR2032", "Да", "Да"};
                image = R.mipmap.kitchen_scales_st_ks7814;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kukhonnye_vesy/saturn_st_ks7814/";
                break;
            case "ST-KS7819":
                arr_descriptions = new String[]{
                        "-", "закаленное стекло", "5", "-", "1", "-", "-", "Да",
                        "Да", "-", "2 батарейки ААА", "Да", "Да"};
                image = R.mipmap.kitchen_scales_st_ks7819;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kukhonnye_vesy/saturn_st_ks7819/";
                break;
            case "ST-KS7821":
                arr_descriptions = new String[]{
                        "-", "закаленное стекло", "5", "-", "1", "-", "-", "Да",
                        "Да", "-", "2 батарейки ААА", "Да", "Да"};
                image = R.mipmap.kitchen_scales_st_ks7821;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kukhonnye_vesy/saturn_st_ks7821/";
                break;
            case "ST-KS7816":
                arr_descriptions = new String[]{
                        "-", "закаленное стекло", "5", "-", "1", "-", "-", "Да",
                        "Да", "-", "2 батарейки ААА", "Да", "Да"};
                image = R.mipmap.kitchen_scales_st_ks7816;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kukhonnye_vesy/saturn_st_ks7816/";
                break;
            case "ST-KS7817":
                arr_descriptions = new String[]{
                        "-", "закаленное стекло", "5", "-", "1", "-", "-", "Да",
                        "Да", "-", "2 батарейки ААА", "Да", "Да"};
                image = R.mipmap.kitchen_scales_st_ks7817;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kukhonnye_vesy/saturn_st_ks7817/";
                break;
            case "ST-KS7811":
                arr_descriptions = new String[]{
                        "-", "закаленное стекло", "5", "-", "1", "-", "-", "Да",
                        "Да", "-", "2 батарейки ААА", "Да", "Да"};
                image = R.mipmap.kitchen_scales_st_ks7811;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kukhonnye_vesy/saturn_st_ks7811/";
                break;
            case "ST-KS7823":
                arr_descriptions = new String[]{
                        "-", "закаленное стекло", "5", "-", "1", "-", "-", "Да",
                        "Да", "-", "2 батарейки ААА", "Да", "Да"};
                image = R.mipmap.kitchen_scales_st_ks7823;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kukhonnye_vesy/saturn_st_ks7823/";
                break;
            case "ST-KS7825":
                arr_descriptions = new String[]{
                        "-", "закаленное стекло", "5", "-", "1", "-", "-", "Да",
                        "Да", "-", "2 батарейки ААА", "Да", "Да"};
                image = R.mipmap.kitchen_scales_st_ks7825;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kukhonnye_vesy/saturn_st_ks7825/";
                break;
            case "ST-KS7827":
                arr_descriptions = new String[]{
                        "-", "закаленное стекло", "5", "-", "1", "-", "-", "Да",
                        "Да", "-", "2 батарейки ААА", "Да", "Да"};
                image = R.mipmap.kitchen_scales_st_ks7827;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kukhonnye_vesy/saturn_st_ks7827/";
                break;
            case "ST-KS7829":
                arr_descriptions = new String[]{
                        "-", "закаленное стекло", "5", "-", "1", "-", "-", "Да",
                        "Да", "-", "2 батарейки ААА", "Да", "Да"};
                image = R.mipmap.kitchen_scales_st_ks7829;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kukhonnye_vesy/saturn_st_ks7829/";
                break;
            case "ST-KS7235_Red":
                arr_descriptions = new String[]{
                        "-", "закаленное стекло", "5", "Да", "1", "-", "Да", "Да",
                        "Да", "-", "3 батарейки ААА", "Да", "Да"};
                image = R.mipmap.kitchen_scales_st_ks7235_red;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kukhonnye_vesy/saturn_st_ks7235_red/";
                break;
            case "ST-KS7235_Brown":
                arr_descriptions = new String[]{
                        "-", "закаленное стекло", "5", "Да", "1", "-", "Да", "Да",
                        "Да", "-", "3 батарейки ААА", "Да", "Да"};
                image = R.mipmap.kitchen_scales_st_ks7235_brown;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kukhonnye_vesy/saturn_st_ks7235_brown/";
                break;
            case "ST-KS7235_Black":
                arr_descriptions = new String[]{
                        "-", "закаленное стекло", "5", "Да", "1", "-", "Да", "Да",
                        "Да", "-", "3 батарейки ААА", "Да", "Да"};
                image = R.mipmap.kitchen_scales_st_ks7235_black;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kukhonnye_vesy/saturn_st_ks7235_black/";
                break;
            case "ST-KS7235":
                arr_descriptions = new String[]{
                        "-", "закаленное стекло", "5", "Да", "1", "-", "Да", "Да",
                        "Да", "-", "3 батарейки ААА", "Да", "Да"};
                image = R.mipmap.kitchen_scales_st_ks7235;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kukhonnye_vesy/saturn_st_ks7235/";
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
